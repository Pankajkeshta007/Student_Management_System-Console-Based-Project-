package com.StudentManagement.Entity;


import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import com.StudentManagement.Controller.MainMenu;
import com.StudentManagement.Service.AddStudent1;
import com.StudentManagement.Service.DeleteStudent;
import com.StudentManagement.Service.UpdateStudent;
import com.StudentManagement.Service.ViewStudent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class AdminOperationMenu extends JFrame {
	static AdminOperationMenu frame;
	private JPanel contentPane;
	JScrollPane sp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AdminOperationMenu();
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
	public AdminOperationMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.CYAN);
		setContentPane(contentPane);
		
		JLabel lblAdminSection = new JLabel("Admin Section");
		lblAdminSection.setForeground(Color.DARK_GRAY);
		lblAdminSection.setFont(new Font("Tahoma", Font.BOLD, 35));
		
		JButton btnAddAccountant = new JButton("Add Student");
		btnAddAccountant.setBackground(Color.CYAN);
		btnAddAccountant.setFont(new Font("Arial Black",Font.BOLD,15));
		btnAddAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent1.main(new String[]{});
				frame.dispose();
			}
		});
		
		JButton btnViewAccountant = new JButton("View Student");
		btnViewAccountant.setBackground(Color.CYAN);
		btnViewAccountant.setFont(new Font("Arial Black",Font.BOLD,15));
		btnViewAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewStudent.main(new String[]{});
				frame.dispose();
			}
		});
		JButton btnUpdateStudent= new JButton("Update Student");
		btnUpdateStudent.setBackground(Color.CYAN);
		btnUpdateStudent.setFont(new Font("Arial Black",Font.BOLD,15));
		btnUpdateStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateStudent.main(new String[]{});
				frame.dispose();
			}
		});
		JButton btnDeleteStudent= new JButton("Delete Student");
		btnDeleteStudent.setBackground(Color.CYAN);
		btnDeleteStudent.setFont(new Font("Arial Black",Font.BOLD,15));
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudent.main(new String[]{});
			}
		});
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(Color.CYAN);
		btnLogout.setFont(new Font("Arial Black",Font.BOLD,15));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.main(new String[]{});
				frame.dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(161)
							.addComponent(lblAdminSection))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(149)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnViewAccountant, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
								
								.addComponent(btnAddAccountant, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnUpdateStudent, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnDeleteStudent, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)

								.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(136, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblAdminSection)
					.addGap(29)
					.addComponent(btnAddAccountant, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnViewAccountant, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnUpdateStudent, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnDeleteStudent, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(59, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}

