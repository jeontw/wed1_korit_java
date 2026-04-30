package _9_Method;

public class Practice {

    // 등급을 구하는 메서드
    // 평균을 매개변수로 전달받아, 학점을 리턴
    // 90이상 A, 80이상90미만 B, 70이상80미만 C, 나머지 D
    public static String ABCD(double average) {
        if (average >= 90){
            return "A";
        } else if (average >=80) {
            return "B";
        } else if (average >=70) {
            return "C";
        }else {
            return "D";
        }
    }

    public static void printStudentInfo(String name, int[] scores) {
        double sum = 0.0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = sum/scores.length;
        ABCD(average);
        System.out.println(name + "의 총점: " + sum + " 평균: " + average);

        String grade = ABCD(average);
        System.out.println("등급: " + grade);
    }

    public static void main(String[] args) {
        // 학생이름, 국,영,수 점수를 매개변수로 넘기면,
        // 총점, 평균, 등급을 출력하는 메서드
        int[] scores = {100, 80, 52};
        printStudentInfo("홍길동", scores);
    }
}
