
import java.io.*;
import java.net.*;

class Client
{
	public static void main(String[] args) 
	{
		Socket s = null;
		BufferedReader formClientOfKey = null;
		try
		{
			s = new Socket("192.168.56.1",10003);
			formClientOfKey = 
				new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter toServer = 
				new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			BufferedReader formServer = 
				new BufferedReader(new InputStreamReader(s.getInputStream()));
			String line = null;
			while((line=formClientOfKey.readLine())!=null)
			{
				toServer.write(line);
				toServer.newLine();
				toServer.flush();

				String serverSpake = formServer.readLine();
				if("bye".equals(serverSpake))
					break;
				System.out.println("军哥哥:"+serverSpake);
			}
		}
		catch (IOException e)
		{
			throw new RuntimeException("发送失败！");
		}
		/*
		finally
		{
			try
			{
				if(formClientOfKey != null)
				formClientOfKey.close();
			}
			catch(IOException e)
			{
				throw new RuntimeException("服务端写入失败！");
			}
			try
			{
				if(s != null)
				s.close();
			}
			catch (NullPointerException e)
			{
				throw new RuntimeException("s为空指针");
			}
			catch(IOException e)
			{
				throw new RuntimeException("客户端写入失败！");
			}
			
		}
		*/
	}
}

class Server
{
	public static void main(String[] args)
	{
		ServerSocket ss = null;
		Socket s = null;
		BufferedReader formServerOfKey = null;
		try
		{
			 ss = new ServerSocket(10003);
				s = ss.accept();
			System.out.println(s.getInetAddress().getHostAddress()+"....conntected");
			BufferedReader formClient =
				new BufferedReader(new InputStreamReader(s.getInputStream()));
			 formServerOfKey = 
					new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter toClient =
				new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			String line = null;
			while((line=formClient.readLine())!=null)
			{
				if("bye".equals(line))
						break;
				System.out.println("傻宝:"+line);
				String line2 = null;
				while((line2=formServerOfKey.readLine())!=null)
				{
					toClient.write(line2);
					toClient.newLine();
					toClient.flush();
				}
			}
		}
		catch (IOException e)
		{
			throw new RuntimeException("接收失败！");
		}





		/*
		finally
		{
			try
			{
				if(formServerOfKey != null)
					formServerOfKey.close();
			}
			catch(IOException e)
			{
				throw new RuntimeException("服务端写入失败！");
			}
			try
			{
				if(s != null)
					s.close();
			}
			catch (NullPointerException e)
			{
				throw new RuntimeException("s为空指针");
			}
			catch(IOException e)
			{
				throw new RuntimeException("客户端没能关闭！");
			}
		}
		*/
	}
}