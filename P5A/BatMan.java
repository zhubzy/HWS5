public class BatMan extends Superhero
{

    int batCapacity;

  
    public BatMan()
    {

        super("batman");
        batCapacity = 100;
    }
    
    public void makebat(){
    
        batCapacity --;
    }
          
   public String getMotto()
      {
      return "I am the bat summoner!";    
      }
    

}

