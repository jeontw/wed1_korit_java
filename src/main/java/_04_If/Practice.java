package _04_If;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        String realId = "java";
        String realPassword = "qwer1234";

        // 1. 아이디  패스워드 입력 받고
        // 2. 입력값이 동일하면
        // 성공 실패 출력 하기

        Scanner scanner = new Scanner(System.in);

        System.out.print("ID을 입력하세요 >");
        String id = scanner.nextLine();

        System.out.print("PW을 입력하세요 >");
        String pw = scanner.nextLine();

        if (id.equals(realId) && pw.equals(realPassword)) {
            System.out.println("로그인성공");
        } else {
            System.out.println("로그인실패");
        }

        // boolean isSameId = id.equals(realId)
        // boolean isSamePw ~~
        // boolean ispass = isSameId && isSamePw;
        //if(ispass)
        //    ~~
    }
}
