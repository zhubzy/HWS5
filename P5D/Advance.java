public class Advance extends Ticket
   {
       
       
       private int days;
       
       public Advance(int day){
        
        super();
        days = day;
        
        }
       
       public double getPrice(){
        
           if (days >= 10){
               
           return 40;
           
        } else {
        
            return 30;
        }
        
        }
       
       
   } // end class Advance