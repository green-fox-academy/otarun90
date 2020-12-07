package GreenFoxInheritance;

public class Mentor extends Person {
    String level;

    public Mentor(String name, int age, String gender, String level){
    super(name,age,gender);
    this.level = level;
    }

    public Mentor() {
        this("Jane Doe", 30, "female", "intermediate");
    }

    @Override
    public void getGoal(){
        System.out.println(commonGoal() + "Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println(commonIntroduce() + level + " mentor.");
    }
}
