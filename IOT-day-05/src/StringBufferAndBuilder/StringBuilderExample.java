package StringBufferAndBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Original: " + sb);

        sb.append(" Programming");
        System.out.println("After append: " + sb);

        sb.insert(4, " is");
        System.out.println("After insert: " + sb);

        sb.replace(0, 4, "JAVA");
        System.out.println("After replace: " + sb);

        sb.delete(4, 7);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}
