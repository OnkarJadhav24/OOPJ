public class Q5 {
    public static void main(String[] args) {
        int[] array = {7, 2, 5, 9, 1, 4, 6};

        int smallest = array[0];
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }  if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}