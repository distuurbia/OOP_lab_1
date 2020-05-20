package com.company;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;


public class MyEllipse extends Shape{
    private int x, y, width, height;
    public MyEllipse(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Group root){
        Ellipse ellipse = new Ellipse(x, y, width, height);
        ellipse.setFill(Color.WHITE);
        ellipse.setStroke(Color.BLACK);
        root.getChildren().add(ellipse);
    }
}
