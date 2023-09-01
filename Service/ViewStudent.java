package com.StudentManagement.Service;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;

import com.StudentManagement.Entity.AdminOperationMenu;
import com.StudentManagement.Entity.Student;

public class ViewStudent extends JFrame {
	private JPanel contentPane;

	static ViewStudent frame;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewStudent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	
	
	}
	
	
	public ViewStudent() {
		//Code to view data in JTable
		
		
		List<Student> list=DatabaseConnectivity.view();
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
	
		Border blackline, raisedetched, loweredetched,
	       raisedbevel, loweredbevel, empty;

		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border compound;

           blackline = BorderFactory.createLineBorder(Color.black);
		compound= BorderFactory.createCompoundBorder (raisedbevel, loweredbevel);
         jt.setBorder(blackline);
        jt.setGridColor(Color.BLUE);
        jt.setBackground(Color.CYAN);
        jt.setFont(new Font("Arial ",Font.PLAIN,15));
       
		JScrollPane sp=new JScrollPane(jt);
		add(sp);
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		  /*JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminOperationMenu.main(new String[]{});
				frame.dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
		gl_contentPane.createParallelGroup(Alignment.LEADING)
		.addGroup(gl_contentPane.createSequentialGroup()
				
				.addComponent(btnBack)
				.addContainerGap(44, Short.MAX_VALUE))
		.addGroup(gl_contentPane.createSequentialGroup()
				.addContainerGap()
				)
		);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBack))
				.addContainerGap())
				);
		contentPane.setLayout(gl_contentPane);*/
	}
	
}




