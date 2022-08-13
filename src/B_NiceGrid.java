import java.util.Scanner;

public class B_NiceGrid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int R = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        if(R == 1 || R == 15 || C == 1 || C == 15) {
            System.out.println("black");
        } else if(R == 2 || R == 14 || C == 2 || C == 14) {
            System.out.println("white");
        } else if(R == 3 || R == 13 || C == 3 || C == 13) {
            System.out.println("black");
        } else if(R == 4 || R == 12 || C == 4 || C == 12) {
            System.out.println("white");
        } else if(R == 5 || R == 11 || C == 5 || C == 11) {
            System.out.println("black");
        } else if(R == 6 || R == 10 || C == 6 || C == 10) {
            System.out.println("white");
        } else if(R == 7 || R == 9 || C == 7 || C == 9) {
            System.out.println("black");
        } else {
            System.out.println("white");
        } 
    }
}
