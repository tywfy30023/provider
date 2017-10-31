package com.wfy.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.wfy.intf.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		// return "Hello " + name;
		Date nowTime = new Date();
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return java.text.MessageFormat.format("[{0}] {1}", time.format(nowTime), name);
	}

}
