package com.sd.ch8;

public class Rect extends Shape {
	private double width, height, area, perimeter;
	public Rect (double w, double h) {
		this.width=w;
		this.height=h;
		this.area=w*h;
		this.perimeter=2*(w+h);
	}

	public double calcArea() {
		return this.area;
	}
	public double calcPerimeter() {
		return this.perimeter;
	}
	public String toString() {
		return "Rect..."+super.toString();
	}
}