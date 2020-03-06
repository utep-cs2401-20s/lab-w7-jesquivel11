import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortOfSortTester {
    public int[] arr = {1, 6, 3, 5, 8, 2, 4, 7}; //unsorted

    //Case: Odd Numbered Array
    public int[] arr2 = {1, 2, 3};

    //Case: Duplicate In Even Numbered Array
    public int[] arr3 = {1, 2, 3, 4, 5, 5};

    //Case: Duplicate In Odd Numbered Array
    public int[] arr4 = {1, 2, 3, 4, 5, 6, 3};

    //Case: The Array Is Composed Of Duplicates
    public int[] arr5 = {1, 1, 1, 1};

    //Case: Array Is Composed Of One Element
    public int[] arr6 = {1};

    @Test
    public void Test1(){
        int [] result = {6, 5, 2, 1, 3, 4, 7, 8};
        SortOfSort.sortArray(arr);
        assertArrayEquals(result, arr);
    }
    @Test
    public void Test2(){
        int [] result = {4, 3, 2, 1, 5, 5 };
        SortOfSort.sortArray(arr3);
        assertArrayEquals(result, arr3);
    }
    @Test
    public void Test3(){
        int [] result = {4, 3, 1, 2, 3, 5, 6};
        SortOfSort.sortArray(arr4);
        assertArrayEquals(result, arr4);
    }
    @Test
    public void Test4(){
        int [] result = {1, 1, 1, 1};
        SortOfSort.sortArray(arr5);
        assertArrayEquals(result, arr5);
    }
    @Test
    public void Test5(){
        int [] result = {1};
        SortOfSort.sortArray(arr6);
        assertArrayEquals(result, arr6);
    }
}