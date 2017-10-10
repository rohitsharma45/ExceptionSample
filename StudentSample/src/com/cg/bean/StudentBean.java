package com.cg.bean;

public class StudentBean {

	private String studentId;
	private String subject;
	private String theory;
	private String mcq;
	private String lab;
	private int totalmarks;
	private String grade;
	






	public String getStudentId() {
		return studentId;
	}







	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}







	public String getSubject() {
		return subject;
	}







	public void setSubject(String subject) {
		this.subject = subject;
	}







	public String getTheory() {
		return theory;
	}







	public void setTheory(String theory) {
		this.theory = theory;
	}







	public String getMcq() {
		return mcq;
	}







	public void setMcq(String mcq) {
		this.mcq = mcq;
	}







	public String getLab() {
		return lab;
	}







	public void setLab(String lab) {
		this.lab = lab;
	}







	public int getTotalmarks() {
		return totalmarks;
	}







	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}







	public String getGrade() {
		return grade;
	}







	public void setGrade(String grade) {
		this.grade = grade;
	}







	public StudentBean(String studentId, String subject, String theory,
			String mcq, String lab, int totalmarks, String grade) {
		super();
		this.studentId = studentId;
		this.subject = subject;
		this.theory = theory;
		this.mcq = mcq;
		this.lab = lab;
		this.totalmarks = totalmarks;
		this.grade = grade;
	}







	public StudentBean() {
	
	}







	public StudentBean(int studId, String subject_name, String total_marks,
			String grade) {
		
	}



	
	
}
