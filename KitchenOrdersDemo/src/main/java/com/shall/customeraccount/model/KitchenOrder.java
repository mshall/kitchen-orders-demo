package com.shall.customeraccount.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "kitchen_order")
public class KitchenOrder {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private String id;
	@Column(name = "name")
	private String name;
	@Column(name = "temp")
	private String temp;
	
	@Column(name = "shelf_life")
	private int shelf_life;
	
	@Column(name = "decay_rate")
	private double decay_rate;
	

}
