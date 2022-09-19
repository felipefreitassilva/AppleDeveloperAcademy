Olívia precisa organizar seus brinquedos. Ela possui n baús baus que inicialmente contém 0 (zero) ou 1 (um) brinquedos dentro. Para organizar seus brinquedos, ela precisa mover todos os brinquedos para um único baú i, onde i representa o i-ésimo baú. Ela pode mover apenas um brinquedo por vez e apenas entre baús adjacentes. Um baú i é considerado adjacente de outro baú j se abs(i - j) = 1. Perceba que após mover um brinquedo de um baú para outro, pode haver mais de um brinquedo em um ou mais baús.

Seu objetivo é construir um programa que auxilie Olívia a decidir em qual baú ela deve guardar todos os seus brinquedos. Para isso, você deve imprimir uma lista com o número mínimo de movimentos necessários para mover os brinquedos para cada um dos baús.

Entrada
A primeira linha contém um inteiro n, que representa o tamanho da lista baus.

A segunda linha contém n inteiros separados por espaço, que são os elementos de baus, sendo:

baus[i] = 0 indica que o i-ésimo baú não possui brinquedos;
baus[i] = 1 indica que o i-ésimo baú possui um brinquedo.
Restrições:

1 ≤ n ≤ 2000
baus[i] ∈ {0, 1}

Saída
Uma lista de inteiros movimentos, separados por espaço, onde movimentos[i] indica a quantidade de movimentos necessários para mover todos os brinquedos para o i-ésimo baú.

Exemplos
Exemplo 1

Entrada:

4
0 1 1 1
Saída:

6 3 2 3
Explicação:

A resposta para cada baú é:

primeiro baú: Olívia precisará mover um brinquedo do segundo baú em um movimento, mais um brinquedo do terceiro baú em dois movimentos (um movimento do terceiro para o segundo baú e outro movimento do segundo para o primeiro baú), mais um brinquedo do quarto baú em três movimentos; ou seja: 1 + 2 + 3 = 6 movimentos;
segundo baú: Olívia precisará mover um brinquedo do terceiro baú para o segundo em um movimento, mais outro brinquedo do quarto baú para o segundo em dois movimentos (passando o brinquedo do quarto para o terceiro e, em seguida, para o segundo); ou seja: 1 + 2 = 3 movimentos;
terceiro baú: Olívia precisará mover um brinquedo do segundo baú em um movimento e outro brinquedo do quarto baú em um movimento; ou seja: 1 + 1 = 2 movimentos;
quarto baú: Olívia precisará mover um brinquedo do terceiro baú para o quarto em um movimento, mais outro brinquedo do segundo baú para o quarto em dois movimentos; ou seja: 1 + 2 = 3 movimentos.

Exemplo 2

Entrada:

2
1 1
Saída:

1 1
Explicação:

Como há apenas dois baús, cada um com um brinquedo, Olívia precisa de exatamente um movimento para mover os brinquedos para qualquer
