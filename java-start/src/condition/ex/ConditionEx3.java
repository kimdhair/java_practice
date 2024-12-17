package condition.ex;

public class ConditionEx3 {
    public static void main(String[] args) {
        int exchange = 1300;
        int dollar = 2;

        if (dollar < 0 ){
            System.out.println("dollar: " + dollar);
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0){
            System.out.println("dollar: " + dollar);
            System.out.println("환전할 금액이 없습니다.");
        } else{
            System.out.println("dollar: " + dollar);
            System.out.println("출력: 환전 금액은 " + exchange * dollar + "원입니다.");
        }
    }
}
