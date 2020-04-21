package com.looming.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.looming.springboot.entity.CfgDemoPO;
import com.looming.springboot.entity.StudentPO;

//此注解标识当前类是一个配置类, 作用相当于一个xml
@Configuration
public class CfgDemoConfig {
	
	@Autowired
	StudentPO studentPO;
	
//	@Bean	//bean的默认名称就是方法名
	@Bean(name = "cfgDemoPO")
	public CfgDemoPO cfgDemoPO() {
		return new CfgDemoPO(111, "cName", studentPO);
	}

}
