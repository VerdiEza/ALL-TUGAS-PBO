/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author FIRDAUS ELIASA
 */
public class PlayerStriker extends Player{
    double shootingPower;
    
    void display(){
        System.out.println("Striker");
        System.out.println("Player name : " + this.name);
        System.out.println("Shooting power : " + this.shootingPower);
    }
}
