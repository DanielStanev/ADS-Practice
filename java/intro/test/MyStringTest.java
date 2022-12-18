package java.intro.test;

public class MyStringTest {
    public static void main() {
        String prep1 = "Hello";
        StringBuilder prep2 = new StringBuilder("Goodbye");

        // Constructor Tests
        java.intro.src.MyString test1 = new java.intro.src.MyString("Hello");
        java.intro.src.MyString test2 = new java.intro.src.MyString(prep1);
        java.intro.src.MyString test3 = new java.intro.src.MyString(prep2);

        // Type Casting Tests
        
        // Basic Value Accessors Testing
        System.out.println("\nValue Acessors Tests: ");
        if (test1.charAt(4) == 'o' && test3.charAt(0) == 'G')
            System.out.println("charAt() tests passed.");
        if (test1.length() == test2.length() && test2.length() == 5)
            System.out.println("length() tests passed.");


        // TODO for Didko: Finish Adding Tests


    }
}
