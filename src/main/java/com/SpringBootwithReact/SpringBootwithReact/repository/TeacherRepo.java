package com.SpringBootwithReact.SpringBootwithReact.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootwithReact.SpringBootwithReact.entityclass.TeacherEntity;

import jakarta.transaction.Transactional;

@Repository
public interface TeacherRepo extends JpaRepository<TeacherEntity, Integer>{

	List<TeacherEntity> findAll();
	
	TeacherEntity findByteacheruuid(String id);

	@Transactional
	int deleteByteacheruuid(String id);
    
	 
}
