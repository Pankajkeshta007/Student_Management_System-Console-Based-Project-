package com.StudentManagement.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.StudentManagement.Entity.Student;

public class DatabaseConnectivity {
	public static Connection getCon(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Management","root","12345");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(Student s){
		int status=0;
		try{
			Connection con=DatabaseConnectivity.getCon();
			PreparedStatement ps=con.prepareStatement("insert into student_data(rollno,name,email,password,branch,semester,age,address,fathername,course,contactno) values(?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1,s.getRollno());
			ps.setString(2,s.getName());
			ps.setString(3, s.getEmail());
			ps.setString(4,s.getPassword());
			ps.setString(5,s.getBranch());
			ps.setString(6,s.getSemester());
			ps.setInt(7,s.getAge());
			ps.setString(8,s.getAddress());
			ps.setString(9,s.getFathername());
			ps.setString(10,s.getCourse());
			ps.setString(11,s.getContactno());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static List<Student> view(){
		List<Student> list=new ArrayList<Student>();
		try{
			Connection con=DatabaseConnectivity.getCon();
			PreparedStatement ps=con.prepareStatement("select * from student_data");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Student s=new Student();
				s.setRollno(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setCourse(rs.getString("course"));
				//s.setRollno(rs.getInt("rollno"));
				s.setAge(rs.getInt("age"));
				s.setPassword(rs.getString("password"));
				s.setAddress(rs.getString("address"));
				s.setSemester(rs.getString("semester"));
				s.setFathername(rs.getString("fathername"));
				s.setBranch(rs.getString("branch"));
				s.setContactno(rs.getString("contactno"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
}
	public static int  update(Student s){
		int status=0;
				try{
			Connection con=DatabaseConnectivity.getCon();
			PreparedStatement ps=con.prepareStatement("update student_data set name = ?, email = ?,course = ?,age = ?,password = ?,address = ?,semester = ?,fathername = ?,branch = ?,contactno = ? where rollno = ?");
			
			
				ps.setString(1,s.getName());
				ps.setString(2, s.getEmail());
				ps.setString(3, s.getCourse());
				ps.setInt(4, s.getAge());
				ps.setString(5, s.getPassword());
				ps.setString(6,s.getAddress());
				ps.setString(7, s.getSemester());
				ps.setString(8, s.getFathername());
				ps.setString(9,s.getBranch() );
				ps.setString(10, s.getContactno());
				ps.setInt(11, s.getRollno());
				status=ps.executeUpdate();
			
			
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
}
	public static int delete(Student s){
		int status=0;
		try{
			Connection con=DatabaseConnectivity.getCon();
			PreparedStatement ps=con.prepareStatement("delete from student_data where name = ? and rollno = ?");
			ps.setString(1,s.getName());
			ps.setInt(2,s.getRollno());
			
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	public static boolean validate(String email,String password){
		boolean status=false;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from student_data where email=? and password=?");
			ps.setString(1,email);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		
		return status;
	}
	public static List<Student> StudentView( String email,String passeord) {
		List<Student> list=new ArrayList<Student>();
		try{
			Connection con=DatabaseConnectivity.getCon();
			PreparedStatement ps=con.prepareStatement("select * from student_data  where email=? and password=?" );
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Student s=new Student();
				s.setRollno(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setCourse(rs.getString("course"));
				s.setAge(rs.getInt("age"));
				s.setPassword(rs.getString("password"));
				s.setAddress(rs.getString("address"));
				s.setSemester(rs.getString("semester"));
				s.setFathername(rs.getString("fathername"));
				s.setBranch(rs.getString("branch"));
				s.setContactno(rs.getString("contactno"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
}
}
