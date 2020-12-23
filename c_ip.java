package client;

//Java program to find IP address of your computer 
//java.net.InetAddress class provides method to get 
//IP of any host name 
import java.net.*; 
import java.io.*; 
import java.util.*; 
import java.net.InetAddress; 

@SuppressWarnings("unused")
public class ip
{ 
	public static String getpublic() throws Exception 
	{ 
		// Returns the instance of InetAddress containing 
		// local host name and address 
		//InetAddress localhost = InetAddress.getLocalHost(); 		
		//System.out.println("System IP Address : " +localhost.getHostAddress().trim()); 

		// Find public IP address 
		String systemipaddress = ""; 
		try
		{ 
			URL url_name = new URL("http://bot.whatismyipaddress.com"); 

			BufferedReader sc = 
			new BufferedReader(new InputStreamReader(url_name.openStream())); 

			// reads system IPAddress 
			systemipaddress = sc.readLine().trim(); 
		} 
		catch (Exception e) 
		{ 
			systemipaddress = "Cannot Execute Properly"; 
		} 
		return systemipaddress; 
	           	
	}	
	public static String getprivate() throws Exception
	{ 
		InetAddress localhost = InetAddress.getLocalHost();
		String prip=localhost.getHostAddress().trim(); 		
		return prip;
	} 
	public static void main(String args[])
	{
		try 
		{
		getpublic();
		getprivate();
		}
		catch(Exception e)
		{System.out.println(e);}
			
	}
} 


