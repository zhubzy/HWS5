public class HighSchool extends School
{
    
    
        public String schoolMascot;

    public HighSchool(String name, int count,String mascout)
    {
 
        
        super(name,count);
        
        schoolMascot = mascout;
        
    }

      public String getSchoolInfo(){
        
        String output = String.format("%s, home of the %s, has %d students",schoolName, schoolMascot, studentCount);
        
        return output;
    
    }
}
