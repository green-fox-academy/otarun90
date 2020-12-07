package GreenFoxInheritance;

public class Sponsor extends Person {

    String company;
    int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents=0;
    }
    public Sponsor() {
        this("Jane Doe", 30, "female", "Google");
        this.hiredStudents = 0;
    }

    public void hire() {
        hiredStudents++;
    }

    @Override
    public void getGoal(){
        System.out.println(commonGoal() + "Hire brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.println(commonIntroduce() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

}
