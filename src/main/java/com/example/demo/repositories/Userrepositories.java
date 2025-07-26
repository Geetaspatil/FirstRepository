package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;

@Repository
public interface Userrepositories extends JpaRepository<User, Integer>
{
//	@Query("SELECT u FROM User u WHERE u.uid = :uid AND u.pwd = :pwd")
//	public Optional<User> getUser(@Param("uid") String uid, @Param("pwd") String pwd);
//	 Optional<User> findByUidAndPassword(String uid, String pwd);
	
}



