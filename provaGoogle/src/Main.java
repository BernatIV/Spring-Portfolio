public class Main {

    public static void main(String[] args) {
        int x = 0x80000000; // Hexadecimal
        System.out.println(x + " and ");
        x = x >>>31;

        System.out.println(x);
    }
}
