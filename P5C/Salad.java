public class Salad implements MenuItem
   {
       double price;
       String name;
       
       public Salad(String nm,double prc){
        
        price = prc;
        name = nm;
        
        }
        
        
        public String getName(){
        
            return name;
        
        }
        
        public double getPrice(){
        
            return price;
        }
   } // end class Salad