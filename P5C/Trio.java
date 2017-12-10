import java.util.*;
public class Trio implements MenuItem
   {
       
       Sandwich sandwich;
       Salad salad;
       Drink drink;
       
       
       
       public Trio (Sandwich sw, Salad sa, Drink dr){
        
           sandwich = sw;
           salad = sa;
           drink = dr;
        
        
        }
        
        public double getPrice(){
        
           double prices[] = {sandwich.getPrice(), salad.getPrice(), drink.getPrice()};
           Arrays.sort(prices);
           
           return prices[0] + prices[2];
        
        }
        
        
        public String getName(){
        
            return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName();
        
        }
       
       

    
   } // end class Trio
    