//import java.util.ArrayList;
//import java.util.Scanner;
//public class TestShape {
//    static Scanner sc = new Scanner(System.in);
//
//    public static double minArea(ArrayList<Shape> shapes) {
//        double min = Double.MAX_VALUE;
//        for (Shape shape : shapes) {
//            if (shape.getArea() < min) {
//                min = shape.getArea();
//            }
//        }
//        return min;
//    }
//
//    public static double maxArea(ArrayList<Shape> shapes) {
//        double max = Double.MIN_VALUE;
//        for (Shape shape : shapes) {
//            if (shape.getArea() > max) {
//                max = shape.getArea();
//            }
//        }
//        return max;
//    }
//
//    public static ArrayList<Shape> listOfMaxCircle(ArrayList<Shape> shapes) {
//        double max = maxArea(shapes);
//        if (max == Double.MAX_VALUE) {
//            return null;
//        } else {
//            ArrayList<Shape> result = new ArrayList<>();
//            for (Shape shape : shapes) {
//                if (shape.getClass().getSimpleName().equals("Circle")) {
//                    if (shape.getArea() == max) {
//                        result.add(shape);
//                    }
//                }
//            }
//
//            return result;
//        }
//    }
//
//    public static ArrayList<Shape> listOfMinSquare(ArrayList<Shape> shapes) {
//        double min = minArea(shapes);
//        if (min == Double.MIN_VALUE) {
//            return null;
//        } else {
//            ArrayList<Shape> result = new ArrayList<>();
//            for (Shape shape : shapes) {
//                if (shape.getClass().getSimpleName().equals("Square")) {
//                    if (shape.getArea() == min) {
//                        result.add(shape);
//                    }
//                }
//            }
//            return result;
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Shape> shapes = new ArrayList<>();
//        String line = null;
//        while (!(line = sc.nextLine()).isEmpty()) {
//            String[] str = line.split(" ");
//            if (str[0].equals("s")) {
//                double r = Double.parseDouble(str[1]);
//                Square square = new Square(r);
//                shapes.add(square);
//            } else if (str[0].equals("r")) {
//                double length = Double.parseDouble(str[1]);
//                double width = Double.parseDouble(str[2]);
//                Rectangle rectangle = new Rectangle(length, width);
//                shapes.add(rectangle);
////            } else if (str[0].equals("c")) {
////                double radius = Double.parseDouble(str[1]);
////                Circle circle = new Circle(radius);
////                shapes.add(circle);
////            }
//            }
//
//            ArrayList<Shape> result = listOfMinSquare(shapes);
//            ArrayList<Shape> result1 = listOfMaxCircle(shapes);
//            for (Shape shape1 : result) {
//                System.out.println(shape1.toString());
//            }
//            System.out.println();
//            for (Shape shape : result1) {
//                System.out.println(shape.toString());
//            }
//            System.out.println("input continue");
//
//            double length = sc.nextDouble();
//            double width = sc.nextDouble();
//            double side = sc.nextDouble();
//            double radius = sc.nextDouble();
//            Shape rectangle = new Rectangle(length, width);
//            System.out.printf("Area of rectangle is: %.2f\n", rectangle.getArea());
//
//            Shape square = new Square(side);
//            System.out.printf("Area of square is: %.2f\n", square.getArea());
//
//            radius *= 2;
//            Shape square1 = new Square(radius);
//            System.out.printf("Area of the square circumscribing the circle is: %.2f\n", square1.getArea());
//
//
//        }
//    }
//}
//
