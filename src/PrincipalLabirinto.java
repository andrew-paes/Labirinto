/*
 Crie uma classe chamada PrincipalLabirinto. 
 Nela, crie o método main. 
 	No main, faça o trecho de código necessário para executar os métodos criados, 
 	percorrendo um determinado labirinto 
 		(o nome do arquivo do labirinto deve ser indicado pelo usuário via teclado). 
 Ao final do main, deve ser criado um arquivo chamado "saidaLabirinto.txt" 
 	com a frase: 
 		"Existe um caminho para o labirinto" 
 		ou "Não existe um caminho para o labirinto", 
	de acordo com o resultado do método recursivo criado. 
 */
public class PrincipalLabirinto {
	private int linhaMax;
	private int colunaMax;
	
	public static void main(String[] args) {
		System.out.println("Nome do Jogador 1:");
		
		Labirinto labirinto = new Labirinto(carregaLabirinto(""));
		String resultado;
		
		if(labirinto.temSaida()) {
			resultado = "Existe um caminho para o labirinto";			
		}
		else {
			resultado = "Não existe um caminho para o labirinto";
		}
	}
	
	/*
	Criar um método chamado "carregaLabirinto", que recebe por parâmetro uma String fileName e retorna um array bidimensional de caracteres. 
	Este método abre o arquivo indicado por fileName e retorna um array de caracteres, representado no arquivo.
	
	A primeira linha do arquivo (vamos chamar de L) indica o número de linhas do array 
		e a segunda linha (vamos chamar de C) indica o número de colunas.
	Em seguida, existem L linhas, cada uma com C colunas, preenchidas de forma a criar o array do labirinto. 
	O método cria um array bidimensional de caracteres com as informações do arquivo e retorna este array. 
	Dica: pesquise e utilize o método charAt da classe String para percorrer todos os caracteres de uma linha. 
	*/
	public static char[][] carregaLabirinto(String fileName) {
		char[][] labirinto = new char[0][0];
		
		return labirinto;
	}
}