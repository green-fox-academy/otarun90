package TeacherAndStudent;

public class Teacher {

    public static void answer(){
        System.out.println("Teacher is answering the question.");
    }

    public void teach() {
        Student.learn();
    }
}
