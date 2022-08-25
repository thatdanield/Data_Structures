public class Rotate {

    public static int[][] rotateArray(int[][] array) {
        int length = array.length;
        int[][] returnArray = new int[array.length][array.length];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++)  {
                returnArray[i][j] = array[returnArray.length - 1 - j][i];
            }
        }
        return returnArray;
    }
}
