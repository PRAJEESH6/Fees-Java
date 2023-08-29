import java.util.Calendar;
/*
This is the student class represent by name , id , grade, class, fees..& fees paid....
 */

public class management {

         private int id;
         private String name;
         private int grade;
         private int feespaid;
         private int totalfeepaid;

    /**
     * Students should pay $30,000 yearly...
     * Fee intial amount is 0...
     * @param id give the id of the Student,
     * @param name give the name of the Student.,
     * @param grade Shows the students grade.....
     */
    public management(int id,String name, int grade ){
        //initializing the values...
             this.feespaid=0;
             this.totalfeepaid=30000;
             this.id=id;
             this.name=name;
             this.grade=grade;
         }

         // I am don't alter students name and id...

    /**
     * This set grade part is used to update the grade of the student...
     * @param grade new grade of the student...
     */
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * return id , name , grade of the stident
     * @return so, get method is used
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeespaid() {
        return feespaid;
    }

    public int getTotalfeepaid() {
        return totalfeepaid;
    }

    /**
     * Keep adding the fees and receiving th fees...
     * @param feespaid Each and every time should be updates
     * management receive the funds...
     */
    public void setFeespaid(int feespaid){
        feespaid+=feespaid;
    }

}
