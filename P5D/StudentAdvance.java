public class StudentAdvance extends Advance
   {
       
       public StudentAdvance(int days){
        
           super(days);
        
        }
        
        public double getPrice(){
        
            return super.getPrice()/2;
        
        }
        
       public String toString(){
        
        
        return super.toString() + "\n" + "Student ID required";
        
        }
       
       
       
   } // end class StudentAdvance
