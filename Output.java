 /* Пользователь вводит строку, калькулятор выводит
    результат вычислений в консоль */
class Output {
    static void output() {
        String s = Input.scan();
        char operator = Input.operator(s);
        String[] nums = Input.strArrTwoNum(s);
        int[] mainNums = Numbers.mainNums(nums);

        int arabResult = Operations.calcResult(mainNums[0], mainNums[1], operator);
        String romeResult = Converter.arabToRoman(arabResult);

        // Вывод результата в зависимости от типа чисел (арабские или римские)
        if (Converter.resultTypeRoman(nums) != 0) {
            System.out.println("Output: ");
            System.out.println(romeResult);
        } else {
            System.out.println("Output: ");
            System.out.println(arabResult);
        }
    }
}