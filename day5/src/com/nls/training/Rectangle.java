package com.nls.training;

import java.io.Serializable;

public class Rectangle extends Object implements Shape, Serializable, Cloneable {

	private double length;
	private double breadth;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {

		return this.length * this.breadth;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}
	
}
