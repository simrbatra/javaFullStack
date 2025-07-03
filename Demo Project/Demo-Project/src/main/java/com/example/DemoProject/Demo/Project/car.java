package com.example.DemoProject.Demo.Project;


public class car{
    private final engine engine;
    public car(engine engine){
        this.engine = engine;
    }
    public void drive(){
        System.out.print("Driving the car... ");
        engine.start();
    }
}