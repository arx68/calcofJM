/* Класс, с операциями для разделения на римские
   и арабские числа, обработка  исключений */
class Numbers {
    static int[] mainNums(String[] twoNums) {
        int userTypeNumber = 0;
        int[] mainNums = new int[2];
        int[] arabArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] romeArray = {"I", "II", "III", "IV", "V",
                "VI", "VII", "VIII", "IX", "X"};

        for (int i = 0; i <= 9; i++) {
            if (twoNums[0].equalsIgnoreCase(romeArray[i])) {
                mainNums[0] = arabArray[i];
                userTypeNumber++;
            }
            if (twoNums[1].equalsIgnoreCase(romeArray[i])) {
                mainNums[1] = arabArray[i];
                userTypeNumber++;
            }
        }

        // преобразуем введенные пользователем строки, описываем исключения
        if (userTypeNumber == 0) {
            try {
                mainNums[0] = Integer.parseInt(twoNums[0]);
                mainNums[1] = Integer.parseInt(twoNums[1]);
            } catch (NumberFormatException e) {
                System.out.println("throws Exception //т.к. используется недопустимый формат вводимых чисел! ");
                System.exit(0);
            }
        }

        if (userTypeNumber == 1) {
            try {
                mainNums[0]=Integer.parseInt(twoNums[0]);
                mainNums[1]=Integer.parseInt(twoNums[1]);
            } catch (IllegalArgumentException e) {
                System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                System.exit(0);
            }
        }

        if ((mainNums[0] > 10 || mainNums[0] < 1) || (mainNums[1] > 10 & mainNums[1] < 1)) {
            System.out.println("throws Exception //т.к. числа должны быть от одного до десяти.");
            System.exit(0);
        }
        return mainNums;
    }
}