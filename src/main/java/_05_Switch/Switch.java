package _05_Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // switch - case문: 값에 따라 코드를 분기시키는 문법
        // 코드진행을 이동시키는 문법
        int rank = 2;
        if(rank == 1) {
            System.out.println("금메달");
        } else if (rank == 2) {
            System.out.println("은메달");
        } else if (rank == 3) {
            System.out.println("동메달");
        }

        switch (rank) {
            case 1: // rank == 1
                System.out.println("금메달");
                break; // 가장 가까운 switch 중괄호 탈출
            case 2: // rank == 2
                System.out.println("은메달");
                break;
            case 3:
                System.out.println("동메달");
                break;
        }

        // 원시자료형은 ==비교
        // 참조자료형은 equals를 사용해서 알아서 비교
        String medal = "GOLD";
        switch (medal) {
            case "GOLD":
                System.out.println("금메달 주세요");
                break;
            case "SILVER":
                System.out.println("은메달 주세요");
                break;
            case "BRONZE":
                System.out.println("동메달 주세요");
                break;
            default: // 일치하는 case가 없을 때
                System.out.println("메달권이 아닙니다");
        }

        medal = "BRONZE";
        int prize;
        switch (medal){
            case "GOLD":
                prize = 10000;
                break;
            case "SILVER":
                prize = 7000;
                break;
            case "BRONZE": // case뒤에는 연산자 올수 x
            case "NORMAL":
                prize = 2000;
                break;
        }

        Scanner scanner = new Scanner(System.in);
        int price = 10000;
        //요일 입력 받고 요일별 할인율 적용 최종가격 출력
        System.out.print("요일을 입력하세요 >");
        String day = scanner.nextLine();

        day = day.contains("요일") ? day : day + "요일"; // contains

        switch (day) {
            case "월요일":
                System.out.println(price - price * 0.1);
                break;
            case "화요일":
            case "수요일":
            case "목요일":
                System.out.println(price - price * 0.05);
                break;
            case "금요일":
            case "토요일":
            case "일요일":
                System.out.println(price - price * 0.2);
                break;
            default:
                System.out.println("재대로 입력하세요 " + price);
        }


    }
}
