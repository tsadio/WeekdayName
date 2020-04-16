import java.util.Scanner;

public class WeekdayName {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);

        int days;
        System.out.print("Enter the weekday number from 1-7: ");
        days = in.nextInt();
        while (days > 7 || days < 1) {
            System.out.println("Wrong answer.");
            System.out.print("Enter a weekday number from 1-7: ");
            days = in.nextInt();
        }
        switch (days){
            case 1:
                System.out.println("It's Sunday.");
                break;
            case 2:
                System.out.println("It's Monday.");
                break;
            case 3:
                System.out.println("It's Tuesday.");
                break;
            case 4:
                System.out.println("It's Wednesday.");
                break;
            case 5:
                System.out.println("It's Thursday.");
                break;
            case 6:
                System.out.println("It's Friday.");
                break;
            default:
                System.out.println("It's Saturday.");
        }

    }
}
