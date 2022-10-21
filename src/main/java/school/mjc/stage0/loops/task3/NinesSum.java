package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum=0;
        for (int i=0, k=1; i<lengthOfLastNumber; i++){
            sum+=(Math.pow(10,k)-1);
            k++;
        }
        System.out.println(sum);
    }
}
