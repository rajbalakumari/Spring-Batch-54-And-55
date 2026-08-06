package com.sub.nit.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
@Schema(description = "Customer Entity")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;

	private String name;

	private String location;

	private Long mobnum;

	public Customer() {

	}

	public Customer(Integer id, String name, String location, Long mobnum) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.mobnum = mobnum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getMobnum() {
		return mobnum;
	}

	public void setMobnum(Long mobnum) {
		this.mobnum = mobnum;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", location=" + location + ", mobnum=" + mobnum + "]";
	}

}
