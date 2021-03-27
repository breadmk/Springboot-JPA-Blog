package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cos.blog.model.User;

//DAO
//자동으로 bean 등록이 된다.
//@repository 생략이 가능.
public interface UserRepository extends JpaRepository<User,Integer>{
	

}

// JPA Naming 전략
// select * from user where username =? And password =?
//User findByUsernameAndPassword(String username,String password); // 위에 쿼리가 작성됨. JPA의 Naming 전략

//@Query(value = "select * from user where username =?1 And password =?2",nativeQuery = true)
//User login(String username, String password);
