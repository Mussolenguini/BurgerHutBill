/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2_a3_restaurantbill;

/**
 *
 * @author evrob0095
 */
public class U2_A3_RestaurantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int burger = 10;
        double drink = 2.50;
        int fries = 2;
        double tax = (burger + drink + fries)*0.13;
        double taxTotal = burger + drink + fries + tax;
        double total = burger + drink + fries;
        System.out.println("Burger Hut Bill \n ___________________ \n \n Meal: $" + total + "\n Tax: $" + tax + "\n Total: $" + taxTotal + "\n _______________________");
    }
    
}
