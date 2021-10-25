package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;  
@Entity  
@Table(name="student")
public class Student   
{   
@Id   
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;    
private String name;    
private Integer age;  
//default conatructor    
	public Student()
	{  
	}    
	public int getId()   
	{    
	return id;    
	}    
	public void setId(int id)   
	{    
	this.id = id;    
	}    
	public String getName()   
	{    
	return name;    
	}    
	public void setName(String name)   
	{    
	this.name = name;    
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}    
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}    