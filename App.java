package caculator_1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("종료는 exit 입력");
            String text = sc.nextLine();
            if(text.equals("exit")){
                break;
            }
            System.out.println("첫번째 양수를 입력하시오 : ");
            int a = sc.nextInt();
            System.out.println("연산자를 입력하시오 : ");
            String operator = sc.next();
            System.out.println("두번째 양수를 입력하시오 : ");
            int b = sc.nextInt();

            switch (operator){
                case "+":
                    System.out.println("결과 : " + (a + b));
                    break;
                case "-":
                    System.out.println("결과 : " + (a - b));
                    break;
                case "*":
                    System.out.println("결과 : " + (a * b));
                    break;
                case "/":
                    if(b == 0){
                        System.out.println("나눗셈 연산에서 두번째 정수에 0이 입력될 수 없습니다");
                    }
                    else{
                        System.out.println("결과 : " + (a / b));
                    }
                    break;
                case "exit":
                    System.out.println("종료");
                    break;
            }
        }

    }
}