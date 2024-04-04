##Primeira## 

Esta função realiza uma pesquisa recursiva, dividindo o tamanho n em 1/3 a cada chamada. A operação dentro da função tem um custo constante.

Complexidade de tempo é -> O(log3(n)).

##Segunda##

Esta função realiza uma pesquisa recursiva descartando uma porção específica dos elementos (2/5 neste caso), o que reduz o tamanho do problema em relação a n.

Complexidade de tempo é O(log5/3(n)).

##Terceira##

A função Pesquisa3 realiza uma chamada recursiva, onde a entrada é reduzida para 2/3 do tamanho original n. Esta função não realiza diretamente uma ordenação, mas faz uma chamada recursiva para si mesma com uma fração específica dos elementos.

Complexidade de tempo é -> O(log3/2(n)).

##Mágica##

Enigma2 realiza um particionamento do array A de acordo com um pivô x. Esse particionamento parece ser semelhante ao particionamento usado no Quicksort, com duas iterações usando dois índices (i e j) e trocando elementos de posição.

A complexidade de Enigma2 é O(n), onde n é a diferença entre i e j.

Enigma1 chama Enigma2 para ordenar uma faixa específica do array, e então faz chamadas recursivas baseadas no resultado da ordenação.