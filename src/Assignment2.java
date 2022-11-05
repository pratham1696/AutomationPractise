public class Assignment2 {

        public int multiple  (int a , int b)

        {
            int mul = a*b;
            return mul;


        }
        public int addn (int x , int y )
        {
            int add = x+y;
            return add;

        }
        public int sub (int f , int e)
        {
            int s= f-e;
            return s;
        }
        public int div (int i, int g)
        {
            int d =  i/g;
            return d;
        }


        public static void main(String[] args) {
            // TODO Auto-generated method stub

            Assignment2 AG = new Assignment2();

            int Res = AG.multiple(10,2);
            System.out.println("The Multiplication is "+  Res);
            int Res1 = AG.addn(Res ,2);
            System.out.println("The Addition "+  Res1);
            int Res2 = AG.sub(Res1 ,2);
            System.out.println("The Subtraction "+  Res2);
            int Res3 = AG.sub(Res2, 2);
            System.out.println("The Subtraction is "+  Res3);
            int Res4 = AG.div(Res3,2);
            System.out.println("The Final Result is "+  Res4);

        }
    }

