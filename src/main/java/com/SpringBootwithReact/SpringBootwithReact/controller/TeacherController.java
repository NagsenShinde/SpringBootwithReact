package com.SpringBootwithReact.SpringBootwithReact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootwithReact.SpringBootwithReact.entityclass.TeacherEntity;
import com.SpringBootwithReact.SpringBootwithReact.gblobalExceptionHandler.ResponseException;
import com.SpringBootwithReact.SpringBootwithReact.repository.TeacherRepo;

import jakarta.websocket.server.PathParam;

@RestController
public class TeacherController {
	
	ResponseException responseException = new ResponseException();
	
	@Autowired
	private TeacherRepo teacherRepo;
	

	@GetMapping("/getAllTeachersData")
	ResponseEntity<List<TeacherEntity>> getAllTeacherData()
	{ 
		 return new  ResponseEntity<>(teacherRepo.findAll(),HttpStatus.OK);	   
	}
	
	
	
    @GetMapping("getdataByuuids/")
	 public TeacherEntity getdataByuuid(@RequestParam("uuid") String uuid)
	 {
		TeacherEntity teacherEntity = teacherRepo.findByteacheruuid(uuid);
		return teacherEntity;
	 }
	
	
	
	
	@PostMapping("/addTeacher")
	public String addTeacherDataInDatabase(@RequestBody TeacherEntity teacherEntity)
	{
		teacherRepo.save(teacherEntity);
		 return " Teacher SucessFully added"; 		 
	}
	
	
	
	 @DeleteMapping("/deletedataByuuids/")
	 public String deleteTeacherByUUID(@RequestParam("uuid") String id)
	  {
	    int a = teacherRepo.deleteByteacheruuid(id);
		if(a!=0)
		{
			return "Sucessfully deleted";	
		}
		else
		{
			return "Not Exist";
		}
	 }
	 
	 
	@PutMapping("/putDataByuuid/")
	public String putDataByuuid(@RequestBody TeacherEntity teacherentity,@RequestParam("uuid") String uuid)
	{
		TeacherEntity teacherEntity1 = teacherRepo.findByteacheruuid(uuid);
		if(teacherentity.getTeacherDept()!=null)
		teacherEntity1.setTeacherDept(teacherentity.getTeacherDept());
		if(teacherentity.getTeacherName()!=null)
		teacherEntity1.setTeacherName(teacherentity.getTeacherName());
		if(teacherentity.getTeacherSubject()!=null)
		teacherEntity1.setTeacherSubject(teacherentity.getTeacherSubject());
		teacherRepo.save(teacherEntity1);
		return "Sucessfully updated data" ;
		
	}
	
}
    