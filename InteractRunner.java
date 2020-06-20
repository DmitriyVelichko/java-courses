import java.util.Scanner;

public class InteractRunner {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        try {
            Calculator calc = new Calculator();
            String exit = "no";
            int first = 0;
            int second = 0;
            int result = calc.getResult();

            while (!exit.equals("yes")) {

                if(result != 0){
                    System.out.println("First argument " + result);
                    first = result;
                } else {
                    System.out.println("Input first argument...");
                    first = sc.nextInt();
                }

                System.out.println("Input Second argument...");
                second = sc.nextInt();

                System.out.println("Change operation? add/sub/mul/div");
                String operation = sc.next();

                switch (operation) {
                    case ("add"):
                        calc.add(first, second);
                        break;
                    case ("sub"):
                        calc.sub(first, second);
                        break;
                    case ("mul"):
                        calc.mul(first, second);
                        break;
                    case ("div"):
                        calc.div(first, second);
                        break;
                }

                result = calc.getResult();
                System.out.println("Result: " + result);

                System.out.println("Save result? yes/no");
                String save = sc.next();
                if(save.equals("no")){
                    calc.cleanResult();
                    result = 0;
                }

                System.out.println("Exit? yes/no");
                exit = sc.next();
            }
        } finally {
            sc.close();
        }
    }
}
