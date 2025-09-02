/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duck;

import flybehavior.FlyNoWay;
import quackbehavior.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();    // No vuela
        quackBehavior = new MuteQuack(); // No hace sonido
    }

    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck!");
    }
}
