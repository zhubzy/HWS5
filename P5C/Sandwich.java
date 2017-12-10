public class Sandwich implements MenuItem
   {
       
       double price;
       String name;
       
       public Sandwich(String nm,double prc){
        
        price = prc;
        name = nm;
        
        }
        
        
        public String getName(){
        
            return name;
        
        }
        
        public double getPrice(){
        
            return price;
        }
      
   } // end class Sandwich