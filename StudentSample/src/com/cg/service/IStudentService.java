package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.StudentBean;
import com.cg.exception.StudentException;

public interface IStudentService{

	ArrayList<Integer> getId() ;

	int insertDetails(StudentBean bean) throws StudentException;

	int getTotal(String theory, String mcq, String lab);

	String getGrade(int totalmarks);

	ArrayList<StudentBean> getData() throws StudentException;

	boolean validateTheory(String theory);

	boolean validateMcq(String mcq);

	boolean validateLab(String lab);

	boolean validateTotalMarks(int totalmarks);






	
	
}
