import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//        //a
//        String[][] seatingChart = {
//                {"Abby", "Don", "George", "Kim"},
//                {"Brian", "Elenor", "Harry", "Lenny"},
//                {"Cathy", "Fred", "Jill", "Matt"}};
//
//        for (String[] row : seatingChart){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println();
//
//        //b
//        seatingChart[1][2] = "Paul";
//        for (String[] row : seatingChart){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println();
//
//        //c
//        String temp = seatingChart[0][0];
//        seatingChart[0][0] = seatingChart[2][3];
//        seatingChart[2][3] = temp;
//        for (String[] row : seatingChart){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println();
//
//        //d
//        String[] tempList = seatingChart[0];
//        seatingChart[0] = seatingChart[1];
//        seatingChart[1] = tempList;
//        for (String[] row : seatingChart){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println();
//
//        System.out.println(seatingChart[0][2] + seatingChart[2][0]);


//        //2a
//        int[][] arr1 = new int[2][3];
//        int[][] arr2 = new int[3][2];
//
//        for (int[] row : arr1){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println();
//
//        for (int[] row : arr2){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println();
//
//        //2b
//        arr1[0][0] = 1;
//        arr1[0][1] = 2;
//        arr1[0][2] = 3;
//        arr1[1][0] = 4;
//        arr1[1][1] = 5;
//        arr1[1][2] = 6;
//
//        for (int[] row : arr1){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println();
//
//        //2c
//        arr2[0][0] = 1;
//        arr2[0][1] = 4;
//        arr2[1][0] = 2;
//        arr2[1][1] = 5;
//        arr2[2][0] = 3;
//        arr2[2][1] = 6;
//
//        for (int[] row : arr2){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println();
//
//        System.out.println(arr1[0][2] + arr2[2][0]);
//

// TEST CODE FOR totalElements
        int[][] testArr1 = {{5, 2}, {1, 3}, {7, 9}};
        System.out.println(FunWith2DArrays.totalElements(testArr1));
        int[][] testArr2 = {{1, 2, 3}, {6, 5, 4}};
        System.out.println(FunWith2DArrays.totalElements(testArr2));
        int[][] testArr3 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.totalElements(testArr3));
        int[][] testArr4 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.totalElements(testArr4));
        int[][] testArr5 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};
        System.out.println(FunWith2DArrays.totalElements(testArr5));
        int[][] testArr6 = {{4, 5, 2, 4, 8, 9, 10}, {1, 9, 7, 8, 6, 1, 2}};
        System.out.println(FunWith2DArrays.totalElements(testArr6));
        int[][] testArr7 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.totalElements(testArr7));
        int[][] testArr8 = {{4}};
        System.out.println(FunWith2DArrays.totalElements(testArr8));
        int[][] testArr9 = {{}};
        System.out.println(FunWith2DArrays.totalElements(testArr9));


        // TEST CODE FOR fourCorners
        System.out.println("-------TEST 1-------");
        String[][] words = {{"hi", "bye", "stuff", "go"},
                {"time", "up", "you", "good"},
                {"map", "low", "bow", "mom"}};
        FunWith2DArrays.fourCorners(words);

        System.out.println("-------TEST 2-------");
        String[][] words2 = {{"time", "up", "bye"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"bow", "mom", "joy"}};
        FunWith2DArrays.fourCorners(words2);

        System.out.println("-------TEST 3-------");
        String[][] words3 = {{"phone", "mouse", "keyboard"}};
        FunWith2DArrays.fourCorners(words3);

        System.out.println("-------TEST 4-------");
        String[][] words4 = {{"cat"},
                {"dog"},
                {"hamster"},
                {"bird"}};
        FunWith2DArrays.fourCorners(words4);

        System.out.println("-------TEST 5-------");
        String[][] words5 = {{"time"}};
        FunWith2DArrays.fourCorners(words5);





        // TEST CODE FOR swapFrontAndBackRows
        System.out.println("-------TEST 1-------");
        String[][] w1 = {{"hi", "bye", "stuff", "go"},
                {"time", "up", "you", "good"},
                {"map", "low", "bow", "mom"}};
        System.out.println("--Original:");
        for (String[] innerArr : w1) {
            System.out.println(Arrays.toString(innerArr));
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w1);
        for (String[] innerArr : w1) {
            System.out.println(Arrays.toString(innerArr));
        }
        System.out.println("-------TEST 2-------");
        String[][] w2 = {{"time", "up", "bye"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"bow", "mom", "joy"}};
        System.out.println("--Original:");
        for (String[] innerArr : w2) {
            System.out.println(Arrays.toString(innerArr));
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w2);
        for (String[] innerArr : w2) {
            System.out.println(Arrays.toString(innerArr));
        }

        System.out.println("-------TEST 3-------");
        String[][] w3 = {{"phone", "mouse", "keyboard"}};
        System.out.println("--Original:");
        for (String[] innerArr : w3) {
            System.out.println(Arrays.toString(innerArr));
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w3);
        for (String[] innerArr : w3) {
            System.out.println(Arrays.toString(innerArr));
        }

        System.out.println("-------TEST 4-------");
        String[][] w4 = {{"cat"},
                {"dog"},
                {"hamster"},
                {"bird"}};
        System.out.println("--Original:");
        for (String[] innerArr : w4) {
            System.out.println(Arrays.toString(innerArr));
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w4);
        for (String[] innerArr : w4) {
            System.out.println(Arrays.toString(innerArr));
        }

        System.out.println("-------TEST 5-------");
        String[][] w5 = {{"time"}};
        System.out.println("--Original:");
        for (String[] innerArr : w5) {
            System.out.println(Arrays.toString(innerArr));
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w5);
        for (String[] innerArr : w5) {
            System.out.println(Arrays.toString(innerArr));
        }



    }
}
