import java.util.*;
class SessionTwo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

// success or fail
        System.out.println("enter a number : ");
        double number = input.nextDouble();
        String status = (number >= 50)? "succeeded":"failed";
        System.out.println(status);

// second
        String numberRange = (number > 100)? "Greater than 100":"Less than 100";
        System.out.println(numberRange);

// switch statement of week's days
        System.out.println("Today is: (Monday = 1, )");
        int day = input.nextInt();
        switch (day){
            case 1:
                System.out.println("it's Monday you have work today");
                break;
            case 2:
                System.out.println("it's Tuesday you have work today");
                break;
            case 3:
                System.out.println("it's Wednesday you have work today");
                break;
            case 4:
                System.out.println("it's Thursday you have work today");
                break;
            case 5:
                System.out.println("it's Friday today is off");
                break;
            case 6:
                System.out.println("it's Saturday Today is off");
                break;
            case 7:
                System.out.println("it's Sunday you have work today");
                break;
            default:
                System.out.println("wrong input! ");
        }
//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
    }
}
