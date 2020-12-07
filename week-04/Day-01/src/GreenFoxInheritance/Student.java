package GreenFoxInheritance;

public class Student extends Person {

    String previousOrganization;
    int skippedDays;

    public Student(String name,int age,String gender, String previousOrganization){
        super(name,age,gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays=0;
    }

    public Student(){
        this("Jane Doe",30,"female","The School of Life");
        this.skippedDays = 0;
    }

    public void skipDays(int numberOfDays){
        this.skippedDays+=numberOfDays;
    }

    @Override
    public void getGoal(){
        System.out.println(commonGoal() + "Be a junior software developer.");
    }

    @Override
    public void introduce(){
        System.out.println(commonIntroduce() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }


}
