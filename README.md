# Labirinto

Chegamos ao nosso desafio! Nele, voc� deve realizar um m�todo que represente um labirinto. Para isso, crie um projeto na sua IDE e nele crie uma classe chamada Labirinto. Neste m�todo, desenvolva o que se pede abaixo.

O labirinto ser� um array bidimensional de caracteres. No labirinto, posi��es com 'X' indicam que n�o � poss�vel passar, enquanto posi��es com '  ' (espa�o) indicam que � poss�vel a passagem. O local de destino est� marcado no labirinto com a letra 'D'. Um exemplo de labirinto pode ser visto abaixo:

  XXXXXXXXX   XXXXXX 
X XXXXXXXXX X   XXXX 
X   XXXXXXX XXX XXXX 
XXX XXXXXX  XXX XXXX 
XXX    XX  XXXX     
XXX XX X  XXXXX XXX 
XXXXXX X XXXXXX   X 
XXXXXX   XXXXXX XXXD 

O ponto inicial sempre ser� a posi��o [0][0] do array.

Desta forma, voc� deve (na classe Labirinto): 

Parte 1) Criar um m�todo chamado "carregaLabirinto", que recebe por par�metro uma String fileName e retorna um array bidimensional de caracteres. Este m�todo abre o arquivo indicado por fileName e retorna um array de caracteres, representado no arquivo. O conte�do do arquivo segue o modelo abaixo: 

8 
20 
  XXXXXXXXX   XXXXXX 
X XXXXXXXXX X   XXXX 
X   XXXXXXX XXX XXXX 
XXX XXXXXX  XXX XXXX 
XXX    XX  XXXX     
XXX XX X  XXXXX XXX 
XXXXXX X XXXXXX   X 
XXXXXX   XXXXXX XXXD 

A primeira linha do arquivo (vamos chamar de L) indica o n�mero de linhas do array e a segunda linha (vamos chamar de C) indica o n�mero de colunas. Em seguida, existem L linhas, cada uma com C colunas, preenchidas de forma a criar o array do labirinto. O m�todo cria um array bidimensional de caracteres com as informa��es do arquivo e retorna este array. Dica: pesquise e utilize o m�todo charAt da classe String para percorrer todos os caracteres de uma linha. 

Parte 2) Criar um m�todo recursivo (com m�todos p�blico e privado) chamado labirinto, que recebe um array de caracteres e retorna verdadeiro caso exista pelo menos um caminho para chegar ao destino e falso caso n�o exista. No m�todo p�blico, para criar o array, voc� deve chamar o m�todo carregaLabirinto, criado na parte 1. 

Parte 3) Crie uma classe chamada PrincipalLabirinto. Nela, crie o m�todo main. No main, fa�a o trecho de c�digo necess�rio para executar os m�todos criados, percorrendo um determinado labirinto (o nome do arquivo do labirinto deve ser indicado pelo usu�rio via teclado). Ao final do main, deve ser criado um arquivo chamado "saidaLabirinto.txt" com a frase: "Existe um caminho para o labirinto" ou "N�o existe um caminho para o labirinto", de acordo com o resultado do m�todo recursivo criado. 

 

Ao final, compacte a pasta com os arquivos do seu projeto e envie na tarefa abaixo.