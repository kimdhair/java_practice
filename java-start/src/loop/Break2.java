package loop;

public class Break2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        for(;;){
            sum = sum + i;
            if(sum > 10){
                System.out.println("sum이 10을 초과, i:" + i + " sum:" + sum);
                break;
            }
            i++;
        }
    }
}
