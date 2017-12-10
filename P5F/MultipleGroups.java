import java.util.List;
import java.util.ArrayList;

public class MultipleGroups implements NumberGroup
   {
   private List<NumberGroup> groupList;
   public boolean contains(int num)
{
  for(NumberGroup group : groupList)
    if(group.contains(num))
      return true;

  return false;
}
       
   } // end class MulitpleGroups

