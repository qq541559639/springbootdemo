package com.looming.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CfgDemoPO {
	private Integer cid;
	private String cname;
	private StudentPO studentPO;
}
