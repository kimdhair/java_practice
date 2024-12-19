package loop.ex;

public class ForEx3 {
    public static void main(String[] args) {
        for(int max = 100, sum = 0, i = 1; i <= max; i++){
            sum = sum + i;
            System.out.println("max=" + i + " sum=" + sum);
        }
    }
}
