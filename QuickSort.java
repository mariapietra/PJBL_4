import java.util.Arrays;

public class QuickSort { //declara a classe 
    public static void quickSort(int[] arr, int low, int high) { //declara o método que divide em dois subarrays o array de inteiros. 
        if (low < high) { //verifica se o indice mais baixo é menor que o indice mais alto 
            int pi = partition(arr, low, high); //o pivô utilizado é o elemento localizado no índice alto (high)
            quickSort(arr, low, pi - 1); //ordena o subarray a esquerda do pivo 
            quickSort(arr, pi + 1, high); //ordena o subarray a direita do pivo.
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; //o pivo é o elemento no indice alto. 
        int i = (low - 1); //inicia o indice do menor elemento
        for (int j = low; j < high; j++) { //aqui percorre a lista da posição baixa até a alta
            if (arr[j] < pivot) { //compara o elemento atual com o pivo
                i++; //incrementa o indice de menor elemnto 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; //troca os elementos menores para a esquerda do pivo.
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp; //coloca o pivo na posição correta 
        // Imprime o array a cada iteração
        System.out.println("Iteração: " + Arrays.toString(arr));
        return i + 1; //retorna o indice do pivo.
    }
}

//itera 15 vezes até ordenar 
//28 é o indice pivo