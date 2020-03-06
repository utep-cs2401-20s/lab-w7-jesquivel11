public class SortOfSort {
    public static void main(String[] args){
        // sorted {6, 5, 2, 1 || 3, 4, 7, 8}
        int[] arr = {1, 6, 3, 5, 8, 2, 4, 7}; //unsorted

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
        int count = 0;
        int maxFound = 0;
        int max = array[0];
        int first = 0;
        int last = array.length - 1;
        int temp = 0;

        while(first < last){
            max = array[first];
            for(int i = first; i <= last ; i++){
                if(array[i] >= array[maxFound]){
                    max = array[i];
                    maxFound = i;
                    System.out.println("Max is: " + array[i]);
                    System.out.println("Max found at: " + maxFound);

                }
            }

            if(count == 4){
                count = 0;
            }
            if(count < 2){
                temp = array[last];
                System.out.println("This is temp: " + temp);

                array[last] = max;
                System.out.println("array[last] is: " + array[last]);

                array[maxFound] = temp;
                System.out.println("array[maxFound] is: " + array[maxFound]);


                last --;
                count++;
                printArray(array);
            }
            else{

                temp = array[first];
                System.out.println("This is temp: " + temp);

                array[first] = max;
                System.out.println("array[first] is: " + array[last]);

                array[maxFound] = temp;
                System.out.println("array[maxFound] is: " + array[maxFound]);

                first ++;
                count++;
                printArray(array);

            }
        }
        printArray(array);
    }
    public static void printArray(int[] array){

        int count = 0;
        System.out.print("{ ");
        while(count < array.length){
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
                count++;
            }
            System.out.println("}");
        }
    }
}
