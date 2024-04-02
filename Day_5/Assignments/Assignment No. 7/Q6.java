public class Q6 {
    public static void main(String[] args) {
        int[] array = {24,54,31,16,82,45,67};

        //Find the first largest number
        int firstLargestNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > firstLargestNumber)
                firstLargestNumber = array[i];
        }

        //Find the second  largest number
        int secondLargestNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > secondLargestNumber && array[i] < firstLargestNumber)
                secondLargestNumber = array[i];
        }

        //Find the third largest number
        int thirdLargestNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > thirdLargestNumber && array[i] < secondLargestNumber)
                thirdLargestNumber = array[i];
        }

        System.out.println("The first largest number is : " + firstLargestNumber);
        System.out.println("The second largest number is : " + secondLargestNumber);
        System.out.println("The third largest number is : " + thirdLargestNumber);

    }
}