package com.company;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;


public class Main extends Application{

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        ShapeList shapeList = new ShapeList();
        MyRectangle myRectangle = new MyRectangle(15, 15, 40, 60);
        shapeList.list.add(myRectangle);
        MySquare mySquare = new MySquare(15, 90, 60, 60);
        shapeList.list.add(mySquare);
        MyCircle myCircle = new MyCircle(100, 45, 30);
        shapeList.list.add(myCircle);
        MyEllipse myEllipse = new MyEllipse(190, 45,45, 30);
        shapeList.list.add(myEllipse);
        MyTriangle myTriangle = new MyTriangle(250, 20, 320, 70, 250, 70);
        shapeList.list.add(myTriangle);
        MyLine myLine = new MyLine(90, 90, 150, 150);
        shapeList.list.add(myLine);

        for (Shape i: shapeList.list) {
            i.draw(root);
        }

        Scene scene = new Scene(root, 350, 300);
        stage.setScene(scene);
        stage.setTitle("Some figures");
        stage.show();
    }
}
