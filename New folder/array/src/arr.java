public class arr {

    public static void main(String[] args) {
        int[][] numbers = new int[4][];
        int k = 0;
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                numbers[i][j] = k++;
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }

}
