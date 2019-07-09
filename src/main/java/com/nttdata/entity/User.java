package com.nttdata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private float age;
	@Column
	private String name;//mandatory
	@Column
	private float salary;
//	private Address address;
	public void setSalary(float salary) {
		if(salary <= 0) {
			throw new IllegalArgumentException("salary cannot be < 0");
		}
	}
	public void setAge(float age) {
		if(age <= 0) {
			throw new IllegalArgumentException("Age cannot be < 0");
		}
	}
	public void setName(String name) {
		this.name=name.trim();
		if(this.name==null ||this.name.isEmpty())
		{
			throw new IllegalArgumentException("Name is must");
		}
	}
}
