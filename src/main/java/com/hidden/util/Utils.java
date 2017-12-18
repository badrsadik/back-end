package com.hidden.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.hidden.entities.Shop;

public class Utils /*implements Comparator<Shop>*/ {
	
	private Double myLat;
	private Double myLong;
	
	public Utils(Double myLat, Double myLong) {
		super();
		this.myLat = myLat;
		this.myLong = myLong;
	}

	public List<Shop> compare(List<Shop> shops) {
		Collections.sort(shops, new Comparator<Shop>() {

			@Override
			public int compare(Shop o1, Shop o2) {
				return distance(o1).compareTo(distance(o2));
			}
		});
		return shops;
	}
	
	/*
	 * calculate the distance between 2 given points
	 */
	public Double distance(Shop shop) {
        double deltaLat = shop.getLocation().getCoordinates().get(1) - myLat;
        double deltaLon = shop.getLocation().getCoordinates().get(0) - myLong;
        double distance = Math.hypot(deltaLat, deltaLon);
        return distance;
    }

//	@Override
//	public int compare(Shop o1, Shop o2) {
//		return distance(o1).compareTo(distance(o2));
//	}
}
