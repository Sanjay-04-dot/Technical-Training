package StringBufferAndBuilder;

public class StringBufferExample {
    public static void main(String[] args) {

        // Creating StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original: " + sb);

        // 1. append() - add at the end
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. insert() - add at specific position
        sb.insert(5, " Beautiful");
        System.out.println("After insert: " + sb);

        // 3. replace() - replace characters
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // 4. delete() - remove characters
        sb.delete(2, 12);
        System.out.println("After delete: " + sb);

        // 5. reverse() - reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. length() and capacity()
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }

}
