package com.itheim.servlet;
import javax.*;
import java.io.IOException;
import java.util.Random;
import java.awt.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
public class ServletDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletDemo() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int width=100;
		int height=25;
		//在内存创建一个图像对象
		BufferedImage img=new BufferedImage(width,height,BufferedImage,TYPE_INT_RGB);

		
		//创建一个画笔
		Graphics g=img.getGraphics();
		
		//给图片添加背景色
		g.setColor(Color.PINK);//设置一个颜色
		g.fillRect(1, 1, width-2, height-2);//填充颜色
		
		//给边框一个颜色
		g.setColor(Color.RED);
		g.drawRect(0, 0, width-1, height-1);//设置边框的显示坐标
		//给图片添加文字
		
		//设置文本样式
		g.setColor(Color.BLUE);
		g.setFont(new Font("宋体",Font.BOLD|Font.ITALIC,15));
		
		//给图片添加文本
		Random rand=new Random();
		int position=20;
		for(int i=0;i<4;i++) {
		g.drawString(rand.nextInt(10)+"", position, 20);//给图片填充文本
		position+=20;
		}
		
		//添加九条干扰线
		for(int i=0;i<9;i++)
		{
			g.drawLine(rand.nextInt(width), rand.nextInt(height), rand.nextInt(width), rand.nextInt(height));
		}
		
		//将图片对象以流的方式输入到客户端
		ImageIO.write(img,"jpg",response.getOutputStream())
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
