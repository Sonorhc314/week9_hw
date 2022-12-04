public class MyMath {
    public static final double PI = 3.14;
    public static int add(int x, int y)
    {
        return x+y;
    }
    public static int sub(int x, int y){
        return x-y;
    }

    // multiplication
    public static int mult(int x, int y){
        return x*y;
    }

    // division 
    public static int div(int x, int y){
        return x/y;
    }
    public static int pow(int x, int y)
    {
        return (int)Math.pow(x,y);
    }
    // square root
    public static int sqrt(int x){
        return (int)Math.sqrt(x);
    }
}
