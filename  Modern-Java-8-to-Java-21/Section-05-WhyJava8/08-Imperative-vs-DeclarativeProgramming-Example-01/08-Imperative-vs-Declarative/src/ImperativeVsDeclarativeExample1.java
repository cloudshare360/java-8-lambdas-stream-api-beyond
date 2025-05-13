import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) throws Exception {
        /**
         * Imperative - how style of programming
         * 
         */

         int sum = 0;
         for(int i=0; i<100;i++){
            sum+=i;
         }
         System.out.println("Sum using Imperative Approach: Sum:" + sum);


         /**
          * Declarative Style of Programming
          */
          int sum1 = IntStream.rangeClosed(0, 100).sum();

          System.out.println("Sum using Declarative Approach: Sum:" + sum);
    }
}
