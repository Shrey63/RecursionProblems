public class GeekoNacciSeries {
    public static void main(String[] args) {
        int[] a={10,20,30};
        System.out.println(fib(a[0],a[1],a[2],5));
    }
    public static int fib(int a, int b, int c,int n) {
        if(n==1)
            return a;
        if(n==2)
            return b;
        if(n==3)
            return c;
        return fib(n-1)+fib(n-2);
    }
}
