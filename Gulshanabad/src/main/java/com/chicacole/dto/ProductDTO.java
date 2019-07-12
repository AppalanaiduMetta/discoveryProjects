package com.chicacole.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ProductDTO  implements Serializable{
    private String name;
    private String description;
    private BigDecimal price;
    //private Date createdAt;
    
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/*
	 * public Date getCreatedAt() { return createdAt; } public void
	 * setCreatedAt(Date createdAt) { this.createdAt = createdAt; }
	 */
    
    
}
