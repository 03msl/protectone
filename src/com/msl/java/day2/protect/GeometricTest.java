package com.msl.java.day2.protect;


public class GeometricTest {
    public static void main(String[] args) {

        GeometricTest test=new GeometricTest();
        test.displayGeometricObject(new Circle("YELLOW",2.0,1));

    }
    public boolean equalsArea(GeometricObject g1, GeometricObject g2) {
        return  g1.findArea() == g2.findArea(); }
    public void displayGeometricObject(GeometricObject g1) {
         System.out.println("面积是："+g1.findArea());}
    }
class GeometricObject{

    protected String color;
    protected  double weight;
    protected  GeometricObject(String color,double weight){
       super();
        this.color=color;
        this.weight=weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        }
public double findArea(){
        return 0.0;
        }
        }
class Circle extends  GeometricObject {
    private double radious;
    protected Circle(String color, double weight,double radious) {
        super(color, weight);
        this.radious=radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    @Override
    public double findArea() {
        return 3.14*radious*radious;
    }
}
class MyRectangle extends GeometricObject{
    private  double width;
    private  double height;
    protected MyRectangle( double width,String color, double weight,double height) {
        super(color, weight);
        this.height=height;
        this.width=width;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double findArea() {
        return weight*height;
    }
}