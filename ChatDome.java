
import java.io.*;
import java.net.*;

class Send implements Runnable
{
	private DatagramSocket ds;
	public Send(DatagramSocket ds)
	{
		this.ds = ds;
	}
	public void run()
	{
		 try
		 {
			 BufferedReader formkey 
				 = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while((line=formkey.readLine())!=null)
			 {
				if("886".equals(line))
					break;
				byte[] buf = line.getBytes();

				DatagramPacket dp 
					= new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.56.1"),10000);
				ds.send(dp);
			}
		 }
		 catch (Exception e)
		 {
			throw new RuntimeException("∑¢ÀÕ ß∞‹£°");
		 }
	}
}

class Rece implements Runnable
{
	private DatagramSocket ds;
	public Rece(DatagramSocket ds)
	{
		this.ds = ds;
	}
	public void run()
	{
		 try
		 {
			while(true)
			 {
				byte[] buf = new byte[1024];
				DatagramPacket dp = 
					new DatagramPacket(buf,buf.length);

				ds.receive(dp);
				String formClient = new String(dp.getData(),0,dp.getLength());

				System.out.println("±¶±¶:" + formClient);
			}
		 }
		 catch (Exception e)
		 {
			 throw new RuntimeException("Ω” ’ ß∞‹£°");
		 }
	}
}

class ChatDome
{
	public static void main(String[] args)throws Exception
	{
		DatagramSocket sendSocket = new DatagramSocket();
		DatagramSocket receSocket = new DatagramSocket(10000);

		new Thread(new Send(sendSocket)).start();
		new Thread(new Rece(receSocket)).start();
	}
}

