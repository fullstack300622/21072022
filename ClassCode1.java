import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("you start buying food");
//        int x = 0;
//        do {
//            x += s.nextInt();
//            System.out.println("You spend " + x + " shekels");
//        } while (x < 250);


        int x = s.nextInt();
        System.out.println("You spend " + x + " shekels");
        while (x < 250) {
            x += s.nextInt();
            System.out.println("You spend " + x + " shekels");
        }
//        System.out.println("you spend overall " + x);


//        System.out.println("Please enter number");
//        int x = s.nextInt();
//        while (x>=0){
//            x = s.nextInt();
//            System.out.println(x);
//        }
//        System.out.println("Success you entered number lower than 0");

//       int x = 0;
//       while (x<=10){
//           System.out.println("Hello world");
//           System.out.println(x);
//           x++;
//       }

    }
}
