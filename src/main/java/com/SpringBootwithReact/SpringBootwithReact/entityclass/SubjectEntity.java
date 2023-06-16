package com.SpringBootwithReact.SpringBootwithReact.entityclass;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="subject2")
public class SubjectEntity {
	
	@Column(name ="Student_UUID")
	private String studentuuid = UUID.randomUUID().toString(); 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="Subject_Id")
	 private int subjectId;
	 
	@Column(name ="subject_Name")
	 private String subjectName;
	 
	@Column(name ="subject_Marks")
	 private int subjectMarks;

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectMarks() {
		return subjectMarks;
	}

	public void setSubjectMarks(int subjectMarks) {
		this.subjectMarks = subjectMarks;
	}

	public String getStudentUUID() {
		return studentuuid;
	}

	public void setStudentUUID(String studentUUID) {
		this.studentuuid = studentUUID;
	}
	
	@OneToMany(cascade = {CascadeType.ALL},targetEntity = TeacherEntity.class)
	@JoinColumn(name ="Teacher_Id")
	private List<TeacherEntity> techerentity;
	
	public List<TeacherEntity> getTecherentity() {
		return techerentity;
	}
	

	public void setTecherentity(TeacherEntity techerentity) {
		if(this.techerentity == null)
		{
			 this.techerentity = new ArrayList<>();
		}
		this.techerentity.add(techerentity);
	}

	@Override
	public String toString() {
		return "SubjectEntity [studentUUID=" + studentuuid + ", subjectId=" + subjectId + ", subjectName=" + subjectName
				+ ", subjectMarks=" + subjectMarks + "]";
	}
	
	
	
}
