public class SpiderMan extends Superhero
{

    int webCapacity;

  
    public SpiderMan()
    {

        super("spiderman");
        webCapacity = 100;
    }
    
    public void makeWeb(){
    
        webCapacity --;
    }
          
   public String getMotto()
      {
      return "I am invincible!";    
      }
    

}

