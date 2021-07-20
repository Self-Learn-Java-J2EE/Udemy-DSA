public class SelectionSort {


    /*
        Crux is - with in array Swapping and in the due Process of Sorting  - it splits between sorted and unsorted
        Pick an index with the Assumption of thats the highest - iterate the whole comparing with the value in that index - if any of the
        index is higher than that  - replace the highest index with that - For Each Iteration at the end - Swap the highest number
        with the index which we are sorting and the existing value in the index that we are sorting to the index where the highest number was present


        Doesn't Require So much Swapping like Bubble Sort

        //quadratic Algorithm - algorithm whose performance is directly proportional to the squared size


     */

    public static void main(String[] args) {
        int[] unsortedNumber = {20,35,-15,7,55,1,-22};
        for (int i = unsortedNumber.length-1; i >0 ; i--) {
            int highestindexongivenIteration =0;
            for (int j = 0; j <= i; j++) {
                if (unsortedNumber[j] > unsortedNumber[highestindexongivenIteration]){
                    highestindexongivenIteration = j;
                }
                int temp = unsortedNumber[i];
                unsortedNumber[i] = unsortedNumber[highestindexongivenIteration];
                unsortedNumber[highestindexongivenIteration] = temp;
            }
        }
        for (int i : unsortedNumber) {
            System.out.println(i);
        }

    }

}
