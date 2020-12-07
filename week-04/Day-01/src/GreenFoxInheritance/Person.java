package GreenFoxInheritance;

public class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person (String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Person (){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    protected String commonGoal(){
        return "My goal is: ";
    }

    public void getGoal(){
        System.out.println(commonGoal() + "Live for the moment!");
    }

    protected String commonIntroduce(){
        return "Hi, I'm " + name + " , a " + age + " year old " + gender;
    }

    public void introduce(){
        System.out.println(commonIntroduce() + " .");
    }

}
