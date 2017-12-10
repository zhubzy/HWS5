public class SuperMan extends Superhero
{

    int strength;

  
    public SuperMan()
    {

        super("superman");
        strength = 100;
    }
    
    public void liftHeavyThings(){
    
        strength --;
    }
      
   public String getMotto()
      {
      return "I make webs!";    
      }

}

