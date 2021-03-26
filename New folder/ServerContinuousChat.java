
import java.net.*;
import java.io.*;
import java.util.*;


public class ServerContinuousChat {
	
	public static void main(String[] args) {
			
				try {
			ServerSocket ss= new ServerSocket(4000);
			System.out.println("waiting for client");
			Scanner sc= new Scanner(System.in);
			
			Socket s = ss.accept();
			System.out.println("connected to client");
			DataInputStream din= new DataInputStream(s.getInputStream());
			while (true) {
			String cmsg= (String)din.readUTF();
			if(cmsg.equals("bye")){
				break;
			}
			System.out.println(cmsg);
			System.out.println("type your reply");
			String reply= sc.nextLine();
			DataOutputStream dout= new DataOutputStream(s.getOutputStream());
			dout.writeUTF(reply);
			}
			din.close();
			s.close();
			ss.close();
			
			
			
		}catch(Exception e) {
		}
		}
	}