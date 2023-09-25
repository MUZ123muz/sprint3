package com.amber.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Item {

	@Id
	@GeneratedValue(generator="item_seq")
	@SequenceGenerator(name="item_seq",initialValue=111,allocationSize=1)
  	private int id;
	private String name;
	private String description;
	public Item() {
		
	}
	public Item(int id, String name, String description) {


		this.id = id;
		this.name = name;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	

	

    

}
