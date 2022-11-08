public class Massive1 {
    public static void main(String[] args) {

        //Massive HomeWork - 1
        //Task 1
        int[] numsIntMassive = new int[] { 1, 2, 3 };
        double[] numsDoubleMassive = { 1.57, 7.654, 9.986 };
        String[] strMassive = { "I love cats", "I love my life", "I love chips" };

        //Task 2
        System.out.println(numsIntMassive [0] + ", " + numsIntMassive [1] + ", " + numsIntMassive [2]);
        System.out.println(numsDoubleMassive [0] + ", " + numsDoubleMassive [1] + ", " + numsDoubleMassive [2]);
        System.out.println(strMassive [0] + ", " + strMassive [1] + ", " + strMassive [2]);

        System.out.println("\n");

        //Task 3
        System.out.println(numsIntMassive [2] + ", " + numsIntMassive [1] + ", " + numsIntMassive [0]);
        System.out.println(numsDoubleMassive [2] + ", " + numsDoubleMassive [1] + ", " + numsDoubleMassive [0]);
        System.out.println(strMassive [2] + ", " + strMassive [1] + ", " + strMassive [0]);

        System.out.println("\n");

        //Task 4

        for (int i : numsIntMassive) {
            if (i % 2 != 0) {
                System.out.println(i + 1);
            }

        }

    }
}