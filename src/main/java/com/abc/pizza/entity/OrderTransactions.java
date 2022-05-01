package com.abc.pizza.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class OrderTransactions {
	
	
		@Id
		@GeneratedValue (strategy = GenerationType.AUTO)
		@Column(name = "orderId")
		private int orderId;
	
		@Column(nullable = false)
		private int pizzaId;
		
		@Column(nullable = false)
		private int customerId;
		
		@Column(nullable = false)
		private LocalDate orderDate;
		
		@Column(name="amount",nullable = false)
		private int orderAmount;

		public OrderTransactions() {
			super();
			// TODO Auto-generated constructor stub
		}

		public OrderTransactions(int pId, int customerId, LocalDate orderDate, int orderAmount) {
			super();
			this.pizzaId = pId;
			this.customerId = customerId;
			this.orderDate = orderDate;
			this.orderAmount = orderAmount;
		}

		public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public int getpId() {
			return pizzaId;
		}

		public void setpId(int pId) {
			this.pizzaId = pId;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public LocalDate getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(LocalDate orderDate) {
			this.orderDate = orderDate;
		}

		public int getOrderAmount() {
			return orderAmount;
		}

		public void setOrderAmount(int orderAmount) {
			this.orderAmount = orderAmount;
		}
		
		
		
		
}
