Dois amigos, Patrícia e Roberto, estão decidindo como dividir a conta do churrasco que fizeram para comemorar a promoção de Patrícia no trabalho. Cada um vai pagar apenas o que consumiu, sendo que Patrícia deixou de consumir apenas um item. Roberto pega a nota fiscal dos produtos comprados itens e calcula a parte de Patrícia. Você deve determinar se o cálculo de Roberto está correto.

Por exemplo, assuma que a nota fiscal contém três itens com os seguintes valores: itens = [4, 6, 8]. Patrícia não consome apenas o terceiro item da nota, sendo ele itens[k] = 8, onde k = 2. Se Roberto calculou a conta corretamente, Patrícia irá pagar (4 + 6) / 2 = 5. Entretanto, Roberto, erroneamente, fez o cálculo com todos os itens da nota e conluiu que Patrícia deve a ele d = 9. Neste caso, Roberto deve reembolsar 9 - 5 = 4 para Patrícia.

Entrada
A primeira linha contém dois inteiros n e k separados por um espaço, onde n representa a quantidade de itens na nota itens e k representa o índice, iniciando em 0 (zero), do item que Patrícia não consumiu.

A segunda linha contém n inteiros separados por um espaço, representando os itens da nota fiscal itens, sendo itens[i] o preço do i-ésimo item da nota.

A terceira linha contém um inteiro d representando o total que Roberto cobrou de Patrícia por sua parte na conta.

Restrições:

2 ≤ n ≤ 105
0 ≤ k < n
0 ≤ itens[i] ≤ 104
0 ≤ d ≤ soma de todos os itens da nota
a quantidade de dinheiro que Patrícia deve será sempre um inteiro

Saída
Se a conta foi dividida corretamente por Roberto, o programa deve imprimir Quites. Se não, o programa deve imprimir um inteiro indicando o valor que Roberto deve a Patrícia, isto é, dcobrado - djusto.

Exemplos
Exemplo 1

Entrada:

5 2
5 8 10 7 6
18
Saída:

5
Explicação:

Como Patrícia não consumiu o item itens[k] = itens[2] = 10, compartilhando os outros itens com Roberto. O valor total dos itens compartilhados é 5 + 8 + 7 + 6 = 26 e, dividido entre os dois, o custo por pessoa é djusto = 13. A saída é quanto Roberto cobrou a mais de Patrícia: 18 - 13 = 5.

Exemplo 2

Entrada:

8 7
93 15 36 20 10 57 39 61
135
Saída:

Quites
Explicação:

Patrícia não consumiu o item itens[k] = itens[7] = 61; a soma dos itens compartilhos é 93 + 15 + 36 + 20 + 10 + 57 + 39 = 270, que dividido entre os dois é 270 / 2 = 135. Roberto cobrou o valor correto de Patrícia, logo a saída é Quites.
