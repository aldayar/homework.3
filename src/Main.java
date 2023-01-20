import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("основное Д.З");
        double digit[]={12.3,-9.8,-3.25,9.12,-7.89,5.0,-2.10,-8.23,-5.56,-4.25,4.56,2.01,6.01,9.85};
        double sum = 0;
        int count = 0;
        boolean tester = false;

        for (double num : digit) {
            if (num < 0 && !tester) {
                tester = true;
            } else if (num > 0 && tester) {
                sum += num;
                count++;
            }
        }

        if (count > 0) {
            double mean = sum / count;
            System.out.println("среднее арифметическое положительных чисел после первого отрицательного: " + mean);
        } else {
            System.out.println("нету положительных после отрицательного");
            System.out.println("-----------------");
        }
        System.out.println("-----------------");
        System.out.println("Д.З на сообразительность ");
        int [] buubleSort = {-4, -2, 2, 3, 6, 8};
        boolean sorter = false;
        int buf;
        while(!sorter) {
            sorter = true;
            for (int i = 0; i < buubleSort.length-1; i++) {
                if(buubleSort[i] > buubleSort[i+1]){
                    sorter = false;

                    buf = buubleSort[i];
                    buubleSort[i] = buubleSort[i+1];
                    buubleSort[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(buubleSort));
        System.out.println("-----------------");

    }


}

