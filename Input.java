import java.util.Scanner;
/* Класс, в котором мы вводим строку и парсим на массив из 2-х значений,
  а также выделяем оператор для калькуляции */
class Input {
    // метод, где сканируем ввод пользователя
    static String scan() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        scanner.close();
        return scan;
    }

     // очищаем строку от пробелов и разделяем ее на два операнда
    static String[] strArrTwoNum(String scan) {

        String local = scan.replaceAll("\\s+", "");
        String[] strArrTwoNum;
        strArrTwoNum = local.split("[+-/*]");
        return strArrTwoNum;
    }

     /* выделяем из строки оператор, проверяем количество введенных
        символов, обработка их исключения */
    static char operator(String scan) {
        char localOperator = 0;
        String op = scan.replaceAll("[^+-/*]", "");
        int opLength = op.length();

        if (opLength != 1) {
            System.out.println("throws Exception //т.к. формат операции не удовлетворяет заданию - 2 операнда и 1 оператор (+, -, /, *)");
            System.exit(0);
        } else {
            localOperator = op.charAt(0);
        }
        return localOperator;
    }
}