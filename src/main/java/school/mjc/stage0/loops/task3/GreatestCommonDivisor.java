package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = first;
        for (int i=0; i<=first && i<=second; i++){
            if (first%(i+1)==0 && second%(i+1)==0){
                gcd = i+1;
            }
        }
        System.out.println(gcd);
    }
}
