package server;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("unused")
public class ServerMenu 
{
	 public static void search()
	    {
	        JFrame s=new JFrame();
	        s.getContentPane().setBackground(Color.WHITE);
	        s.setLayout(null);
	        ImageIcon bg_img = new ImageIcon("C:\\\\Users\\\\admin\\\\Desktop\\\\A\\\\PBL\\\\Search Criminal.png");
	        Border border = BorderFactory.createLineBorder(Color.GRAY, 3);
	        JLabel background = new JLabel("",bg_img,JLabel.LEFT);
	        background.setBounds(250, 5, 450, 700);
	        s.add(background);
	        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	               
	        JButton sea,back;
	        ImageIcon search = new ImageIcon("C:\\Users\\admin\\Downloads\\iconfinder_search_322497.png");
	        sea=new JButton("Search",search);
	        sea.setBounds(875, 480, 100, 30);
	        
//	        se.setBounds(815,535,120,30);
//	        se.setBorder(border);
//	        se.setFont(new Font("Arial", Font.PLAIN, 20));
//	        se.setHorizontalAlignment(JTextField.CENTER);
	        
	        //ImageIcon b = new ImageIcon("C:\\Users\\admin\\Downloads\\iconfinder_back-alt_134226.png");
	        ImageIcon b = new ImageIcon("C:\\Users\\admin\\Downloads\\4829870-64.png");
	        back=new JButton(b);
	        back.setBounds(10, 20, 64, 64);
	        //back.setBorder(border);
	        //back.setFont(new Font("Arial", Font.PLAIN, 20));
	        //back.setHorizontalAlignment(JTextField.CENTER);

	        JTextField ploiceid,name,city,state;
	        
	        ploiceid=new JTextField("Police ID");
	        ploiceid.setBorder(border);
	        ploiceid.setFont(new Font("Arial", Font.PLAIN, 16));
	        ploiceid.setHorizontalAlignment(JTextField.CENTER);
	        ploiceid.setBounds(775,205,300,50);
	        
	        name=new JTextField("Name");
	        name.setBorder(border);
	        name.setFont(new Font("Arial", Font.PLAIN, 16));
	        name.setHorizontalAlignment(JTextField.CENTER);
	        name.setBounds(775,275,300,50);
	        
	        city=new JTextField("City");
	        city.setBorder(border);
	        city.setFont(new Font("Arial", Font.PLAIN, 16));
	        city.setHorizontalAlignment(JTextField.CENTER);
	        city.setBounds(775,345,300,50);
	        
	        state=new JTextField("State");
	        state.setBorder(border);
	        state.setFont(new Font("Arial", Font.PLAIN, 16));
	        state.setHorizontalAlignment(JTextField.CENTER);
	        state.setBounds(775,415,300,50);


	        back.addActionListener(new ActionListener()
	                               {
	                                   public void actionPerformed(ActionEvent e)
	                                   {
	                                       s.setVisible(false);
	                                       start();
	                                   }
	                               }
	        );

	        s.add(ploiceid);
	        s.add(name);
	        s.add(city);
	        s.add(state);
	        s.add(sea);
	        s.add(back);
	        s.pack();
	        s.setSize(1500,1000);
	        s.setLayout(null);
	        s.setVisible(true);
	    }

	    public static void browseButtonActionPerformed()
	    {
	        JFileChooser fc = new JFileChooser();
	        File image;
	        fc.setAcceptAllFileFilterUsed(false);
	        FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg", "png");
	        fc.addChoosableFileFilter(filter);
	        fc.setFileFilter(filter);
	        int res = fc.showOpenDialog(null);
	        image=fc.getSelectedFile();
	    }
	    
	    public static void addcriminal()
	    {
	        JFrame f= new JFrame();
	        f.getContentPane().setBackground(Color.WHITE);
			f.setSize(450, 500);
	        f.setLayout(null);
	        ImageIcon bg_img = new ImageIcon("C:\\Users\\admin\\Desktop\\A\\PBL\\AddCriminal.jpg");
	        JLabel background = new JLabel("",bg_img,JLabel.LEFT);
	        background.setBounds(250, 75, 500, 520);
	        f.add(background);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JTextField shoname,stationid,criminalname,city,state,charges,aadhaarno,ipc,district;
	        Border border = BorderFactory.createLineBorder(Color.GRAY, 3);
	        
	        JButton back;
	        ImageIcon b1 = new ImageIcon("C:\\Users\\admin\\Downloads\\4829870-64.png");
	        back=new JButton(b1);
	        back.setBounds(10, 20, 64, 64);
	        f.add(back);
	        
	        shoname=new JTextField("Name of SHO");
	        shoname.setBorder(border);
	        shoname.setFont(new Font("Arial", Font.PLAIN, 16));
	        shoname.setHorizontalAlignment(JTextField.CENTER);
	        shoname.setBounds(775,75, 300,50);
	        
	        stationid=new JTextField("Police ID");
	        stationid.setBorder(border);
	        stationid.setFont(new Font("Arial", Font.PLAIN, 16));
	        stationid.setHorizontalAlignment(JTextField.CENTER);
	        stationid.setBounds(775,150, 300,50);
	        
	        criminalname=new JTextField("Name of criminal");
	        criminalname.setBorder(border);
	        criminalname.setFont(new Font("Arial", Font.PLAIN, 16));
	        criminalname.setHorizontalAlignment(JTextField.CENTER);
	        criminalname.setBounds(775,225, 300,50);
	        
	        city=new JTextField("City");
	        city.setBorder(border);
	        city.setFont(new Font("Arial", Font.PLAIN, 16));
	        city.setHorizontalAlignment(JTextField.CENTER);
	        city.setBounds(775,300, 300,50);
	        
	        district=new JTextField("District");
	        district.setBorder(border);
	        district.setFont(new Font("Arial", Font.PLAIN, 16));
	        district.setHorizontalAlignment(JTextField.CENTER);
	        district.setBounds(775,375, 300,50);
	        
	        state=new JTextField("State");
	        state.setBorder(border);
	        state.setFont(new Font("Arial", Font.PLAIN, 16));
	        state.setHorizontalAlignment(JTextField.CENTER);
	        state.setBounds(775,450, 300,50);
	        
	        aadhaarno=new JTextField("Aadhaar No");
	        aadhaarno.setBorder(border);
	        aadhaarno.setFont(new Font("Arial", Font.PLAIN, 16));
	        aadhaarno.setHorizontalAlignment(JTextField.CENTER);
	        aadhaarno.setBounds(775,525, 300,50);
	        
	        JButton browse=new JButton("Browse");
	        browse.setBorder(border);
	        browse.setFont(new Font("Arial",Font.PLAIN,16));
	        browse.setBounds(875,600,100,30);
	        f.add(browse);
	        browse.addActionListener(new ActionListener()
	                                 {
	                                     public void actionPerformed(ActionEvent e)
	                                     {
	                                         browseButtonActionPerformed();
	                                     }
	                                 }
	        );
	        

//	        Border border1 = BorderFactory.createLineBorder(Color.GRAY, 3);
//	        back.setFont(new Font("Arial",Font.BOLD,20));
//	        back.setBorder(border1);
//	        back.setBounds(10,20,100,50);
//	        f.add(back);
	        back.addActionListener(new ActionListener()
	                               {
	                                   public void actionPerformed(ActionEvent e)
	                                   {
	                                       f.setVisible(false);
	                                       start();
	                                   }
	                               }
	        );
	      
	        f.add(criminalname);
	        f.add(city);
	        f.add(district);
	        f.add(state);
	        f.add(aadhaarno);
	        f.add(stationid);
	        f.add(shoname);
	        f.pack();
	        f.setSize(1500,1000);
	        f.setLayout(null);
	        f.setVisible(true);
	    }

	    public static void start()
	    {
	        JFrame f1=new JFrame();
	        f1.getContentPane().setBackground(Color.WHITE);
	        
//	        f1.setPreferredSize(new Dimension(1000, 1000));
//	        f1.setContentPane(new JLabel(new ImageIcon("C:\\\\Users\\\\admin\\\\Desktop\\\\A\\\\PBL\\\\BackGround2.png")));
//	        f1.getContentPane().setBackground(Color.WHITE);
//	        f1.pack();
	        
	        ImageIcon bg_img = new ImageIcon("C:\\\\Users\\\\admin\\\\Desktop\\\\A\\\\PBL\\\\BackGround2.png");
	        JLabel background = new JLabel("",bg_img,JLabel.RIGHT);
	        background.setBounds(250, 100, 1500, 682);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        JButton adduser,logs,wantedlist,search,addcriminal,register;
	        
	        ImageIcon AddUser = new ImageIcon("C:\\Users\\admin\\Desktop\\A\\PBL\\Add.jpg");
	        adduser=new JButton(AddUser);
	        adduser.setBounds(75,150,200,200);
	        
	        JLabel AU= new JLabel("ADD USER");	
			AU.setBounds(125,360,100,30);
			AU.setFont(new Font("Arial", Font.BOLD, 14));
	        AU.setHorizontalAlignment(JTextField.CENTER);
			f1.add(AU);
			
	        
//	        ImageIcon Logs = new ImageIcon("C:\\Users\\admin\\Desktop\\A\\PBL\\Log.png");
//	        logs=new JButton(Logs);
//	        logs.setBounds(200,325,200,200);
	        
	        ImageIcon WantedList = new ImageIcon("C:\\Users\\admin\\Desktop\\A\\PBL\\WantedList.png");
	        wantedlist=new JButton(WantedList);
	        wantedlist.setBounds(330,150,200,200);
	        
	        JLabel WL= new JLabel("WANTED LIST");	
			WL.setBounds(385,360,100,30);
			WL.setFont(new Font("Arial", Font.BOLD, 14));
	        WL.setHorizontalAlignment(JTextField.CENTER);
			f1.add(WL);
	        
	        ImageIcon CriminalRecord = new ImageIcon("C:\\Users\\admin\\Desktop\\A\\PBL\\CriminalRecord.jpg");
	        search=new JButton(CriminalRecord);
	        search.setBounds(585,150, 200,200);
	        
	        JLabel CR= new JLabel("CRIMINAL RECORDS");	
			CR.setBounds(615,360,150,30);
			CR.setFont(new Font("Arial", Font.BOLD, 14));
	        CR.setHorizontalAlignment(JTextField.CENTER);
			f1.add(CR);
	        
	        ImageIcon AddCriminal = new ImageIcon("C:\\Users\\admin\\Desktop\\A\\PBL\\AddCriminal.png");
	        addcriminal=new JButton(AddCriminal);
	        addcriminal.setBounds(840,150, 200,200);
	        
	        JLabel AC= new JLabel("ADD CRIMINAL");	
			AC.setBounds(885,360,120,30);
			AC.setFont(new Font("Arial", Font.BOLD, 14));
	        AC.setHorizontalAlignment(JTextField.CENTER);
			f1.add(AC);
	    
	        search.addActionListener(new ActionListener()
	                                 {
	                                     public void actionPerformed(ActionEvent e)
	                                     {
	                                         f1.setVisible(false);
	                                         search();
	                                     }
	                                 }
	        );

	        addcriminal.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent e)
	            {
	                f1.setVisible(false);
	                addcriminal();
	            }
	        });
	        f1.add(adduser);
	        //f1.add(logs);
	        f1.add(wantedlist);
	        f1.add(search);
	        f1.add(addcriminal);
	        f1.add(background);
	        f1.pack();
	        f1.setSize(1120,1000);
	        f1.setLayout(null);
	        f1.setVisible(true);
	    }

	    public static void main(String args[])
	    {
	        start();
	    }
}
