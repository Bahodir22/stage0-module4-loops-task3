package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum=0;
        t=Math.abs(t);
        String s=String.valueOf(t);
        for (int i=0; i<s.length(); i++){
            sum += t%10;
            t /= 10;
        }
        System.out.println(sum);
    }
}
