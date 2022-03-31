package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape[] shapes = new  Shape[4];
        shapes[0] = new Square(2);
        shapes[1] = new Cricle();
        shapes[2] = new Square();
        shapes[3] = new Square();

        for (Shape shape: shapes) {
            System.out.println(shape);
           if (shape instanceof ColorAble ){
               ((ColorAble) shape).howToColor();
           }
        }





    }

}
