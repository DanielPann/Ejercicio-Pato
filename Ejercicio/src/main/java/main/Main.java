/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import duck.*;
import flybehavior.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("----");

        Duck rocketDuck = new RocketDuck();
        rocketDuck.display();
        rocketDuck.performQuack();
        rocketDuck.performFly();

        System.out.println("----");

        // Cambiar comportamiento en tiempo de ejecución
        System.out.println("Mallard gets a rocket upgrade!");
        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();
    }
}

