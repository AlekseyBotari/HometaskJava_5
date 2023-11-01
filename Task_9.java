public class Task_9 {
    public static void main(String[] args) {
        // Знайти суму елементів масива, що знаходяться між мінімальним та максимальним значенням.
        int[] arrayNumbers = {6777, 97, 78, 16161, 37777777, 76, 76, 876666, 66666, 76};
        int maxNumber = arrayNumbers[0];
        int minNumber = arrayNumbers[0];
        int indexMaxNumber = 0;
        int indexMinNumber = 0;
        int indexMinNumber2 = 0;
        int i, j;

        for (i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > maxNumber) {
                maxNumber = arrayNumbers[i];
                indexMaxNumber = i;
            }
            if (arrayNumbers[i] < minNumber){
                minNumber = arrayNumbers[i];
                j = i;
                indexMinNumber = j;
            }
        }

        int min = indexMaxNumber, max = indexMinNumber;

        if (indexMaxNumber > indexMinNumber) {
            max = indexMaxNumber;
            min = indexMinNumber;
        }
        System.out.println(indexMinNumber2);
        System.out.println("Максимальне значення " + maxNumber + ". " + "Індекс елемента - " + indexMaxNumber);
        System.out.println("Мінімальне значення " + minNumber + ". " + "Індекс елемента - " + indexMinNumber);

        int sum = 0;

        for (int currentValue = min; currentValue <= max; currentValue++) {
            sum += arrayNumbers[currentValue];
        }

        System.out.println("Cума елементів масива, що знаходяться між мінімальним та максимальним значенням " + sum);
    }
}
