public class Main {
    public static void main(String[] args) {
        //Task №1
        System.out.println("Задание №1");

        int[] firstArray = new int[]{1, 2, 3};
        float[] secondArray = {1.57f, 7.654f, 9.986f};
        int[] thirdArray = {27, 11, 1990};

        //Task №2
        System.out.println("");
        System.out.println("Задание №2");

        System.out.println(firstArray[0] + ", " + firstArray[1] + ", " + firstArray[2]);
        System.out.println(secondArray[0] + ", " + secondArray[1] + ", " + secondArray[2]);
        System.out.println(thirdArray[0] + ", " + thirdArray[1] + ", " + thirdArray[2]);

        //Task №3
        System.out.println("");
        System.out.println("Задание №3");
        for (int i = firstArray.length-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(firstArray[i] + ", ");
            } else
                System.out.println(firstArray[i]);
        }

        for (int i = secondArray.length-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(secondArray[i] + ", ");
            } else
                System.out.println(secondArray[i]);
        }
        for (int i = thirdArray.length-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(thirdArray[i] + ", ");
            } else
                System.out.println(thirdArray[i]);
        }

        //Task №4
        System.out.println("");
        System.out.println("Задание №4");

        for (int i = 0; i < firstArray.length; i++) {

            if (firstArray[i] % 2 != 0) {
            firstArray[i] ++;
                System.out.print(firstArray[i] + " ");
            }
        }


    }
}