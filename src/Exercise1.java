public class Exercise1 {
    public static int productRecursive(int m, int n) {
        // Base case: if either m or n is 0, the product is 0
        if (m == 0 || n == 0) {
            return 0;
        }

        // Base case: if m is 1, the product is n
        if (m == 1) {
            return n;
        }

        // Base case: if n is 1, the product is m
        if (n == 1) {
            return m;
        }

        // Recursive case: add n to the product of (m-1) and n
        return n + productRecursive(m - 1, n);
    }

    public static void main(String[] args) {
        int m = 5;
        int n = 3;
        System.out.println("Product of " + m + " and " + n + " is: " + productRecursive(m, n));
    }
}
