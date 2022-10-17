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
public class PlayerDefender extends Player{
    double defencePower;
    
    void display(){
        System.out.println("Defender");
        System.out.println("Player name : " + this.name);
        System.out.println("Shooting power : " + this.defencePower);
    }
    
}
