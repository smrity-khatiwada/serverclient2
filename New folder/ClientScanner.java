
import java.net.*;
import java.io.*;
import java.util.*;

public class ClientScanner {
	
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost",4000);
			Scanner sc = new Scanner(System.in);
			DataOutputStream dout= new DataOutputStream(s.getOutputStream());
			DataInputStream din= new DataInputStream(s.getInputStream());
			while (true) {
			System.out.println("please reply");
			String cmsg= sc.nextLine();
			dout.writeUTF(cmsg);
			if(cmsg.equals("bye")) 
			{
				break;
			}
			
			String cinmsg= (String)din.readUTF();
			System.out.println(cinmsg);
			}
			din.close();
			s.close();
			
		}catch (Exception e) {
}
}



}

