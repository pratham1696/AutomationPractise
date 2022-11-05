public class Assignment1 {

    public int addn  (int a , int b)

    {
        int c = a+b;
        return c;
    }
    public int sub (int x , int y )
    {
        int s = x-y;
        return s;
    }
    public int mul (int f , int e)
    {
        int m= f*e;
        return m;
    }
    public int div (int i, int g)
    {
        int d =  i/g;
        return d;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Assignment1 AG = new Assignment1();
        int R = AG.addn(10, 2);
        System.out.println("The Addition is "+ R);
        int R2 = AG.addn(R, 2);
        System.out.println("The Addition is "+ R2);
        int R3 = AG.sub(R2, 2);
        System.out.println("The Subtraction is "  +R3);
        int R4 = AG.mul(R3, 2);
        System.out.println("The Multiplication is " + R4);
        int R5;
        R5 = AG.div(R4,2);
        System.out.println("The Final Result is " + R5);

    }
}

