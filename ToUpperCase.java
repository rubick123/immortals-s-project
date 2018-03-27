import java.io.*;
import java.net.*;

class Client
{
	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("192.168.56.1",10003);
		BufferedReader formClientOfKey = 
			new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter ToServer = 
			new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		BufferedReader formServer = 
			new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line = null;
		while((line=formClientOfKey.readLine())!=null)
		{
			if("bye".equals(serverSpake))
				break;
			ToServer.write(line);

			String serverSpake = formServer.readLine();
			
			System.out.println("server:"+serverSpake);
		}
		toServer.close();
		s.close();
		
	}
}

class Server
{
	public static void main(String[] args)throws Exception
	{
			ServerSocket ss = new ServerSocket(10003);
				Socket s = ss.accept();
			System.out.println(s.getInetAddress().getHostAddress()+"....conntected");
			BufferedReader formClient =
				new BufferedReader(new InputStreamReader(s.getInputStream()));
			 BufferedReader formServerOfKey = 
					new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter toClient =
				new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			String line = null;
			while((line=formClient.readLine())!=null)
			{
				if("bye".equals(line))
						break;
				System.out.println("client:"+line);
				String line2 = null;
				while((line2=formServerOfKey.readLine())!=null)
				{
					toClient.write(line2);

				}
			}
	}
}
