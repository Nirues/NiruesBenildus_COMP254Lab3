public class Exercise1 {
    public static int productRecursive(int m, int n) {

        if (m == 0 || n == 0) {
            return 0;
        }

        if (m == 1) {
            return n;
        }


        if (n == 1) {
            return m;
        }


        return n + productRecursive(m - 1, n);
    }

    public static void main(String[] args) {
        int m = 8;
        int n = 3;
        System.out.println("Product of "+ m +" and " + n + " is: " + productRecursive(m, n));
    }
}
