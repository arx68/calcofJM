// вычисляем результат из операндов и оператора
class Operations {

    // метод для калькуляции
    static int calcResult(int a, int b, char operator) {
        int result;
        switch (operator) {
            case '+':
                result = (a + b);
                break;
            case '-':
                result = (a - b);
                break;
            case '*':
                result = (a * b);
                break;
            case '/':
                result = (a / b);
                break;
            default:
                throw new IllegalStateException("Неожиданное значение");
        }
        return result;
    }
}