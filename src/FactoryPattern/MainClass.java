package FactoryPattern;

public class MainClass {
    public static void main(String[] args) {
        ShapeFactory obj = new ShapeFactory();
        Shape temp = obj.getShape("Circle");
        temp.draw();
    }
}
