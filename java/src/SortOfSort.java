public class SortOfSort {
    public static void main(String[] args){
        // sorted {6, 5, 2, 1 || 3, 4, 7, 8}
        int[] arr = {1, 5, 3, 8, 2, 6, 7, 4}; //unsorted

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
    public static void sortArray(int[] array){

        printArray(array);
        int max = array[0];
        int count = 0;
        if(count <= 2){
            for(int i = 0; i < array.length; i++){
                if(array[i] > max){

                }
            }
            count++;
        }

        printArray(array);
    }
    public static void printArray(int[] array){

        int count = 0;
        System.out.print("{ ");
        while(count < array.length){
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i] + ", ");
                count++;
            }
            System.out.println("}");
        }
    }
}
