import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        scanner();

//        // Kontrollon nëse ka argumente të dhëna në linjën e komandës
//        if (args.length == 0) {
//            System.out.println("Ju lutem jepni disa numra si argumente.");
//            return;
//        }
//
//        int sum = 0;
//        // Shton numrat e dhënë si argumente
//        for (String arg : args) {
//            try {
//                int num = Integer.parseInt(arg);
//                sum += num;
//            } catch (NumberFormatException e) {
//                System.out.println("Argumenti '" + arg + "' nuk është një numër dhe është injoruar.");
//            }
//        }
//
//        // Shfaq rezultatin e shtimit të numrave
//        System.out.println("Shuma e numrave është: " + sum);
    }


        public static void scanner() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ju lutem jepni disa numra të plotë (për të ndaluar, shtypni një karakter jo-numër):");

            int sum = 0;
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum += num;
            }

            System.out.println("Shuma e numrave është: " + sum);
    }

}
