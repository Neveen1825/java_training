public class SwapTwoNum {

    public static void main(String[] args) {
        int a = 10;
        int b = 23;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a + " " + b);
        return;
    }
}
