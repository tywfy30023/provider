package com.wfy.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String path = "";// App.class.getResource("/provider.xml").getPath();
		path = "/provider.xml";
		// System.out.println(path);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { path });
		context.start();

		System.out.println("服务提供者启动（按任意键退出或在console窗口中停止）:");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("已退出:");
	}
}
