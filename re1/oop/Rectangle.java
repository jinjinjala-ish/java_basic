package re1.oop;

public class Rectangle {
    int width;
    int height;
    int area;

    public Rectangle(int width, int height){
        this.width = 8;
        this.height = 5;
    }

    public void calculateArea(int height, int width){
        area = height * width;
        System.out.println("넓이: " + area);
    }

    public void calculatePerimeter(int height, int width){
        int perimeter = (height * 2) + (width * 2);
        System.out.println("둘레 길이: " + perimeter);
    }

    public void isSquare(int height, int width){
        boolean square;
        if(height == width){
            square = true;
            System.out.println("정사각형 여부: " + square);
        }else {
            square = false;
            System.out.println("정사각형 여부: " + square);
        }
    }
}
