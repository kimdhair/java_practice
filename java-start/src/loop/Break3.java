package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; ; i++){
            sum = sum + i;
            if(sum > 10){
                System.out.println("sum이 10을 초과, i:" + i + " sum:" + sum);
                break;
            }
        }
    }
}
