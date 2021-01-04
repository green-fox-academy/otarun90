package exercise10;

public class Fox {

//    Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:

    String name;
    String color;
    Integer age;

    public Fox(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getAge() {
        return age;
    }
}