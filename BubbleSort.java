import java.util.Arrays;

public class BubbleSort { //declara a classe
    public static void bubbleSort(int[] arr) {  //declara o método 
        int n = arr.length; //n armazena o tamanho do array
        boolean isSorted = false; //valor boleanno que indica se o array está ordenado e começa com o valor falso.
        for (int i = 0; i < n-1 && !isSorted; i++) { //loop principal do bubble sort. o loop vai iterar o i até que ele fiquei do tamanho do array ou que o isSorted seja positivo. isso vai ordenar o array.
            isSorted = true; 
            for (int j = 0; j < n-i-1; j++) { //loop interno.itera j até que atinja o tamanho do array - i. 
                if (arr[j] > arr[j+1]) { 
                    int temp = arr[j];  
                    arr[j] = arr[j+1]; //se o j for maior que o j+1, então eles trocam de lugar. 
                    arr[j+1] = temp;
                    isSorted = false; //valor false indica que não está ordenado. 
                }
                // Imprima o array a cada iteração, por isso temos 304 impressões.
                System.out.println("Iteração " + (i*n + j + 1) + ": " + Arrays.toString(arr));
            }
        }
    }

    public static void main(String[] args) { //declara a main e o array fornecido. chama o bubble sort pra ordenar o array. 
        int[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
        bubbleSort(array);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }
}

//itera 304 vezes, antes estava com 361 vezes 
