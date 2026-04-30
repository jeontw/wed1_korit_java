package _06_For;

public class NestedFor {
    public static void main(String[] args) {
        // 2중 for문

        // 일주일
        for(int day = 1; day <= 7; day++){
            System.out.println(day + "일 살았습니다");
        }

        // 한달
        // 바깥반복이 한번돌때,  안쪽 반복은 전체반복
        for (int week = 1; week <= 4; week++) {
            System.out.println(week + "주 시작");
            for(int day = 1; day <= 7; day++){
                System.out.println("    " + day + "일 살았습니다");
            }
            System.out.println(week + "주 끝");
        }

        // 구구단
        System.out.println(2 + "단 시작!");
        for (int i = 1; i <= 9; i++) {
            System.out.println("    " + 2 + "x" + i + "=" + 2 * i);
        }
        System.out.println(2 + "단 끝!");

        for (int j = 2; j <= 9; j++) {
            System.out.println(j + "단 시작!");
            for (int i = 1; i <= 9; i++) {
                System.out.println("    " + j + "x" + i + "=" + j * i);
            }
            System.out.println(j + "단 끝!");
        }


    }
}
