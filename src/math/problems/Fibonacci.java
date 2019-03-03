package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */


        int n = 40;
        int i =0;
        int l =1;

        for (int k = 1; k<=n; k++) {

            System.out.println(i);

            int sum=i+l;

            i=l;
            l=sum;
        }
    }
}
