package JOthhelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class net{
	private Socket server;
	private BufferedReader reader;
	private PrintWriter writer;
	
	public net(String ip){
		try{
			server = new Socket(ip, 45451);
			reader = new BufferedReader(new InputStreamReader(server.getInputStream()));
			writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(server.getOutputStream())));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	String makeroom(int x, int y){
		writer.print("MAKEROOM ");
		writer.print(x);
		writer.print(" ");
		writer.println(y);
		writer.flush();
		String reply = "";
		try{
			reply = reader.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		String replys[] = reply.split(" ");
		if(replys[0].compareTo("SUCCESS") == 0) return replys[1];
		return "FAILED";
	}
	
	tuple login(String room){
		writer.print("LOGIN ");
		writer.println(room);
		writer.flush();
		String reply = "";
		try{
			reply = reader.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		tuple ret = new tuple();
		String replys[] = reply.split(" ");
		if(reply.compareTo("SUCCESS") == 0){
			ret.make_tuple(Integer.parseInt(replys[1]), Integer.parseInt(replys[2]));
		}
		ret.make_tuple(-1, -1);
		return ret;
	}
	
	tuple login(String room, String pass){
		writer.print("LOGIN ");
		writer.println(room);
		writer.print(" PASSWORD ");
		writer.println(pass);
		writer.flush();
		String reply = "";
		try{
			reply = reader.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		tuple ret = new tuple();
		String replys[] = reply.split(" ");
		if(reply.compareTo("SUCCESS") == 0){
			ret.make_tuple(Integer.parseInt(replys[1]), Integer.parseInt(replys[2]));
		}
		ret.make_tuple(-1, -1);
		return ret;
	}
	
	int setpassword(String pass){
		writer.print("SETPASSWORD ");
		writer.println(pass);
		writer.flush();
		String reply = "";
		try{
			reply = reader.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		if(reply.compareTo("SUCCESS") == 0) return 0;
		return -1;
	}
	
	int put(int x, int y){
		writer.print("PUT ");
		writer.print(x);
		writer.print(" ");
		writer.println(y);
		writer.flush();
		String reply = "";
		try{
			reply = reader.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		if(reply.compareTo("SUCCESS") == 0) return 0;
		return -1;
	}
	
	int freeput(int x, int y){
		writer.print("FREEPUT ");
		writer.print(x);
		writer.print(" ");
		writer.println(y);
		writer.flush();
		String reply = "";
		try{
			reply = reader.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		if(reply.compareTo("SUCCESS") == 0) return 0;
		return -1;
	}
	
	void discon(){
		writer.println("CLOSED");
		writer.flush();
	}
	
	class netget implements Runnable{
		private BufferedReader reader;
		
		public netget(BufferedReader read){
			reader = read;
		}
		
		public void run(){
			String reply;
			try{
				reply = reader.readLine();
				String[] replys;
				replys = reply.split(" ");
				if(replys.length == 3){
					
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
