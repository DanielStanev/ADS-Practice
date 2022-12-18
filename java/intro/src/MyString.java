package java.intro.src;

public class MyString {
    private char chars[];

    // Constructors
    public MyString(char input[]) {}
    public MyString(String s) {}
    public MyString(MyString s) {}
    public MyString(char[] value, int offset, int count) {}
    public MyString(StringBuilder builder) {}

    // Type Casting
    public char[] toCharArray() {}
    public String toString() {}

    // Basic Value Accessors
    public char charAt(int index) {}
    public int length() {}


    // String Comparing Methods
    public int compareTo(MyString anotherString) {}
    public boolean equals(Object anObject) {}
    public boolean equalsIgnoreCase(MyString anotherString) {}

    // String Manipulation Methods
    public MyString concat(MyString str) {}
    public MyString replace(char oldChar, char newChar) {}

    // String Mathing Methods
    public int indexOf(int ch) {}
    public int indexOf(int ch, int fromIndex) {}

    public int indexOf(MyString str) {}
    public boolean startsWith(MyString prefix) {}
    public int indexOf(MyString str, int fromIndex) {}

    public int lastIndexOf(int ch) {}
    public int lastIndexOf(int ch, int fromIndex) {}
    public int lastIndexOf(MyString str) {}
    public boolean endsWith(MyString suffix) {}
    public int lastIndexOf(MyString str, int fromIndex) {}

    // String Derivation Methods
    public MyString substring(int beginIndex) {}
    public MyString substring(int beginIndex, int endIndex) {}

    public MyString toLowerCase() {}
    public MyString toUpperCase() {}
    
    public MyString trim() {}

    public MyString[] split(char ch) {}


}