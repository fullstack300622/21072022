import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num1,num2;

        do {
            System.out.println("Please enter two equal numbers");
            num1 = s.nextInt();
            num2 = s.nextInt();
        }while (num1 != num2);

        System.out.println("Success!!");


//        Scanner s = new Scanner(System.in);
//        int x1, x2, x3, x4, x5;
//            System.out.println("Please enter numn1");
//            x1 = s.nextInt();
//            System.out.println("Please enter numn2");
//            x2 = s.nextInt();
//            System.out.println("Please enter numn3");
//            x3 = s.nextInt();
//            System.out.println("Please enter numn4");
//            x4 = s.nextInt();
//            System.out.println("Please enter numn5");
//            x5 = s.nextInt();
//         while (x1 + x2 + x3 + x4 + x5 < 100){
//             System.out.println("Please try again");
//             System.out.println("Please enter numn1");
//             x1 = s.nextInt();
//             System.out.println("Please enter numn2");
//             x2 = s.nextInt();
//             System.out.println("Please enter numn3");
//             x3 = s.nextInt();
//             System.out.println("Please enter numn4");
//             x4 = s.nextInt();
//             System.out.println("Please enter numn5");
//             x5 = s.nextInt();
//         }



    }
}
