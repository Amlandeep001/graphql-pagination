package com.org.learn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address
{
	@Id
	@GeneratedValue
	Integer id;
	String address;
	String city;
	String state;
	String zip;

	public Address(String address, String city, String state, String zip)
	{
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
}
