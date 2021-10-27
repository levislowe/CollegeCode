public class Test {
    public static int rec(int num) {
        if(num > 10) return num;
        return rec(num*4);
    }

    public static void main(java.lang.String[] args) {
        System.out.println(rec(1));
    }
}