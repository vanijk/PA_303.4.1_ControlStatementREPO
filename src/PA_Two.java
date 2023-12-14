import java.util.Scanner;

public class PA_Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x < 10)
            System.out.println("Less Than 10");
        else
            System.out.println("Greater Than 10");
    }
}
