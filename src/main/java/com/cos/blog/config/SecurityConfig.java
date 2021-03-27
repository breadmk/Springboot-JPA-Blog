package com.cos.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// Bean 등록 : 스프링 컨테이너에서 객체를 관리할 수 있게 해주는 것
// 아래 3개는 세트.
@Configuration // 빈등록(Ioc 관리)
@EnableWebSecurity //시큐리티필터 추가 = 스프링 시큐리티가 활성화가 되어있다면 그 설정은 이 파일에서 하겠다. || 시큐리티 필터가 등록이 된다.
@EnableGlobalMethodSecurity(prePostEnabled = true) // 특정 주소로 접근을 하면 권한 및 인증을 미리 체크 한다는 뜻.  
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Bean //IOC 관리 
	public BCryptPasswordEncoder encodePWD() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable() //csrf 토큰 비활성화 ( 테스트시 걸어두는게 좋음 )
			.authorizeRequests()
				.antMatchers("/","/auth/**","/js/**","/css/**","/image/**") //여기로 들어오는건
				.permitAll() //모두 다 허용
				.anyRequest() // 그렇지 않은 요청은
				.authenticated() //인증이 되어야 한다. (제한)
			.and()
				.formLogin()	// 로그인이 필요한 페이지는
				.loginPage("/auth/loginForm"); //이쪽으로 자동으로 연결해준다.
	}
}
