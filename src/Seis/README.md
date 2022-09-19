Marcela está jogando um videogame de pular plataformas. Seu objetivo é pular até a última plataforma com a menor quantidade possível de pulos. Cada plataforma contém um número inteiro não negativo indicando o tamanho máximo do pulo que o personagem pode fazer a partir da plataforma em que ele se encontra atualmente.

No videogame, o personagem inicia posicionado na primeira plataforma, ou seja, na plataforma de índice 0 e as plataformas estão dispostas de forma sequencial.

Assuma que sempre é possível chegar na última plataforma.

Entrada
A primeira linha contém um inteiro n, que representa a quantidade de plataformas.

A segunda linha contém n inteiros não negativos separados por espaço, que indicam o tamanho máximo do pulo da plataforma plataformas[i], onde:

plataformas é a lista com os tamanhos de pulo de cada plataforma; e
i é a i-ésima plataforma da lista.
Restrições:

1 ≤ n ≤ 104
0 ≤ plataformas[i] ≤ 1000

Saída
Um número inteiro representando a quantidade mínima de pulos necessários para chegar até a última plataforma, ou seja, até a plataforma n - 1.

Exemplos
Exemplo 1

Entrada:

5
2 3 1 1 9
Saída:

2
Explicação:

A quantidade mínima de pulos para chegar ao último índice é 2. Pule uma vez da plataforma 0 para 1 e pule outra vez da plataforma 1 para a 4 (pulando 3 plataformas em um único pulo).

Exemplo 2

Entrada:

2
2 0
Saída:

1
