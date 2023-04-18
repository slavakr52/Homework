package com.example.NonMechVehicle;

import com.example.Movement.I_MovingBackwards;
import com.example.Movement.I_MovingForward;

/**
 * классический велосипед
 */
public class Biсycle implements I_MovingForward, I_MovingBackwards {

    String name;

    public Biсycle(String name) {
        this.name = name;
    }

    @Override
    public void MoveBack() {
        System.out.println(name + " move back");
    }

    @Override
    public void MoveForward() {
        System.out.println(name + " move forward");
    }

}