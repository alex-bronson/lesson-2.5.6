package example;

public class Main {
    public static void main(String[] args) {
        byte[] arr = {1, 5, 3, 4, 11, 20, 15};
        AsciiCharSequence test = new AsciiCharSequence(arr);
        System.out.printf("Length: %d\nCharAt: %c\ntoString: %s", test.length(), test.charAt(2),  test.toString());
    }
}
