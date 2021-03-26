package com.shall.customeraccount.dto;

public enum Shelf {

	HOT_SHELF("Hot Shelf", "Hot", 10), COLD_SHELF("Cold Shelf", "Cold", 10), FROZEN_SHELF("Frozen Shelf", "Frozen", 10),
	OVERFLOW_SHELF("Orverflow Shelf", "Any", 15);

	private final String shelfName;
	private final String allowableTemp;
	private final int capacity;

	private Shelf(String shelfName, String allowableTemp, int capacity) {
		this.shelfName = shelfName;
		this.allowableTemp = allowableTemp;
		this.capacity = capacity;
	}

	public String getShelfName() {
		return shelfName;
	}

	public String getAllowableTemp() {
		return allowableTemp;
	}

	public int getCapacity() {
		return capacity;
	}

}
