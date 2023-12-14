import java.util.Scanner;

public class PA_Six {
    enum Status{
        SINGLE,
        Married_Filing_Jointly,
        Married_Filing_Seperately,
        Head_of_Household,
        Default
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your Status ");
        System.out.println("1 for SINGLE");
        System.out.println("2 for Married Filing Jointly");
        System.out.println("3 for Married Filing Seperately");
        System.out.println("4 for Head of Household");
        int x = scan.nextInt();
        Status s = Status.Default;
        if(x==1){ s = Status.SINGLE;}
        else if(x==2){  s = Status.Married_Filing_Jointly;}
        else if(x==3) { s = Status.Married_Filing_Seperately;}
        else if(x==4) { s = Status.Head_of_Household;}
        else {System.out.println("Invalid status");System.exit(0);}
        System.out.println("Enter your Income ");
        double income = scan.nextDouble();


        switch(s){
            case SINGLE:
                if(income <= 8350 && income >= 0){
                    System.out.println("Your Marginal Tax rate is 10%");
                }else if(income <= 33950 && income >= 8351){
                    System.out.println("Your Marginal Tax rate is 15%");
                }else if(income <= 82250 && income >= 33951){
                    System.out.println("Your Marginal Tax rate is 25%");
                }else if(income <= 171550 && income >= 82251){
                    System.out.println("Your Marginal Tax rate is 28%");
                }else if(income <= 372950 && income >= 171551){
                    System.out.println("Your Marginal Tax rate is 33%");
                }else if( income >= 372951){
                    System.out.println("Your Marginal Tax rate is 38%");
                }
                break;
            case Married_Filing_Jointly:
                if(income <= 16700 && income >= 0){
                    System.out.println("Your Marginal Tax rate is 10%");
                }else if(income <= 67900 && income >= 16701){
                    System.out.println("Your Marginal Tax rate is 15%");
                }else if(income <= 137050 && income >= 67901){
                    System.out.println("Your Marginal Tax rate is 25%");
                }else if(income <= 208850 && income >= 137051){
                    System.out.println("Your Marginal Tax rate is 28%");
                }else if(income <= 372950 && income >= 208851){
                    System.out.println("Your Marginal Tax rate is 33%");
                }else if( income >= 372951){
                    System.out.println("Your Marginal Tax rate is 38%");
                }
                break;
            case Married_Filing_Seperately:
                if(income <= 8350 && income >= 0){
                    System.out.println("Your Marginal Tax rate is 10%");
                }else if(income <= 33950 && income >= 8351){
                    System.out.println("Your Marginal Tax rate is 15%");
                }else if(income <= 68525 && income >= 33951){
                    System.out.println("Your Marginal Tax rate is 25%");
                }else if(income <= 104425 && income >= 68526){
                    System.out.println("Your Marginal Tax rate is 28%");
                }else if(income <= 186475 && income >= 104426){
                    System.out.println("Your Marginal Tax rate is 33%");
                }else if( income >= 186476){
                    System.out.println("Your Marginal Tax rate is 38%");
                }
                break;
            case Head_of_Household:
                if(income <= 11950 && income >= 0){
                    System.out.println("Your Marginal Tax rate is 10%");
                }else if(income <= 45500 && income >= 11951){
                    System.out.println("Your Marginal Tax rate is 15%");
                }else if(income <= 117450 && income >= 45501){
                    System.out.println("Your Marginal Tax rate is 25%");
                }else if(income <= 190200 && income >= 117451){
                    System.out.println("Your Marginal Tax rate is 28%");
                }else if(income <= 372950 && income >= 190201){
                    System.out.println("Your Marginal Tax rate is 33%");
                }else if( income >= 372951){
                    System.out.println("Your Marginal Tax rate is 38%");
                }
                break;
            case Default:

        }


    }
}
