import java.util.Arrays;

public class BubbleSort {

    //Crux is - with in array Swapping and in the due Process of Sorting  - it splits between sorted and unsorted
    //quadratic Algorithm - algorithm whose performance is directly proportional to the squared size
    /*Keep the reference of the Index which we are sorting - to start with the last index of the array - Start Comparing - consecutive items
    which ever is higher - move it closer to the right - there by highest number bubbles up
     */




    public static void main(String[] args) {
        int[] unsortedNumbers = {20,35,-15,7,55,1,-22};

        for (int i = unsortedNumbers.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (unsortedNumbers[j] > unsortedNumbers[j+1]){
                    int temp = unsortedNumbers[j+1];
                    unsortedNumbers[j+1] = unsortedNumbers[j];
                    unsortedNumbers[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array ");
        for (int unsortedNumber : unsortedNumbers) {
            System.out.println(unsortedNumber);
        }
    }


    public static void main1(String[] args) {

        int[] unsortedNumbers = {20,35,-15,7,55,1,-22};
        int unsortedIndex = unsortedNumbers.length-1;


        while(unsortedIndex>0){
            for (int i=0;i<unsortedIndex;i++){
                if (unsortedNumbers[i] > unsortedNumbers[i+1]){
                    int temp = unsortedNumbers[i+1];
                    unsortedNumbers[i+1] = unsortedNumbers[i];
                    unsortedNumbers[i] = temp;
                }
            }
            unsortedIndex--;
        }


        System.out.println("Sorted Array ");
        for (int unsortedNumber : unsortedNumbers) {
            System.out.println(unsortedNumber);
        }


    }
}
