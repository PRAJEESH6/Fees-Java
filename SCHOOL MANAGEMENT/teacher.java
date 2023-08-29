/**
 * This is the responsible teacher details...
 */

public class teacher {

    private int id;
    private String name;
    private int salary;

    /**
     * This is the parameter to assume the values
     * @param id for the teacher
     * @param name of the teacher
     * @param salary of the teacher
     */
    public teacher(int id, String name ,int salary){

        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    /**
     * GetName =>is used for return the teachers name
     * @return GetID => is used for return the ID
     * GetSalary => is used for return the  teachers salary
     */
    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public int getSalary(){
        return this.salary;
    }

    /**
     * Salary was split by experience, Smart work, fresher
     * @param salary Set method is used set different types of salary's
     */
    public void setSalary(int salary){
        this.salary=salary;
    }
}
