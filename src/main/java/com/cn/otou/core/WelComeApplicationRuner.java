package com.cn.otou.core;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class WelComeApplicationRuner implements ApplicationRunner{
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("------------欢迎来到 otou start success --------------");
	}

}
