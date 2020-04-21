package com.looming.springboot.entity;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
//读取自定义配置文件,只能是.properties
@PropertySource("classpath:studentpo.properties")
//容器创建此对象的时候, 对象的属性值使用配置文件中studentpo前缀开头的配置赋值
@ConfigurationProperties(prefix="studentpo")
public class StudentPO {
//	@Value("${studentpo.sid}")
	private Integer sid;
//	@Value("@value-sname")
	private String sname;
	private ShoolPO shool;
	private List<String> list;
	private Map<String, String> map;
	
}
