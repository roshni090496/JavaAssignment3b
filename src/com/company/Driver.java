package com.company;

public class Driver {

    public static void main(String[] args) {
        Point p1 = new Point(2,5);
        Point p2 = new Point(5,8);
        Line l1 = new Line(p1,p2);

        Point p3 = new Point(2,5);
        Point p4 = new Point(6,18);
        Line l2 = new Line(p3,p4);

        if(l1.equals(l2)){
            System.out.println("lines are equals using equals");
        }else{
            System.out.println("lines are not equal using equals");
        }
        if(l1.compareTo(l2) == 0){
            System.out.println("lines are equal in length");
        }else if(l1.compareTo(l2) >0){
            System.out.println("first line is greater in length");
        }
        else{
            System.out.println("first line is smaller in length");
        }
    }
}
