package chapter6;

/*
 * Write a class that creates instances of the `Rectangle` class to find the
 * total area of two rooms in a house.
 */

public class HomeAreaCalculator {
    public static void main (String[] args) {

        //Create instance of Rectangle class
        Rectangle room1 = new Rectangle();
        room1.setLength(25);
        room1.setWidth(50);
        double areaOfRoom1 = room1.calculateArea();

        //Create instance of Rectangle class
        Rectangle room2 = new Rectangle(22, 60);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Total of all areas is: " + totalArea);
    }
}
