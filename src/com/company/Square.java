package com.company;

public class Square extends  Shape implements ColorAble {
    private double canh = 5;


    public Square(){

    }
    public Square(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
    public double Area(){
        return canh*canh;
    }

    @Override
    public String toString() {
        return "Square{" +
                "canh=" + canh +
                "Area="+ Area()+
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("tao mau xanh " );
    }


}
