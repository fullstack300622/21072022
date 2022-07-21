import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int counter = 1;
        int x;

        do {
            System.out.println("Please guess number");
            System.out.println("Numbers of attempts "+ counter);
            x = s.nextInt();
            if (x == 77) {
                System.out.println("Success You win a lot of money!!!!");
                break;
            }
            if(x == 0){
                System.out.println("You cheated!!");
                break;
            }
            if(counter==5){
                System.out.println("You not lucky");
                break;
            }
            counter++;

        } while (true);


//        System.out.println("Success you can go");

//        System.out.println("Process ended");
    }
}
