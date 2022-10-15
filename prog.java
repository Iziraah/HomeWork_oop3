


public class prog {
    public static void main(String[] args) {
        
        Square sq = new Square();
        sq.setSide(10);
        System.out.println(sq.getArea());
    }
}

abstract class Figure {  
    double hight;
    double length;
    public abstract double getArea();  
}
class Rectangle extends Figure{
    protected double weight;
    protected double length;
    public void setLength(double length){
        this.length = length;
    }
    public void setHight(double hight){
        this.hight = hight;
    }
    public double getLength(){
        return length;
    }
    public double getHight(){
        return hight;
    }
    @Override
    public double getArea(){
        return hight*length;
    }

}
class Square extends Rectangle{
    protected double side;
    public void setSide(double side){
        super.hight = side;
        super.length = side;
        this.side = side;
    }
    public double getSide(){
        return side;    
    }
    @Override
    public double getArea(){
        return side*side;
    }
}
class Circle extends Figure{
    protected double radius;
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }  
}
