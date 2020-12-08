package Gnirts;

public class Gnirts implements CharSequence {

    String gnirts;

    public Gnirts(String inputString){
        this.gnirts=inputString;
    }

    @Override
    public int length() {
       return gnirts.length();
    }

    @Override
    public char charAt(int index) {
        return gnirts.charAt(length()-index-1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}