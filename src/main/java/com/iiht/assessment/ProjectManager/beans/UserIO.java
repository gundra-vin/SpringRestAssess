package com.iiht.assessment.ProjectManager.beans;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

public class UserIO {
	
	private int userid;
	
	private int projectid;
	private int taskid;
	private int empid;
	@NotBlank(message="First Name shouldn't be blank")
	private String fname;
	@NotBlank(message="Last Name shouldn't be blank")
	private String lname;
	
	public UserIO(){
		
	}
	
	public UserIO(int userid, int projectid, int taskid, int empid,
			@NotBlank(message = "First Name shouldn't be blank") String fname,
			@NotBlank(message = "Last Name shouldn't be blank") String lname) {
		super();
		this.userid = userid;
		this.projectid = projectid;
		this.taskid = taskid;
		this.empid = empid;
		this.fname = fname;
		this.lname = lname;
	}
	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public int getTaskid() {
		return taskid;
	}

	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "UserIO [userid=" + userid + ", projectid=" + projectid + ", taskid=" + taskid + ", empid=" + empid
				+ ", fname=" + fname + ", lname=" + lname + "]";
	}

}
