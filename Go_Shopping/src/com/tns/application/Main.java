package com.tns.application;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Main {

	public static void main(String[] args) {

		ShopFactory shopobj= new GSShopFactory();

		PrimeAcc primeAcc = new GSPrimeAcc(194, "prime_account_name", 10f, true);

		NormalAcc normalAcc = new GSNormalAcc(5768, "normal_account_name", 1900f, NormalAcc.getDeliveryCharges());

		primeAcc.bookProduct(600.0f);
		normalAcc.bookProduct(600.0f);

		primeAcc.toString();
		normalAcc.toString();
	}
}	