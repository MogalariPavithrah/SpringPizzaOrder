package com.abc.pizza.entity;

import javax.persistence.Embeddable;

import com.abc.pizza.entity.Discounts;

@Embeddable
public class Discounts {
	private String discountCoupon;
	private int discountPercentage;
	private String discountType;
	public Discounts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Discounts(String discountCoupon, int discountPercentage, String discountType) {
		super();
		this.discountCoupon = discountCoupon;
		this.discountPercentage = discountPercentage;
		this.discountType = discountType;
	}
	public String getDiscountCoupon() {
		return discountCoupon;
	}
	public void setDiscountCoupon(String discountCoupon) {
		this.discountCoupon = discountCoupon;
	}
	public int getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((discountCoupon == null) ? 0 : discountCoupon.hashCode());
		result = prime * result + discountPercentage;
		result = prime * result + ((discountType == null) ? 0 : discountType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discounts other = (Discounts) obj;
		if (discountCoupon == null) {
			if (other.discountCoupon != null)
				return false;
		} else if (!discountCoupon.equals(other.discountCoupon))
			return false;
		if (discountPercentage != other.discountPercentage)
			return false;
		if (discountType == null) {
			if (other.discountType != null)
				return false;
		} else if (!discountType.equals(other.discountType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Discounts [discountCoupon=" + discountCoupon + ", discountPercentage=" + discountPercentage
				+ ", discountType=" + discountType + "]";
	}

	
}
