package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//ORM -> Java(다른언어)Object -> 테이블로 매핑해주는 기술

@Data
@NoArgsConstructor //빈생성자
@AllArgsConstructor //전체생성자
@Builder //빌더 패턴
@Entity //User 클래스가 MySQL에 테이블이 생성이 된다.
//@DynamicInsert //insert 할때 null 인 필드 제외
public class User {
	
	@Id //Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //프로젝트에서 연결된 DB의 넘버링 전략을 따라간다. 오라클이면 시퀀스 mysql auto_increment
	private int id; //시퀀스 , auto_increment;
	
	@Column(nullable = false,length = 30)
	private String username;
	
	@Column(nullable = false,length = 100) //123456 => 해쉬(비밀번호 암호화)
	private String password;
	
	@Column(nullable = false,length = 50)
	private String email;
	
//	@ColumnDefault("'user'") //문자라는걸 알려줘야한다.
	@Enumerated(EnumType.STRING)//DB는 RoleType가 없다. 그래서 붙여주는 어노테이션
	private RoleType role; // Enum을 쓰는게 좋다. //ADMIN,USER
	
	@CreationTimestamp //시간이 자동 입력
	private Timestamp createDate;

}
