package com.example.yorbit.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_cart")
public class Cart {

	@EmbeddedId
	private CartPk cp;
	
	@Column(name="qty")
	private int qty;
	
	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public CartPk getCp() {
		return cp;
	}

	public void setCp(CartPk cp) {
		this.cp = cp;
	}
}
