package Constructors;

public class Student {

    private String firstName;
    private String lastName;
    private int graduationYear;

    // First constructor. There can be 1 or more
    public Student(String firstName, String lastName, int graduationYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduationYear = graduationYear;

    }
    //Second constructor, this only takes 2 parameters
    public Student(String firstName, String lastName){
        this(firstName, lastName,-1);
    }

    public void setFirstName(String firstName){
        this.firstName = "Carlos";
    }
    public void printStudent(){
        System.out.println(this.firstName +" "+this.lastName+" "+this.graduationYear);
    }

}
