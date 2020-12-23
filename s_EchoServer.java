package server;
import java.io.*;
import java.net.*;
import java.sql.*;

public class EchoServer 
{
	 public static void main(String[] args) {
	        ServerSocket ss = null;
	        Socket s = null;
	        try {
	            Class.forName ("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/criminal", "root", "");
	            Statement stmt = con.createStatement ();
	            ResultSet rs = stmt.executeQuery ("select * from clientcheck");
	            ss = new ServerSocket (20000);
	            s = ss.accept ();
	            DataInputStream dis = new DataInputStream (s.getInputStream ());
	            DataOutputStream dout = new DataOutputStream (s.getOutputStream ());
	            String mac, publicip, privateip, osname;
	            String x = "0";
	            publicip = (String) dis.readUTF ();
	            privateip = (String) dis.readUTF ();
	            mac = (String) dis.readUTF ();
	            osname = (String) dis.readUTF ();
	            if(rs.getString (1)=="1.39.31.6")
	            System.out.println (publicip+" "+privateip+" "+mac+" "+osname);
	            /*while (rs.next ()) {
	                if(rs.getString (1) == publicip)
	                {
	                    if(rs.getString (2) == privateip)
	                    {
	                        if(rs.getString (3) == mac)
	                        {
	                            if(rs.getString (4) == osname) {
	                                x = "1";
	                                break;
	                            }
	                            else
	                                continue;
	                        }
	                        else
	                            continue;
	                    }
	                    else
	                        continue;
	                }
	                else
	                    continue;
	            }*/


	            dout.writeUTF (x);
	        dout.flush ();
	        dout.close ();
	            con.close ();
	        s.close ();
	        ss.close ();
	    }
	        catch(Exception e)
	        {
	            //System.out.println(e);
	        }
	    }
}
