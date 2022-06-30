package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
	
		public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
			super(accNo, accNm, charges);
		}

		public void bookProduct(float charges) {
			System.out.println("Normal user, Your Charges are: " + getCharges() + " with Delivery charges is: "
					+ getDeliveryCharges());
		}

		public String toString() {
			return super.toString();
		}

	}
