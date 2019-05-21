public class TransposeArray {

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[0].length; ++j) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void transpose(int[][] array) {
        int[][] newArray = new int[array[0].length][array.length];
        for(int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[0].length; ++j) {
                newArray[j][i] = array[i][j];
            }
        }
        printArray(newArray);
    }

    public static void main(String[] args) {
        int twodim[][] = {{1,2,3},
                          {4,5,6}};
        System.out.println("Original Array: ");
        printArray(twodim);
        System.out.println("Transposed Array: ");
        transpose(twodim);
    }

}
