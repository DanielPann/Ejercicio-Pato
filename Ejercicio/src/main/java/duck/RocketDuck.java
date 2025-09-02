/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duck;

import flybehavior.FlyRocketPowered;
import quackbehavior.Quack;

public class RocketDuck extends Duck {

    public RocketDuck() {
        flyBehavior = new FlyRocketPowered();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rocket-Powered Duck!");
    }
}

