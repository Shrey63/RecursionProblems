public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(twoPower(1));
    }
    public static boolean twoPower(int num)
    {
        if(num==0 || num%2==1 || num==1)
            return false;
        if (num==2)
            return true;
        return twoPower(num/2);

    }
}
