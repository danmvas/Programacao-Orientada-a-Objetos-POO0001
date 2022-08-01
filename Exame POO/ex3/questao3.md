# Questao 3

## Resposta: Código 2

### Código 1

O código está fazendo a chamada dos tipos corretamente, mas a conta dos números não retornam 29.

Sucessor de 3 = 4
Antecessor de 4 = 3
Dobro de 5 = 10
Soma de 4 + 3 + 10 = **17**

### Código 2

O código está chamando os tipos corretamente, pois, é possível instanciar uma abstrata chamando sua filha logo em seguida, como é feito em *Propriedade s = new Sucessor()*.
Conferindo a matemática, também observamos que o resultado dos números passados como parâmetros retorna 29.

Sucessor de 6 = 7
Antecessor de 7 = 6
Dobro de 8 = 16
Soma de 7 + 6 + 16 = **29**

### Código 3

A matemática dos números pode estar certa (como conferida no item anterior), mas o código não retornará 29. Isso porque não é possível converter um tipo abstrato em seu tipo filho, como está sugerindo essa linha de código.
