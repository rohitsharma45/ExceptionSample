package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.StudentBean;
import com.cg.dao.IStudentDao;
import com.cg.dao.StudentDaoImpl;
import com.cg.exception.StudentException;

public class StudentServiceImpl implements IStudentService {

	IStudentDao dao=new StudentDaoImpl();

	@Override
	public ArrayList<Integer> getId() {
		
		return dao.getId();
	}

	@Override
	public int insertDetails(StudentBean bean) throws StudentException {
	
		return dao.insertDetails(bean);
	}

	public int getTotal(String theory,String mcq,String lab) {
	int th=Integer.parseInt(theory);
	int mcqs=Integer.parseInt(mcq);
	int laboratory=Integer.parseInt(lab);

		 
		
		return (th+mcqs+laboratory);
	}

	@Override
	public String getGrade(int totalmarks) {
		String grade=null;
		if(totalmarks>=91 && totalmarks<=100 )
			{grade="S";}
		else if(totalmarks>=81 && totalmarks<=90)
			{grade="A";}
		else if(totalmarks>=71 && totalmarks<=80)
			{grade="B";}
		else if(totalmarks>=61 && totalmarks<=70)
			{grade="C";}
		else if(totalmarks>=51 && totalmarks<=60)
			{grade="D";}
		else if(totalmarks<=49)
			{grade="U";}
		else{
			grade="Invalid";}
		return grade;
	}

	@Override
	public ArrayList<StudentBean> getData() throws StudentException {
		
		return dao.getData();
	}

	@Override
	public boolean validateTheory(String theory) {
		int theory1=Integer.parseInt(theory);
		if(theory1<=70){
			return true;
		}
		else{
			
		return false;
		}
	}

	@Override
	public boolean validateMcq(String mcq) {
		int mcq1=Integer.parseInt(mcq);
		if(mcq1<=15){
			return true;
		}
		else{
			return false;
		}
		
	}

	@Override
	public boolean validateLab(String lab) {
		int lab1=Integer.parseInt(lab);
		if(lab1<=15){
			return true;
		}
		else{
			return false;
		}
	
	}

	@Override
	public boolean validateTotalMarks(int totalmarks) {
	if(totalmarks<=100){
		return true;
	}
	else{
		return false;
	}
	}
	
}
