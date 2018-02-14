package com.java.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class View extends JFrame{

	private static final long serialVersionUID = 8045806984811942136L;
	private JLabel name, password;
	private JTextField jName;
	private JPasswordField jPassword;
	private JButton okButton;
	private LoginListener loginListener;
	
	public View(){
		super();
		name= new JLabel("Enter name");
		password= new JLabel("Enter Password");
		jName= new JTextField(10);
		jPassword= new JPasswordField(10);
		okButton= new JButton("OK");
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints constraints= new GridBagConstraints();
		constraints.anchor= GridBagConstraints.FIRST_LINE_START;
		constraints.fill= GridBagConstraints.NONE;
		constraints.gridx= 1;
		constraints.gridy= 1;
		constraints.weightx= 1.0;
		constraints.weighty= 1.0;
		constraints.insets= new Insets(50,0,0,5);
		this.add(name, constraints);
		
		constraints.anchor= GridBagConstraints.FIRST_LINE_END;
		constraints.fill= GridBagConstraints.NONE;
		constraints.gridx= 2;
		constraints.gridy= 1;
		constraints.weightx= 1.0;
		constraints.weighty= 1.0;
		constraints.insets= new Insets(50,0,0,10);
		this.add(jName, constraints);
		
		constraints.anchor= GridBagConstraints.LINE_START;
		constraints.fill= GridBagConstraints.NONE;
		constraints.gridx= 1;
		constraints.gridy= 2;
		constraints.weightx= 1.0;
		constraints.weighty= 1.0;
		constraints.insets= new Insets(100,0,0,5);
		this.add(password, constraints);
		
		constraints.anchor= GridBagConstraints.LINE_END;
		constraints.fill= GridBagConstraints.NONE;
		constraints.gridx= 2;
		constraints.gridy= 2;
		constraints.weightx= 1.0;
		constraints.weighty= 1.0;
		constraints.insets= new Insets(100,0,0,10);
		this.add(jPassword, constraints);
		
		constraints.anchor= GridBagConstraints.LAST_LINE_START;
		constraints.fill= GridBagConstraints.NONE;
		constraints.gridx= 1;
		constraints.gridy= 3;
		constraints.weightx= 1.0;
		constraints.weighty= 1.0;
		this.add(okButton, constraints);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

		okButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(loginListener != null){
					loginListener.actionPerformed(new LoginActionEvent(jName.getText(), jPassword.getText()));
				}				
			}
		});
	}

	public void setLoginListener(LoginListener loginListener) {
		this.loginListener= loginListener;		
	}	

}
