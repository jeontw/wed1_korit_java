package _08_Array;

public class Multi {
    public static void main(String[] args) {






        // 이중배열과 for문
        // int[] -> for문 한번으로 int
        // int[][] -> for문 한번으로 int[]

        // Strind[][] -> String[] -> String
//        for (int i = 0; i < seats2.length; i++) {
//            String[] seat = seats2[i];
//            for(int j = 0; j < seat.length; j++){
//                String seatName = seat[j];
//                System.out.println(seatName);
//            }
//        }
//        for(int i = 0; i < seats2.length; i++) {
//            for(int j = 0; j < seats2[i].length; j++) {
//                System.out.println(seats2[i][j]);
//            }
//        }

        int[][] numArrs = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // numArrs 내부에 실제 int들을 읽으면서
        // 1. 짝수합을 구해주세요
        // 2. 3의 배수의 갯수를 구해주세요
        int result = 0;
        int result2 = 0;
        for (int i = 0; i <  numArrs.length; i ++){
            for(int j = 0; j < numArrs[i].length; j++){
                if(numArrs[i][j] % 2 == 0){
                    result += numArrs[i][j];
                }
                if(numArrs[i][j] % 3 == 0){
                    result2++;
                }
            }
        }
        System.out.println(result);
        System.out.println(result2);

        //향상for문
        int count = 0;
        for (int[] numArr : numArrs){
            for(int num : numArr){
                if (num % 3 == 0){
                    count++;
                }
            }
        }

    }
}
