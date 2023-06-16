package com.SpringBootwithReact.SpringBootwithReact.entityclass;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="teacher")
public class TeacherEntity {
	
	@Column(name ="Teacher_UUID")
	private String teacheruuid = UUID.randomUUID().toString();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="Teacher_Id")
	private int teacherId;
	 
	@Column(name ="Teacher_Name")
	private String teacherName;
	
	@Column(name ="Teacher_Dept")
	private String teacherDept;
	
	@Column(name ="Teacher_Subject")
	private String teacherSubject;

	public int getTeacherId() {
	return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	
	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherDept() {
		return teacherDept;
	}

	public void setTeacherDept(String teacherDept) {
		this.teacherDept = teacherDept;
	}

	public String getTeacherSubject() {
		return teacherSubject;
	}

	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}

	public String getTeacherUUID() {
		return teacheruuid;
	}

	public void setTeacherUUID(String teacherUUID) {
		this.teacheruuid = teacherUUID;
	}

	@Override
	public String toString() {
		return "TeacherEntity [teacherUUID=" + teacheruuid + ", teacherId=" + teacherId + ", teacherName=" + teacherName
				+ ", teacherDept=" + teacherDept + ", teacherSubject=" + teacherSubject + "]";
	}

	 


}
