package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first=1,second=1;
        System.out.println(first);
        System.out.println(second);
        for (int i=0; i<lastFibonacci; i++){
            first=second;
            second=first+second;
            System.out.println(first);
            System.out.println(second);
        }
    }
}
