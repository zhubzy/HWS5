public class School
{
    public String schoolName;
    public int studentCount;

    
    public School(String name, int count){
        
        
        schoolName = name;
        studentCount = count;
    
    }
    
    public String getSchoolInfo(){
        
        String output = String.format("%s has %d students",schoolName, studentCount);
        
        return output;
    
    }
}
