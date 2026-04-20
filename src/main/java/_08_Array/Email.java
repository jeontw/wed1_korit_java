package _08_Array;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        System.out.print("이메일을 입력해 주세요 >");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        // 1. 이메일이 유효한가? - "@"가 있는가? && "."이 있는가?
        // 유효하면 유효합니다 출력
        if(email.contains("@") && email.contains(".")){
            System.out.println("유효합니다");
        }

        //2. 사용자 이메일 아이디 추출해서 출력
        System.out.println(email.substring(0, email.indexOf("@")));
        System.out.println(email.substring(email.indexOf("@")+1, email.indexOf(".")));

        // 특정 index의 char를 추출
        char firstChar = email.charAt(0);

    }
}
