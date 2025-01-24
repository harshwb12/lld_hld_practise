package FactoryPattern;

public class ShapeFactory {
    Shape getShape(String input){
        if(input.equals("Circle")) {
            return new Circle();
        }
        else return new Rectangle();
    }
}
