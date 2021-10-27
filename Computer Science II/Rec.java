public class Rec {
    public static void main(String [] args) {
        System.out.println(ifact(0));
        System.out.println(rfact(0));
        System.out.println(fib(5));
    }

    public static int ifact(int n) {
        int p = 1;
        for(int f = n; f > 0; f--) {
            p = p * f;
        }
        return p;
    }

    public static int rfact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * rfact(n - 1);
        }
    }

    public static int fib(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }

    public static boolean isPal(String s) {
        if (s.length() == 0) {
            return true;
        } else if (s.length() == 1) {
            return true;
        } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPal(s.substring(l, s.length() - 1));
        } else {
            return false;
        }
        
    }
}
