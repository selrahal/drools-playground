package com.rhc.drools.droolsplayground.model;

public class Beer {
	private String name;
	private double alcoholContent;
	private double rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAlcoholContent() {
		return alcoholContent;
	}
	public void setAlcoholContent(double alcoholContent) {
		this.alcoholContent = alcoholContent;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Beer [name=" + name + ", alcoholContent=" + alcoholContent
				+ ", rating=" + rating + "]";
	}
}
