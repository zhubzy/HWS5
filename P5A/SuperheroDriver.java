import java.util.*;
public class SuperheroDriver
   {
   public static void main( String[] args )
      {
          
          
          ArrayList<Superhero> heros = new ArrayList<Superhero>();
          heros.add(new SpiderMan());
          heros.add(new BatMan());
          heros.add(new SuperMan());
          
          
          for (Superhero hero: heros){
            
              System.out.println(hero.getMotto());
            
            }
      
      } // end method main
   } // end SuperheroDriver