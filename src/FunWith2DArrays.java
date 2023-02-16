public class FunWith2DArrays {
    public static int totalElements(int[][] array2D){
        int count = 0;
        for (int[] row : array2D){
            for(int num : row){
                count ++;
            }
        }
        return count;
    }

    public static void fourCorners(String[][] array2D){
        System.out.println(array2D[0][0]);
        System.out.println(array2D[0][array2D[0].length - 1]);
        System.out.println(array2D[array2D.length - 1][0]);
        System.out.println(array2D[array2D.length - 1][array2D[0].length - 1]);
    }

    public static void swapFrontAndBackRows(String[][] array2D){
        String[] temp = array2D[0];
        array2D[0] = array2D[array2D.length - 1];
        array2D[array2D.length - 1] = temp;
    }
}
