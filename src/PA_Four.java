import java.util.Scanner;

public class PA_Four {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Score");
        int x = scan.nextInt();
        if(x >100 || x <0)
            System.out.println("Score out of range");
        else if(x >= 90 && x <= 100)
            System.out.println("A");
        else if(x >= 80 && x <= 89)
            System.out.println("B");
        else if(x >= 70 && x <= 79)
            System.out.println("C");
        else if(x >= 60 && x <= 69)
            System.out.println("D");
        else if(x <= 60)
            System.out.println("F");

    }
}
