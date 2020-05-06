package com.fengzhiwei.house.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class HouseType implements Serializable{
    private BigInteger id;
	private BigDecimal price;
	private String name;
	public HouseType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HouseType(BigInteger id, BigDecimal price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HouseType other = (HouseType) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "HouseType [id=" + id + ", price=" + price + ", name=" + name + "]";
	}
	
}
