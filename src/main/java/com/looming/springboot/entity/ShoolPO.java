package com.looming.springboot.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoolPO {
	private Integer shid;
	private String shname;
	private List<StudentPO> stuList;

}
