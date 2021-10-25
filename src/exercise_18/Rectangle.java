package exercise;

public class Rectangle extends Shape {
	private double height;
	private double width;
	public Rectangle(String color, double height, double width) {
		super(color);
		this.height = height;
		this.width = width;
	}
	public double area() {
		double area = this.height * this.width;
		return area;
	}
	
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", getColor()=" + getColor() + "]";
	}
	

}
