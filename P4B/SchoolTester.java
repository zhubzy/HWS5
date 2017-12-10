import java.util.*;
public class SchoolTester
{
    
    public static void main (String args[]){
    
        ArrayList<School> schools = new ArrayList<>();
        schools.add(new HighSchool("South Hills",900,"Huskies"));
        schools.add(new College("Harward",22000,2));
        schools.add(new College("Stanford",17000,1));
        
        
        for (School school: schools){
        
            System.out.println(school.getSchoolInfo());
            
        }
        
        
        
    }
}
