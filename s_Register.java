package server;

	import java.awt.image.BufferedImage;
	import javax.imageio.ImageIO;
	import java.awt.image.BufferedImage;

import javax.swing.filechooser.FileNameExtensionFilter;
	import java.io.*;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
import javax.swing.border.Border;
	@SuppressWarnings("unused")
	public class Register
	{
	public static void registe()
		{
		    Border border = BorderFactory.createLineBorder(Color.GRAY, 3);
			
			JFrame f= new JFrame();  
			f.getContentPane().setBackground(Color.WHITE);
	        f.setLayout(null);
	        ImageIcon bg_img = new ImageIcon("C:\\\\Users\\\\admin\\\\Desktop\\\\A\\\\PBL\\\\Register.png");
	        JLabel background = new JLabel("",bg_img,JLabel.LEFT);
	        background.setBounds(250, 75, 450, 500);
	        f.add(background);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JButton submit=new JButton("Submit");
			submit.setBounds(875,575,100,30);	
			
			JLabel about= new JLabel("Sorry,You have to first register ");	
			about.setBounds(600,5,220,30);  
			
			JTextField shoname,phoneno,email,city,state,charges,address,ipc,district;
			
			shoname=new JTextField("Name of SHO");  
			shoname.setBorder(border);
	        shoname.setFont(new Font("Arial", Font.PLAIN, 16));
	        shoname.setHorizontalAlignment(JTextField.CENTER);
			shoname.setBounds(775,50, 300,50);	
			
			phoneno=new JTextField("Phone number");
			phoneno.setBorder(border);
	        phoneno.setFont(new Font("Arial", Font.PLAIN, 16));
	        phoneno.setHorizontalAlignment(JTextField.CENTER);
			phoneno.setBounds(775,125, 300,50);	  
			
			email=new JTextField("Email address");  
			email.setBorder(border);
	        email.setFont(new Font("Arial", Font.PLAIN, 16));
	        email.setHorizontalAlignment(JTextField.CENTER);
			email.setBounds(775,200, 300,50);	  
			
			address=new JTextField("Address of Police station");  
			address.setBorder(border);
	        address.setFont(new Font("Arial", Font.PLAIN, 16));
	        address.setHorizontalAlignment(JTextField.CENTER);
			address.setBounds(775,275, 300,50);	  
			
			city=new JTextField("City");  
			city.setBorder(border);
	        city.setFont(new Font("Arial", Font.PLAIN, 16));
	        city.setHorizontalAlignment(JTextField.CENTER);
			city.setBounds(775,350, 300,50);		
			
			district=new JTextField("District");  
			district.setBorder(border);
	        district.setFont(new Font("Arial", Font.PLAIN, 16));
	        district.setHorizontalAlignment(JTextField.CENTER);
			district.setBounds(775,425, 300,50);	
			
			state=new JTextField("State");  
			state.setBorder(border);
	        state.setFont(new Font("Arial", Font.PLAIN, 16));
	        state.setHorizontalAlignment(JTextField.CENTER);
			state.setBounds(775,500, 300,50);	  
			
			JLabel notice= new JLabel("You will recieve a call within 24 hours for confirmation ");
			notice.setBounds(550,625,400,30);
				
			f.add(submit);
			f.add(notice);		
			f.add(about);
			f.add(email);
			f.add(city);
			f.add(district);
			f.add(state);
			f.add(address);
			f.add(phoneno);
			f.add(shoname); 
			f.add(submit);
			f.pack();
			f.setSize(1500,1000);  
			f.setLayout(null);  
			f.setVisible(true); 
		
		}
		public static void main(String args[])
		{
			registe();
		}
	}
