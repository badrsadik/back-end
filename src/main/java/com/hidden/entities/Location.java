package com.hidden.entities;

import java.awt.geom.Point2D;
import java.util.List;

public class Location implements Comparable<Location> {
	private String type;
	private List<Double> coordinates;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Double> getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(List<Double> coordinates) {
		this.coordinates = coordinates;
	}
	@Override
	public int compareTo(Location arg0) {
		// TODO Auto-generated method stub
		
		return Double.compare(this.getCoordinates().get(0), arg0.getCoordinates().get(0));
	}
	
	
}
