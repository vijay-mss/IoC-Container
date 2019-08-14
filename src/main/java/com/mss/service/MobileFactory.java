package com.mss.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.mss.model.Mobile;

public class MobileFactory {

	public static	List<Mobile> mobile = new ArrayList<Mobile>();
	
	public MobileFactory() {
		super();
		mobile.add(new Mobile("Samsung","Galaxy m20",Arrays.asList("Ram 64 gb","Processor xenor","Camer 13 mega pixcel")));
		mobile.add(new Mobile("One plus","1+",Arrays.asList("Ram 64 gb","Processor SnapDragon","Camer 18 mega pixcel")));
		mobile.add(new Mobile("Red me","note 6 pro",Arrays.asList("Ram 64 gb","Processor SnapDragon","Camer 14 mega pixcel")));
	}
	public Mobile findByBrand(String brand) { 
		return  mobile.stream().filter(x -> x.getBrand() == brand).collect(Collectors.toList()).get(0);
	}

}
