package String;
public class StringDemoIntern {
    public static void main(String[] args) {
        // Method 1: String literals (automatically interned)
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1 == str2);  // true (same object in pool)

        // Method 2: Using new keyword (creates new object)
        String str3 = new String("Hello");
        System.out.println(str1 == str3);  // false (different objects)

        // Method 3: Using intern() method
        String str4 = str3.intern();
        System.out.println(str1 == str4);  // true (now same object in pool)
    }
}