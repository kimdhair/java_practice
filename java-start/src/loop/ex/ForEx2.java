package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {

        for(int num = 1, count = 1; count <= 10; num++){
            if(num % 2 == 0){
                System.out.println(num);
                count++;
            }
        }
    }
}
