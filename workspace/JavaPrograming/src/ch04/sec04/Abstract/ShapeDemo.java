package ch04.sec04.Abstract;

abstract class Shape {
	abstract protected double area();

	abstract protected void draw();
}

class Rectangle extends Shape {
	float width, length;

	Rectangle(float w, float l) {
		width = w;
		length = l;
	}

	public double area() {
		return width * length;
	}

	public void draw() { // 必须覆盖父类的abstract方法
	}
}

class Circle extends Shape {
	float radius;

	Circle(float radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}

	public void draw() { // 必须覆盖父类的abstract方法
	}
}

public class ShapeDemo {
	public static void main(String args[]) {
		Shape r = new Rectangle(6, 12);
		System.out.println("The area of Rectangle: " + r.area());
		
		Shape s = new Circle(5);
		System.out.println("The area of Circle: " + s.area());
	}
}
