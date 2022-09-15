import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
            int num1;
            int num2;
            int ans;
            char op;
            Scanner reader = new Scanner(System.in);
            System.out.print("Введите число ");
            num1 = reader.nextInt();
            System.out.print("Введите операцию (+, -, *, /): ");
            op = reader.next().charAt(0);
            System.out.println("Введите число");
            num2 = reader.nextInt();
            switch (op) {
                case '+':
                    ans = num1 + num2;
                    break;
                case '-':
                    ans = num1 - num2;
                    break;
                case '*':
                    ans = num1 * num2;
                    break;
                case '/':
                    ans = num1 / num2;
                    break;
                default:
                    System.out.println("Не верная операция");
                    return;
            }

            System.out.println("Итог");
            System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
            System.out.println("Поледнее число" + " " + ans);


            do {
                int num3;
                int ans2;
                String c;
                Scanner reader1 = new Scanner(System.in);
                System.out.println("Введите последнее число");
                num3 = reader1.nextInt();
                    System.out.print("Введите операцию (+, -, *, /): ");
                    op = reader1.next().charAt(0);
                    System.out.println("Введите число");
                    num2 = reader1.nextInt();
                    switch (op) {
                        case '+':
                            ans2 = num3 + num2;
                            break;
                        case '-':
                            ans2 = num3 - num2;
                            break;
                        case '*':
                            ans2 = num3 * num2;
                            break;
                        case '/':
                            ans2 = num3 / num2;
                            break;
                        default:
                            System.out.println("Не верная операция");
                            return;


                    }
                    System.out.println("Итог");
                    System.out.println(num3 + " " + op + " " + num2 + " = " + ans2);
                    System.out.println("Поледнее число" + " " + ans2);
                }while (true);
            }




}
