package com.example.MechVehicle;

import com.example.Movement.I_MovingBackwards;
import com.example.Movement.I_MovingForward;
import com.example.Vehicle.I_HeadlightsTurnOn;
import com.example.Vehicle.I_OpenDoor;
import com.example.Vehicle.I_StartEngine;
import com.example.Vehicle.I_StopEngine;
/*
 *  классический автомобиль
 */
public class Car
        implements I_StartEngine, I_StopEngine, I_MovingForward, I_MovingBackwards, I_HeadlightsTurnOn, I_OpenDoor {

    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void OpenDoor() {
        System.out.println(name + " door is open");
    }

    @Override
    public void HeadlightsTurnOn() {
        System.out.println(name + " headlights is turn on");
    }

    @Override
    public void MoveBack() {
        System.out.println(name + " move back");
    }

    @Override
    public void MoveForward() {
        System.out.println(name + " move forward");
    }

    @Override
    public void StopEngine() {
        System.out.println(name + " engine is stopped");
    }

    @Override
    public void StartEngine() {
        System.out.println(name + " engine is running");
    }

}
