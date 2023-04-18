package com.example;

import com.example.MechVehicle.Car;
import com.example.NonMechVehicle.Biсycle;

/**
 * клиентская часть
 */
public class App {
    public static void main(String[] args) {
        
        Car car1 = new Car("Volvo");
        car1.StartEngine();
        car1.MoveForward();

        Biсycle bicycle1 = new Biсycle("Stels");
        bicycle1.MoveForward();
    }
}
