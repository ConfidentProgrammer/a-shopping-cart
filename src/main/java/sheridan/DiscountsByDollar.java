/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

/**
 *
 * @author deepp
 */

public class DiscountsByDollar extends Discounts{
    
    double dollar;
    DiscountsByDollar(){

}
    DiscountsByDollar(double dollar){
        
        this.dollar = dollar;
        
    }
    public double getDollar(){
        return this.dollar;
    }
}
