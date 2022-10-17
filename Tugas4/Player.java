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
public class Player {
    String name;
    
    void display(){
        System.out.println("Player name : " + this.name);
    }
    public static void main(String[] args) {
        PlayerStriker player1 = new PlayerStriker();
        player1.name = "Ronaldo";
        player1.shootingPower = 100;
        player1.display();
        
        PlayerDefender player2 = new PlayerDefender();
        player2.name = "Ramos";
        player2.defencePower = 100;
        player2.display();
    }
}
