public class Q9 {
    public static void main(String[] args) {
        int[] series = {1, 4, 27, 16, 125, 36};
        
        System.out.print("Series: ");
        for (int i = 0; i < series.length; i++) {
            System.out.print(series[i]);
            if (i < series.length - 1) {
                System.out.print(", ");
            }
        }
    }
}