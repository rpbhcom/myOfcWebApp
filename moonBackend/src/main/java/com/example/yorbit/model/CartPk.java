package com.example.yorbit.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Embeddable
public class CartPk implements Serializable{

	@Column(name="cart_id")
	private long cartId;
	
	@Column(name="product_id")
	private long productId;
	
	@Column(name="user_id")
	private long userId;
	
	@OneToOne(mappedBy="cart")
	private User user;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Product> productList;
	
	CartPk(){
		
	}
	
	CartPk(long cartId,long productId,long userId){
		this.cartId=cartId;
		this.productId=productId;
		this.userId=userId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
}
