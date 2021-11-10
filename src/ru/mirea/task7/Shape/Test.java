package ru.mirea.task7.Shape;

//public class Test {
//	public static void main(String[] args) {
//		Shape s1 = new Circle(5.5, "RED", false);
//		System.out.println(s1); //toString остался от Circle, тк его уже переопределили
//		System.out.println(s1.getArea()); //getArea остался от Circle, тк его уже переопределили
//		System.out.println(s1.getPerimeter()); //getPerimeter остался от Circle, тк его уже переопределили
//		System.out.println(s1.getColor()); // getColor переопределён не был, но в Shape есть
//		System.out.println(s1.isFilled()); // как и getColor
//		System.out.println(s1.getRadius()); //getRadius переопределён не был, и в Shape его нет
//
//		Circle c1 = (Circle)s1; // s1 переделываем в Circle
//		System.out.println(c1);
//		System.out.println(c1.getArea());
//		System.out.println(c1.getPerimeter());
//		System.out.println(c1.getColor());
//		System.out.println(c1.isFilled());
//		System.out.println(c1.getRadius());
//
////		Shape s2 = new Shape(); //абстрактный класс не может существовать сам по себе, т.к. является просто основой
//
//		Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
//		System.out.println(s3);
//		System.out.println(s3.getArea());
//		System.out.println(s3.getPerimeter());
//		System.out.println(s3.getColor());
//		System.out.println(s3.getLength()); // метод потерян, так как s3 является объектом класса Shape, в котором этот метод не объявлен
//
//		Rectangle r1 = (Rectangle)s3; // s3 переделываем в Rectangle
//		System.out.println(r1);
//		System.out.println(r1.getArea());
//		System.out.println(r1.getColor());
//		System.out.println(r1.getLength());
//
//		Shape s4 = new Square(6.6);
//		System.out.println(s4);
//		System.out.println(s4.getArea());
//		System.out.println(s4.getColor());
//		System.out.println(s4.getSide()); // метод потерян, так как s4 является объектом класса Shape, в котором этот метод не объявлен
//
//// Take note that we downcast Shape s4 to Rectangle,
//// which is a superclass of Square, instead of Square
//		Rectangle r2 = (Rectangle)s4;
//		System.out.println(r2);
//		System.out.println(r2.getArea());
//		System.out.println(r2.getColor());
//		System.out.println(r2.getSide()); // метод потерян, так как r2 является объектом класса Rectangle, в котором этот метод не объявлен
//		System.out.println(r2.getLength());
//
//// Downcast Rectangle r2 to Square
//		Square sq1 = (Square)r2;
//		System.out.println(sq1);
//		System.out.println(sq1.getArea());
//		System.out.println(sq1.getColor());
//		System.out.println(sq1.getSide());
//		System.out.println(sq1.getLength());
//	}
//}