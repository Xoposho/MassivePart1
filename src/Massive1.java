import java.util.Arrays;

public class Massive1 {
    public static void main(String[] args) {

        //Massive HomeWork - 1
        System.out.println("Task 1");
        int[] numsIntMassive = new int[]{1, 2, 3};
        double[] numsDoubleMassive = {1.57, 7.654, 9.986};
        String[] strMassive = {"I love cats", "I love my life", "I love chips"};

        System.out.println("Task 2");

        for (int i : numsIntMassive) {
            if (i == numsIntMassive.length) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n");

        for (int i = 0; i < numsDoubleMassive.length; i++) {
            if (i == numsDoubleMassive.length - 1) {
                System.out.print(numsDoubleMassive[i] + " ");
            } else {
                System.out.print(numsDoubleMassive[i] + ", ");
            }
        }

        System.out.println("\n");

        for (int i = 0; i < strMassive.length; i++) {
            if (i == strMassive.length - 1) {
                System.out.print(strMassive[i] + " ");
            } else {
                System.out.print(strMassive[i] + ", ");
            }
        }

        System.out.println("\n");

        System.out.println("Task 3");


        //Task 4

        for (int i = 0; i < numsIntMassive.length; i++) {
            if (numsIntMassive[i] % 2 != 0) {
                numsIntMassive[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numsIntMassive));

    }
}


// by Igor