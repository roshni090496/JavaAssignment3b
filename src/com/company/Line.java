package com.company;

import java.util.Objects;

public class Line implements Comparable<Line>{
    Point p1;
    Point p2;
    double distance;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        distance = Math.sqrt(Math.pow(((double)(p1.getX()-p2.getX())),2) + Math.pow(((double)(p1.getY()-p2.getY())),2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line p = (Line) o;
        if(p.distance != this.distance)
            return false;
        return true;


    }

    @Override
    public int hashCode() {
        return Objects.hash(p1, p2);
    }

    @Override
    public int compareTo(Line o) {
       if(o.distance == this.distance)
           return 0;
       else if(o.distance > this.distance)
           return -1;
       else
           return 1;
    }
}
