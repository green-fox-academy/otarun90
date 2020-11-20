public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int dayHours = 24;
        int hourMinute = 60;
        int minuteSeconds = 60;

        int remainingSeconds = (((((dayHours-currentHours)*hourMinute)-currentMinutes)*minuteSeconds)-currentSeconds);
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        System.out.println("Remaining seconds: " + remainingSeconds);
    }
}
