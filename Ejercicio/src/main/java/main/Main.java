/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import duck.DecoyDuck;
import duck.Duck;
import flybehavior.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck decoy = new DecoyDuck();

        System.out.println("Comportamiento original:");
        decoy.display();
        decoy.performFly();   
        decoy.performQuack(); 

        System.out.println("----");

       
        System.out.println("DecoyDuck recibe un rocket upgrade!");
        decoy.setFlyBehavior(new FlyRocketPowered());

        System.out.println("Nuevo comportamiento:");
        decoy.performFly();   
    }
}


