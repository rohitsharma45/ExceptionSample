package com.cg.dao;

import java.util.ArrayList;

import com.cg.bean.StudentBean;
import com.cg.exception.StudentException;

public interface IStudentDao {

	ArrayList<Integer> getId();

	int insertDetails(StudentBean bean) throws StudentException;

	ArrayList<StudentBean> getData() throws StudentException;

}
