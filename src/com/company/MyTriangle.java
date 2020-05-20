package com.company;

import javafx.scene.Group;
import javafx.scene.shape.Line;

public class MyTriangle extends Shape{
    private int x1, y1, x2, y2, x3, y3;
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    @Override
    public void draw(Group root){
        Line lineFirst = new Line(x1, y1, x2, y2);
        Line lineSecond = new Line(x2, y2, x3, y3);
        Line lineThird = new Line(x3, y3, x1, y1);
        root.getChildren().addAll(lineFirst, lineSecond, lineThird);
    }
}
