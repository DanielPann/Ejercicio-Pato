/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duck;

import flybehavior.FlyNoWay;
import quackbehavior.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();   // No puede volar
        quackBehavior = new Squeak();  // Hace squeak en lugar de quack
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck!");
    }
}

