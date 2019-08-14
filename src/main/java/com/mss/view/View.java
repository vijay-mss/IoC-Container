package com.mss.view;

import com.mss.service.MobileFactory;

public class View {

	private MobileFactory mobileFactory;
	
	public void setMobileFactory(MobileFactory mobileFactory) {
		this.mobileFactory = mobileFactory;
	}
	public void searchForBrandedMobiles(String brand) {
		System.out.println(mobileFactory.findByBrand(brand));
	}
}
