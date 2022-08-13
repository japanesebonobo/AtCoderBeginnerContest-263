import java.util.*;

public class A_WorldCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt();
        int R = scanner.nextInt();
        String ans = "atcoder";

        ans =ans.substring(L-1, R);

        System.out.println(ans);
    }
}
