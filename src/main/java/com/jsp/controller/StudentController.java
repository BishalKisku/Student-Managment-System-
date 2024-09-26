package com.jsp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jsp.model.Student;

public class StudentController {
	//ArrayList<Student> listOfStudent = new ArrayList<Student>();


	public void saveStudent(Student stu) {
		
		//listOfStudent.add(s);
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db", "postgres", "root1234");
			PreparedStatement pstmt=con.prepareStatement("insert into stu values(?,?,?,?,?,?,?,?,?)");
			//
			pstmt.setInt(1, stu.getId());
			pstmt.setString(2, stu.getName());
			pstmt.setString(3, stu.getEmail());
			pstmt.setString(4, stu.getPassword());
			pstmt.setString(5,stu.getDob());
			pstmt.setString(6, stu.getGender());
			pstmt.setString(7, stu.getAddress());
			pstmt.setLong(8,stu.getMob());
			pstmt.setString(9, stu.getRelationshipstatus());
			
			//
			int n=pstmt.executeUpdate();
			//
			System.out.println(n);
			//
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void findStudentById(int stuId) {
	//	for(Student s : listOfStudent) {
		//	if(s.getId() == stuId) {
			//	System.out.println(s);
				//return s;
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db", "postgres", "root1234");
			PreparedStatement pstmt= con.prepareStatement("select*from stu where id=?");
			pstmt.setInt(1, stuId);
			//
			ResultSet rs = pstmt.executeQuery();
			//
			boolean b=rs.next();
			if(!b) {
				System.out.println("recod not found");
				
		}
			else {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getLong(8)+" "+rs.getString(9));
			}
			con.close();
			
		}
			
			catch (Exception e) {
			// TODO: handle exception
	    }
		
	
	}
	public void findAll() {
		//for(Student s:  listOfStudent) {
		//	System.out.println(s);
		//}
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db", "postgres", "root1234");
			PreparedStatement pstmt= con.prepareStatement("select*from stu ");
			ResultSet rs=pstmt.executeQuery();
			boolean z = rs.next();
			if(!z) {
				System.out.println("record not prasent");
			}
			else
			{
				do {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getLong(8)+" "+rs.getString(9));
				}while(z=rs.next());
			}
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void updateStudentById(int stuId, String newRelationshipstatus) {
		// TODO Auto-generated method stub
		//for(Student s :listOfStudent )
		//{
			//s.setRelationshipstatus(newRelationshipstatus);
			//System.out.println(s);
			//return;
		//}
		//System.out.println("record not found");
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db", "postgres", "root1234");
			PreparedStatement pstmt = con.prepareStatement("update stu set relationshipstatus=? where id =?");
			pstmt.setString(1, newRelationshipstatus);
			pstmt.setInt(2, stuId);
			//
			int n =pstmt.executeUpdate();
			if(n!=0)
			{
				System.out.println(n+"record update.. ");
			}
			else
			{
				System.out.println("record not found..");
			}
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void deleteStudentId(int stuId3) {
		// TODO Auto-generated method stub
		//Student s  = findStudentById(stuId3);
		//if(s!=null)
		//{
			//boolean b = listOfStudent.remove(s);
			//if(b==true)
			//{
			//	System.out.println("Record Deleted");
			//	return;
			//}
		//}
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db", "postgres", "root1234");
			PreparedStatement pstmt = con.prepareStatement("delete from stu where id=?");
			pstmt.setInt(1, stuId3);
			//
			int x= pstmt.executeUpdate();
			if(x!=0) {
				System.out.println(x+" record delete");
			}
			else
			{
				System.out.println("record not found..");
			}
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	}


