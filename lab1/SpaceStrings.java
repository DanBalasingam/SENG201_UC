package lab1;

/*
 int getStringLength(String str), a method that returns the length of a String.
 int getLetterPosition(String str, char letter), a method that returns the index of the letter in the str
 String makeAllCaps(String str), a method that turns a given str to all caps.
 String makeAllLower(String str), a method that turns a given str to all lowercase.
 String makeHugeString(String str1, String str2), a method that appends str2 to the end of str1.
*/

public class SpaceStrings {

    public int getStringLength(String str) {
        return str.length();
    }

    public int getLetterPosition(String str, char letter) {
        return str.indexOf(letter);
    }

    public String makeAllCaps(String str) {
        return str.toUpperCase();
    }

    public String makeAllLower(String str) {
        return str.toLowerCase();
    }

    public String makeHugeString(String str1, String str2) {
        return str1.concat(str2);
    }
}
