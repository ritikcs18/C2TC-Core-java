package com.tns.framework;


public abstract class NormalAcc extends ShopAcc {

	private static final float deliveryCharges = 60.0f;

	public NormalAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
	}

	public static float getDeliveryCharges() {
		return deliveryCharges;
	}

	public void bookProduct(float book) {}

	public String toString() {
		return super.toString() + " NormalAcc{" + "DeliveryCharges=" + deliveryCharges + "}";
	}
}
