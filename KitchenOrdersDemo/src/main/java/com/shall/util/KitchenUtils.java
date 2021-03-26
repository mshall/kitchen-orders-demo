package com.shall.util;

public class KitchenUtils {

	public double getOrderValue(int shelfLife, int orderAge, int shelfDecayModifier, double decayRate) {
		double orderValue = (shelfLife - orderAge - decayRate * orderAge * shelfDecayModifier) / shelfLife;
		return orderValue;
	}
}
