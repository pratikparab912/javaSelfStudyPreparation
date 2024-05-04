package com.cybage.aggregation;

public class Asset {
	private int assetId;
	private String assetName;
	private String company;
	public Asset(int assetId, String assetName, String company) {
		super();
		this.assetId = assetId;
		this.assetName = assetName;
		this.company = company;
	}
	public Asset() {
		super();
	}
	public String toString(){
		return assetId + " " + assetName + " " + company;
	}
}
