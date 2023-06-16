package com.SpringBootwithReact.SpringBootwithReact.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootwithReact.SpringBootwithReact.entityclass.SubjectEntity;
import com.SpringBootwithReact.SpringBootwithReact.entityclass.TeacherEntity;

public interface SubjectRepo extends JpaRepository<SubjectEntity, Integer> {

	List<SubjectEntity> findAll();
	
	SubjectEntity findBystudentuuid(String uuid);

}
