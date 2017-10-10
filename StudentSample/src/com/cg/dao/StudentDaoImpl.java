package com.cg.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.sql.Statement;
import java.util.ArrayList;





import com.cg.bean.StudentBean;
import com.cg.dbutil.DbUtil;
import com.cg.exception.StudentException;


public class StudentDaoImpl implements IStudentDao {

	@Override
	public ArrayList<Integer> getId() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int ownerId=0;
		try{
			Connection conn=null;
			conn=DbUtil.getConnection();
			String selectQuery="SELECT student_id FROM student";
			PreparedStatement ps=conn.prepareStatement(selectQuery);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				ownerId=rs.getInt(1);
				list.add(ownerId);
			}
			}
		catch(SQLException e)
		{
			
			 e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int insertDetails(StudentBean bean) throws StudentException {
		int row=0;
		Connection conn=null;
		try{
		conn=DbUtil.getConnection();
		System.out.println(conn);
		PreparedStatement ps=conn.prepareStatement("insert into Studentscore values(?,?,?,?,?,?,?)");
		ps.setString(1, bean.getStudentId());
		ps.setString(2,bean.getSubject());
		ps.setString(3,bean.getTheory());
		ps.setString(4, bean.getMcq());
		ps.setString(5, bean.getLab());
		ps.setInt(6,bean.getTotalmarks());
		ps.setString(7,bean.getGrade());
		row=ps.executeUpdate();
		}
		catch(SQLException e)
		{
			throw new StudentException(e.getMessage());
		}
		return row;
	}

	@Override
	public ArrayList<StudentBean> getData() throws StudentException {
		Connection conn=null;
		ArrayList<StudentBean> list =new ArrayList<StudentBean>();
			try{
				conn=DbUtil.getConnection();
				String sql="Select * from Student_score";
				Statement st=conn.createStatement();
				ResultSet rs=st.executeQuery(sql);
				while(rs.next())
				{
					String studentId=rs.getString(1);
					String subject=rs.getString(2);
					String theory = rs.getString(3);
					String mcq = rs.getString(4);
					String lab = rs.getString(5);
					int totalmarks=rs.getInt(6);
					String grade=rs.getString(7);
				
					list.add(new StudentBean(studentId, subject, theory, mcq, lab, totalmarks, grade));
				}
			}
			catch(SQLException e){
				throw new StudentException(e.getMessage());
			}
		
		
		return list;
		
	}


}
