import java.util.ArrayList;

public class Task_8 {
    public static void main(String[] args) {

        //Створити одновимірний масив цілих чисел. Заповнити його десятью значеннями.
        //Знайти максимальне значення у масиві. Потім аналогічно знайти мінімальне та вивести на екран

        int[] arrayNumbers = {876666, 876666, 78, 16161, 347, 76, 487, 876666, 66666, 76};
        int maxNumber = arrayNumbers[0];
        int minNumber = arrayNumbers[0];
        int index = 0;
        int index2 = 0;

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > maxNumber) {
                maxNumber = arrayNumbers[i];
            }
            if (arrayNumbers[i] < minNumber){
                minNumber = arrayNumbers[i];
            }
        }

        ArrayList<Integer> numsMin = new ArrayList<>();
        ArrayList<Integer> numsMax = new ArrayList<>();

        for (int j = 0; j < arrayNumbers.length; j++) {
            if (minNumber == arrayNumbers[j]) {
                index++;
                numsMin.add(j);
            }
            if (maxNumber == arrayNumbers[j]) {
                index2++;
                numsMax.add(j);
            }
        }

        if (index > 1){
            System.out.println("Є декілька числових значень (" + index +"), які дорівнюють одне одому та" +
                    " є мінімальними значенням в масиві. " + "Мінімальне числове значення " + minNumber + ". ");
            System.out.print("Індекси єлементів, котрі дорівнюють одне одому та " +
                    "є мінімальним значенням в масиві: ");


            for (int l = 0; l < numsMin.size();l++){
                if (l <= (numsMin.size() - 1)) {
                    System.out.print(numsMin.get(l) + ", ");
                }
                else {
                    System.out.print(numsMin.get(l));
                }
            }
            System.out.println();
        }

        else {
            System.out.println("Мінімальне числове значення в масиві " + minNumber);
        }

        if (index2 > 1){
            System.out.println("Є декілька числових значень (" + index2 +"), які дорівнюють одне одому та" +
                    " є максимальними значенням в масиві. " + "Максимальне числове значення " + maxNumber);

            System.out.print("Індекси єлементів, котрі дорівнюють одне одому та " +
                    "є максимальним значенням в масиві: ");


            for (int l = 0; l < numsMax.size(); l++){
                if (l <= (numsMin.size() - 1)) {
                    System.out.print(numsMax.get(l) + ", ");
                }
                else {
                    System.out.print(numsMax.get(l));
                }
            }
            System.out.println();
        }

        else {

            System.out.println("Максимальне числове значення в масиві " + maxNumber);
        }


    }
}
