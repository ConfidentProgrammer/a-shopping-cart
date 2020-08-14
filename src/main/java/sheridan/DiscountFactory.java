/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

import java.util.ArrayList;

/**
 *
 * @author deepp
 */
public class DiscountFactory {
    
    //making the private constructor so that only one discount object can be created
    
    ////
    
    private DiscountFactory one;
    private DiscountFactory getInstance(){
        if(one == null){
            one  = new DiscountFactory();
            
        }
        return one;
    }
    
    //this is the arraylist that makes the Discount objects that can be added to the shopping cart for later use
    
     DiscountType e;
    ArrayList<DiscountsByDollar> disDollar = new ArrayList<>();
    ArrayList<DiscountsByPer> disPer = new ArrayList<>();
      
    public Discounts makingDiscounts(DiscountType e){ // parameter is the enum type because it's the final value
        
        if( e == DiscountType.DOLLAR){
            disDollar.add(new DiscountsByDollar());
            return disDollar.get(0);    // getting the objects discount By dollar
        }else if(e == DiscountType.PERCENTAGE){
            disPer.add(new DiscountsByPer());
            return disPer.get(0);      //getting the object discountsBy Percentage
            
            
        }
        
        return null;
       
    }
    
}
