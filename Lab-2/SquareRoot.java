public class SquareRoot {
        public static void main(String[] args)
        {
            double a = 3;
            double b = 2.5;
            double c = -0.5;

            //PUT YOUR CODE HERE
            if ((b*b - 4*a*c) < 0)
            {
                System.out.println("x1=");
                System.out.println("x2=");
            }
            else
                {
                double D = Math.sqrt(b*b - 4*a*c);
                double x1 = ((-b + D) / (2*a));
                double x2 = ((-b - D) / (2*a));
                System.out.println("x1="+x1);
                System.out.println("x2="+x2);
                }
            //PUT YOUR CODE HERE
        }
    }
