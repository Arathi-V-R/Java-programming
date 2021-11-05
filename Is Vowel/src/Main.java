public class Main {

    public static void main(String[] args) {
	    MyChar myChar = new MyChar('z');
        System.out.println(myChar.isVowel());

        System.out.println(myChar.isDigit());
        System.out.println(myChar.isAlphabet());//'a' to 'z' or 'A' to 'Z'
        System.out.println(myChar.isConsonant());

        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();
    }
}
