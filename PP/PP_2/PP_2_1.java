// Write a progam that produces [a specific pattern].

public class PP_2_1 {
    
    public static void main(String[] args) {
        for(int i = 7; i > 0; i--) {
            for(int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < 8 - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i - 1; j++) {
                System.out.print("//");
            }
            for(int j = 0; j < 7 - i; j++) {
                System.out.print("\\\\");
            }
            for(int j = 0; j < 8 - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
