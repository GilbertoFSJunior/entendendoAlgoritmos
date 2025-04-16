# entendendoAlgoritmos
##Linguagem utilizada: JAVA

Modelo de Lógica - Pesquisa Binária
1. Definir o Problema
- Especificar o objetivo do algoritmo.- Exemplo: Procurar um número específico em uma lista organizada.



2. Identificar Pré-requisitos
- Verificar se a lista está ordenada.- Caso não esteja, planejar uma etapa para ordená-la.



3. Configurar os Limites da Lista
- Estabelecer os índices:- Inicial (low): Começa no início da lista.
- Final (high): Começa no fim da lista.



4. Planejar a Busca
- Criar um loop que continue enquanto o limite inferior for menor ou igual ao limite superior.
- Dividir a lista ao meio repetidamente:- Calcular o índice do meio.
- Obter o valor no meio (palpite).



5. Definir as Condições de Parada
- Se o palpite for igual ao número procurado:- Parar a busca e retornar o índice.

- Se o palpite for maior que o número procurado:- Ajustar o limite superior para eliminar a metade maior da lista.

- Se o palpite for menor que o número procurado:- Ajustar o limite inferior para eliminar a metade menor da lista.



6. Considerar o Caso do Número Não Encontrado
- Condição final: Se os limites se cruzarem (ou seja, o índice inferior ultrapassar o superior), retornar um valor especial como -1 para indicar que o número não está na lista.


7. Testar o Algoritmo
- Escolher diferentes exemplos de listas e números para testar:- Um número que está na lista (casos de sucesso).
- Um número que não está na lista (casos de falha).



Exemplo de Passos para o Algoritmo
Para a lista [21, 45, 87, 93] e procurando o número 87:
- Definir os limites:- low = 0 (início da lista) e high = 3 (final da lista).

- Calcular o meio:- mid = (low + high) / 2 = 1.
- O número no índice 1 é 45.

- Comparar o palpite (45) com o número procurado (87):- 45 é menor, então ajustamos: low = mid + 1.

- Recalcular o meio com os novos limites:- Agora, low = 2 e high = 3.
- mid = (low + high) / 2 = 2.
- O número no índice 2 é 87.

- Comparar novamente:- O palpite (87) é igual ao número procurado!
- Retornar o índice 2.



Resumo da Lógica em Palavras
- Organize a lista.
- Estabeleça os limites inicial e final.
- Encontre o meio e compare com o número desejado.
- Ajuste os limites com base no resultado da comparação.
- Pare ao encontrar o número ou quando não houver mais números para verificar.




