package com.example.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "new_product") // Specify the table name
public class product { // Class name capitalized

    @Id
    private int id;
    
    private String name;
    
    @Column(name = "description") // Renamed from "desc" to avoid reserved keyword
    private String description;
    
    private String brand;
    private int price;
    private String category;
    
    @Column(name = "releasedate") // Corrected typo
    private Date releasedate;
    
    private int quantity;
    private String img;
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public product(int id, String name, String description, String brand, int price, String category, Date releasedate,
			int quantity,String img) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.brand = brand;
		this.price = price;
		this.category = category;
		this.releasedate = releasedate;
		this.quantity = quantity;
		this.img=img;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(Date releasedate) {
		this.releasedate = releasedate;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", description=" + description + ", brand=" + brand + ", price="
				+ price + ", category=" + category + ", releasedate=" + releasedate + ", quantity=" + quantity + ", img=" + img + "]";
	}
}
