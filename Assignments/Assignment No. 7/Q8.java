public class Q8 {
    public static void main(String[] args) {
        
        int[] array = {5, 14, 35, 89, 140};
        int[] targetArray = new int[array.length - 2];

        //Calculate average
        int targetArrayPointer = 0;
        for(int i = 0; i < array.length - 2; i++ ){
            int average;
            int sum = 0;
            for(int j = i; j < (i+3); j++){
                sum = sum + array[j];
            }
            average = sum/3;
            targetArray[targetArrayPointer] = average;
            targetArrayPointer++;
        }

        //Print average array
        for(int i = 0; i < targetArray.length; i++){
            System.out.print(targetArray[i] + " ");
        }
    }
}