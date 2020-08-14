/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

/**
 *
 * @author ramses
 */
public class ShoppingCartDemo {
    
    public static void main( String args [ ] ) {
        PaymentServiceFactory factory = PaymentServiceFactory.getInstance( );
        PaymentService creditService = factory.getPaymentService( PaymentServiceType.CREDIT );
        
         
        
        PaymentService debitService = factory.getPaymentService( PaymentServiceType.DEBIT );        
            // create cart and add products
        Cart cart = new Cart( );
        cart.addProduct( new Product( "shirt" , 50 ) );
        
        
         
       
        
        
        
        cart.addProduct( new Product( "pants" , 60 ) );
        
         //Creating the Discounts Objects for the Shirt via Factory
         
         DiscountFactory first = new DiscountFactory();
         first.makingDiscounts(DiscountType.DOLLAR);
         DiscountsByDollar d = new DiscountsByDollar(10); 
         
         //setting the new products price after the discounts
         
         
            // set credit service and pay
        cart.setPaymentService( creditService );        
        cart.payCart();
            // set debit service and pay
        cart.setPaymentService( debitService );    
        cart.payCart();        
        
    } 
    
}
