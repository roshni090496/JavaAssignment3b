package com.company;

public class LineCoordinate {

    public void calcDistance(int x1, int y1, int x2, int y2) {
        // sqrt [(x2-x1) * (x2-x2) + (y2-y2) * (y2-y1)]

        double distance = Math.sqrt(((x2 - x1) * (x2 - x2) + (y2 - y2) * (y2 - y1)));
        System.out.println("distance" + distance);
    }

    public static void main(String[] args) {
        LineCoordinate lc = new LineCoordinate();
        lc.calcDistance(1,2,3,4);

    }
}

