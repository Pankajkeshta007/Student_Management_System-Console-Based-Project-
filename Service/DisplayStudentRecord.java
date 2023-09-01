package com.StudentManagement.Service;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.StudentManagement.Entity.Student;

public class DisplayStudentRecord  extends JFrame {
	private JPanel contentPane;

	static DisplayStudentRecord frame;


	public static void main(String[] args) {
		Student ss=new Student();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new DisplayStudentRecord(ss.getEmail(),ss.getPassword());
					//DisplayStudentRecord.displayStudentRecord(ss.getEmail() );
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	

	}

	public    DisplayStudentRecord( String email,String password) {
		//Code to view data in JTable
	
		List<Student> list=DatabaseConnectivity.StudentView( email,password);
		int size=list.size();
		
		String data[][]=new String[size][11];
		int row=0;
		for(Student s:list){
			data[row][0]=String.valueOf(s.getRollno());
			data[row][1]=s.getName();
			data[row][2]=s.getEmail();
			data[row][3]=s.getCourse();
			data[row][4]=String.valueOf(s.getAge());
			data[row][5]=s.getPassword();
			data[row][6]=s.getAddress();
			data[row][7]=s.getSemester();
			data[row][8]=s.getFathername();
			data[row][9]=s.getBranch();
			data[row][10]=s.getContactno();
			
			row++;
		}
		String columnNames[]={"Roll No","Name","Email","Course","Age","Password","Address","Semester","Father Name","Branch","Contact No"};
		
		JTable jt=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(jt);
		add(sp);
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 400);
}
}
