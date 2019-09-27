package com.nls.training;

public class Circle implements Shape{

	 private double radius;
	 public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 2 * pie* this.radius * this.radius;
	}
	 
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}
	}
