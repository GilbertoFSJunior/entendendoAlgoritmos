/*A pesquisa binária é um algoritmo, que necessita de uma lista ordenada de elementos
para ser funcional, se o elemento alvo da busca estiver na lista, o algoritmo
(pesquisa binária), retornará a sua localização (o seu índice), caso contrário
retornará None.
No exemplo de código abaixo podemos "ler" o seguinte:
1- Primeiro, o código define uma lista (myList) com quatro números: 87, 21, 45 e 93.
 - Depois, ele tenta buscar dois números diferentes na lista usando a função binarySearch: o número 93 (que está na lista)
   e o número 16 (que não está).

2- Quando você chama a função binarySearch, ela verifica:
 - Se a lista está vazia. Se estiver, devolve "-1"(None), indicando que não encontrou o número.

3- Caso a lista tenha números, ele define dois limites:
 - O limite inferior (low), que começa no início da lista. (indice 0)
 - O limite superior (high), que começa no final da lista. (indice 3)

4- A busca ocorre enquanto o limite inferior não ultrapassa o superior:
 - Ele encontra o elemento no meio da lista.
 - Se o número no meio (palpite) é o que você está procurando, ele retorna a posição dele (o índice).
 - Se o número do meio for maior que o procurado, ele "joga fora" a metade superior da lista, ajustando o limite superior.
 - Se for menor, ele "joga fora" a metade inferior da lista, ajustando o limite inferior.

5- Ele repete esse processo até encontrar o número ou até que não tenha mais números para procurar, retornando "-1" se não encontrou.
 */


import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // Definimos uma lista de números inteiros.
        int[] myList = {87, 21, 45, 93};

        // Primeiro, ordenamos a lista para que a pesquisa binária funcione corretamente.
        Arrays.sort(myList); // A lista agora será: {21, 45, 87, 93}.

        // Testamos a pesquisa binária com dois exemplos:
        // Procuramos pelo número 93 (que está na lista) e pelo número 16 (que não está na lista).
        System.out.println(binarySearch(myList, 93)); // Esperamos um índice válido (posição do 93).
        System.out.println(binarySearch(myList, 16)); // Esperamos -1 (número não encontrado).
    }

    public static int binarySearch(int[] list, int item) {
        // Inicializamos os limites da busca.
        int low = 0; // Índice mais baixo (início da lista).
        int high = list.length - 1; // Índice mais alto (fim da lista).

        // Continuamos enquanto a parte que estamos analisando não for eliminada.
        while (low <= high) {
            // Calculamos o índice do meio da parte atual da lista.
            // Usamos (low + (high - low) / 2) para evitar estouro de inteiros.
            int mid = low + (high - low) / 2;

            // Pegamos o número no meio da lista.
            int guess = list[mid];

            // Verificamos se este número é o que estamos procurando.
            if (guess == item) {
                return mid; // Se for, retornamos o índice dele.
            }

            // Se o número do meio for maior que o procurado...
            else if (guess > item) {
                // Ajustamos o limite superior para eliminar a metade maior da lista.
                high = mid - 1;
            }

            // Caso contrário, o número do meio é menor que o procurado...
            else {
                // Ajustamos o limite inferior para eliminar a metade menor da lista.
                low = mid + 1;
            }
        }

        // Se saímos do loop, o número não foi encontrado, então retornamos -1.
        return -1;
    }
}

/* Saida após a execução da classe binarySearch:

3
-1

Process finished with exit code 0

 */
