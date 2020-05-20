package com.company;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MySquare extends Shape{
        private int width, height, x, y;
        public MySquare(){
        }
        public MySquare(int x, int y, int width, int height){
            if (width == height) {
                this.width = width;
                this.height = height;
                this.x = x;
                this.y = y;
            } else {
                this.width = 0;
                this.height = 0;
                this.x = 0;
                this.y = 0;
            }
        }
        @Override
        public void draw(Group root){
            Rectangle rectangle = new Rectangle(x, y, width, height);
            rectangle.setFill(Color.WHITE);
            rectangle.setStroke(Color.BLACK);
            root.getChildren().add(rectangle);
        }
}
