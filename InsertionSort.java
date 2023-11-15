import java.util.Arrays;

public class InsertionSort { //declara a classe 
    public static void insertionSort(int[] arr) { //declara o método
        int n = arr.length; //n armazena o array
        for (int i = 1; i < n; ++i) { // itera do segundo elemento até o ultimo 
            int key = arr[i]; //armazena a variavel atual
            int j = i - 1; //indice do elemento anterior ao i ou key

            while (j >= 0 && arr[j] > key) { //se j for maior que o atual key, então move o elemento o indice j para o próximo indice. 
                arr[j + 1] = arr[j]; //decrementa o valor de j para mover para o elemento anterior.
                j = j - 1;
            }
            arr[j + 1] = key; //insere o elemento atual key na posição correta. 
            // Imprime o array a cada iteração
            System.out.println("Iteração " + i + ": " + Arrays.toString(arr));
        }
    }
}

//itera 19 vezes até ordenar 