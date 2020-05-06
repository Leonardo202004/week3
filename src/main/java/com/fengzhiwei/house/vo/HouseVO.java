package com.fengzhiwei.house.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.fengzhiwei.house.domain.House;

public class HouseVO extends House{
	private Integer p1;
	private Integer p2;
	private String c1;
	private String c2;
	public Integer getP1() {
		return p1;
	}
	public void setP1(Integer p1) {
		this.p1 = p1;
	}
	public Integer getP2() {
		return p2;
	}
	public void setP2(Integer p2) {
		this.p2 = p2;
	}
	public String getC1() {
		return c1;
	}
	public void setC1(String c1) {
		this.c1 = c1;
	}
	public String getC2() {
		return c2;
	}
	public void setC2(String c2) {
		this.c2 = c2;
	}
	@Override
	public String toString() {
		return "HouseVO [p1=" + p1 + ", p2=" + p2 + ", c1=" + c1 + ", c2=" + c2 + "]";
	}
	public HouseVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HouseVO(Integer id, String name, Date created, BigDecimal price, String phone, String content, Integer tid,
			String tname) {
		super(id, name, created, price, phone, content, tid, tname);
		// TODO Auto-generated constructor stub
	}
	
}
