package com.SpringBootwithReact.SpringBootwithReact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootwithReact.SpringBootwithReact.entityclass.SubjectEntity;
import com.SpringBootwithReact.SpringBootwithReact.entityclass.TeacherEntity;
import com.SpringBootwithReact.SpringBootwithReact.repository.SubjectRepo;

@RestController
public class SubjectController {
	
	@Autowired
	private SubjectRepo subjectRepo;
	
	
	@GetMapping("/getAllStudentData")
	public List<SubjectEntity> getAllStudentData()
	{
		return subjectRepo.findAll();
		
	}
    
	@GetMapping("/getStudentDataByuuids/")
	public SubjectEntity getStudentDataByuuid(@RequestParam("uuid") String uuid)
	{
		SubjectEntity subjectEntity = subjectRepo.findBystudentuuid(uuid);
		return subjectEntity;
	}	 
	
//	@GetMapping("getdataByuuids/")
//	 public TeacherEntity getdataByuuid(@RequestParam("uuid") String uuid)
//	 {
//		TeacherEntity teacherEntity = teacherRepo.findByteacheruuid(uuid);
//		return teacherEntity;
//	 }
//	
}
