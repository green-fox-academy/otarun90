package PostIt;

public class main {

    public static void main(String[] args) {

//        Create a PostIt class that has
//                a backgroundColor represented by a String
//                a text on it
//                a textColor represented by a String
//        Create a few example post-it objects:
//                an orange with blue text: "Idea 1"
//                a pink with black text: "Awesome"
//                a yellow with green text: "Superb!"

        PostIT Idea1 = new PostIT();
        PostIT Awesome = new PostIT();
        PostIT Superb = new PostIT();

        Idea1.backgroundColor = "orange";
        Idea1.textColor = "blue";
        Idea1.text = "Idea 1";

        Awesome.backgroundColor = "pink";
        Awesome.textColor = "black";
        Awesome.text = "Awesome";

        Superb.backgroundColor = "orange";
        Superb.textColor = "blue";
        Superb.text = "Superb!";

    }
}
