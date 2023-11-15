import java.util.Arrays;

public class Main {
    public static void main(String[] args) { //arry de entrada
        int[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
        
        // Bubble Sort 
        System.out.println("Bubble Sort");
        BubbleSort.bubbleSort(array.clone());
        
        // Insertion Sort
        System.out.println("Insertion Sort");
        InsertionSort.insertionSort(array.clone());
        
        // Quick Sort
        System.out.println("Quick Sort");
        QuickSort.quickSort(array.clone(), 0, array.length - 1);
    }
}