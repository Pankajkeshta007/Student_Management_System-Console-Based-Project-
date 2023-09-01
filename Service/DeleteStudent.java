package com.StudentManagement.Service;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import com.StudentManagement.Entity.AdminOperationMenu;
import com.StudentManagement.Entity.Student;

public class DeleteStudent  extends JFrame{

	static DeleteStudent frame;
	private JPanel contentPane;
	private JTextField textField;
	
	private JTextField textField_3;

	private JTextField textField_9;
	JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new DeleteStudent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DeleteStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		contentPane.setBackground(Color.CYAN);
		setContentPane(contentPane);
		
		JLabel lblAddStudent = new JLabel("Delete Student");
		lblAddStudent.setForeground(Color.DARK_GRAY);
		lblAddStudent.setBackground(Color.CYAN);
		lblAddStudent.setFont(new Font("Arial Black", Font.BOLD, 30));
		
		JLabel lblName = new JLabel("Name:");
		

		
		JLabel lblRollno = new JLabel("Roll No");
		
		
		JButton btnAddStudent = new JButton("Delete student");
		btnAddStudent.setFont(new Font("Arial Black",Font.BOLD,15));
		btnAddStudent.setBackground(Color.CYAN);
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*int rollno=Integer.parseInt(textField.getText());
				String name=textField_1.getText();
				String email=textField_2.getText();
				String password=textField_3.getText();
				String branch=textField_4.getText();
				String semester=textField_5.getText();
				int age=Integer.parseInt(textField_6.getText());
				String address=textArea.getText();
				String fathername=textField_7.getText();
				String course=textField_8.getText();
				String contactno=textField_9.getText();
				
				*/
				String name=textField.getText();
				
				int rollno=Integer.parseInt(textField_3.getText());
				
				
				Student s=new Student();
				s.setName(name);
				s.setRollno(rollno);
				int status=DatabaseConnectivity.delete(s);
				
				if(status>0){
					JOptionPane.showMessageDialog(DeleteStudent.this,"Student Deleted  successfully!");
					AdminOperationMenu.main(new String[]{});
					frame.dispose();
					textField_9.setText("");textArea.setText("");
				}else{
					JOptionPane.showMessageDialog(DeleteStudent.this,"Sorry, Unable to Delete student!");
				}
			}
		});
		
		textField = new JTextField();
		textField.setColumns(10);
		
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		
		
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Arial Black",Font.BOLD,15));
		btnBack.setBackground(Color.CYAN);
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
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(142)
							.addComponent(lblAddStudent))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName)
								//.addComponent(lblCourse, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblRollno, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
								//.addComponent(lblAge, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								//.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								//.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								//.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
							.addGap(40)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								
								.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
								
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
								)))
					.addContainerGap(124, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					
					.addGap(80)
					.addComponent(btnAddStudent, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnBack)
					.addContainerGap(44, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblAddStudent)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
					
					
						.addComponent(lblRollno)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						)
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAddStudent, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBack))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
