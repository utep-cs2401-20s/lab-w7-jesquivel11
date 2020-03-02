public class SortOfSort {
    public static void main(String[] args){
        // sorted {6, 5, 2, 1 || 3, 4, 7, 8}
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8}; //unsorted

        //Case: Odd Numbered Array
        int[] arr2 = {1, 2, 3, 4, 5};

        //Case: Duplicate In Even Numbered Array
        int[] arr3 = {1, 2, 3, 4, 5, 5};

        //Case: Duplicare In Odd Numbered Array
        int[] arr4 = {1, 2, 3, 4, 4};

        //Case: The Array Is Composed Of Duplicates
        int[] arr5 = {1, 1, 1, 1};

        //Case: Array Is Composed Of One Element
        int[] arr6 = {1};

        sortArray(arr);
    }
    public static int[] sortArray(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            array[array.length - 1] = max;
        }
        return array;
    }
}
