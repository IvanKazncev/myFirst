public class Scanner {
    public void nextInt
            void next

    {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt(); //считывает число
    /*Метод next() класса Scanner считывает строку,
    а метод charAt(0) позволяет взять первый символ в этой строке.
     так мы получаем операцию, которую нужно выполнить*/
        char operation = scanner.next().charAt(0);
    }

}
