package com.looming.springboot.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.looming.springboot.entity.CfgDemoPO;
import com.looming.springboot.entity.ShoolPO;
import com.looming.springboot.entity.StudentPO;

@SpringBootTest
public class TestControllerTest {
	
	@Autowired
	ApplicationContext ac;
	
	@Autowired
	StudentPO studentPO;
	
	@Autowired
	ShoolPO shoolPO;
	
	@Autowired
	CfgDemoPO cfgDemoPO;
	

	@Test
	public void testTest() {
//		System.out.println(ac);
//		System.out.println(studentPO);
//		System.out.println(shoolPO);
		System.out.println(cfgDemoPO);
		
	}
	
}
