public class College extends School
{

    public int schoolRanking;


    public College(String name, int count, int ranking)
    {
        
        super(name,count);
        schoolRanking = ranking;
        
    }
    
        public String getSchoolInfo(){
        
        String output = String.format("%s has %d students, and is ranked %d in U.S.",schoolName, studentCount, schoolRanking);
        
        return output;
    
    }

}
