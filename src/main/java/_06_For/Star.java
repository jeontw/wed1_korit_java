package _06_For;

public class Star {
    public static void main(String[] args) {

        for (int j = 0; j < 5; j++){
            for (int i = 0; i < 5; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 0; j < 5; j++){
            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
