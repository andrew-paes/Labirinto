
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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PrincipalLabirinto {
	private int linhaMax;
	private int colunaMax;
	private static String resultado;
	public static Scanner _scanner;

	public static void main(String[] args) {
		_scanner = new Scanner(System.in);
		boolean arquivoEncontrado = false;
		File f;

		do {
			System.out.println("Digite o nome do arquivo:");
			String filename = _scanner.nextLine();

			f = new File(filename);
			arquivoEncontrado = f.exists() ? true : false;

		} while (!arquivoEncontrado);

		if (arquivoEncontrado) {
			System.out.println("Arquivo: " + f.getName());
			System.out.println("Caminho: " + f.getAbsolutePath());
			
			Labirinto labirinto = new Labirinto(carregaLabirinto(""));
			labirinto.imprime();

			if (labirinto.temSaida()) {
				resultado = "Existe um caminho para o labirinto";
			} else {
				resultado = "Não existe um caminho para o labirinto";
			}
			
			System.out.println(resultado);
		}

		/*
		 * String nomeDir = "../"; File f1 = new File(nomeDir); if (f1.isDirectory()) {
		 * System.out.println("Diretório " + nomeDir); String s[] = f1.list(); for (int
		 * i = 0; i < s.length; i++) { f = new File(s[i]); System.out.print(s[i]); if
		 * (f.isDirectory()) System.out.println(" <dir> "); else
		 * System.out.println(" <file>"); } } else System.out.println(nomeDir +
		 * " não é um diretório.");
		 * 
		 * System.out.println("*********"); System.out.println("*********");
		 * 
		 * String texto = "Grêmio--é--o--melhor--time--!!"; String separada[] =
		 * texto.split("--"); for (int i = 0; i < separada.length; i++) {
		 * System.out.println("Palavra " + (i + 1) + ": " + separada[i]); }
		 * 
		 * System.out.println("*********");
		 * 
		 * try { f = new File("hino.txt"); FileWriter fr = new FileWriter(f);
		 * PrintWriter out = new PrintWriter(fr); out.println("Até a pé nós iremos...");
		 * out.print("Para o que der e vier...");
		 * out.println("Mas o certo é que nós estaremos...");
		 * out.println("Com o Grêmio onde o Grêmio estiver!"); out.close(); } catch
		 * (IOException e) { System.out.println("Erro ao escrever arquivo."); }
		 * 
		 * System.out.println("*********");
		 * 
		 * filename = "descricao.txt";
		 * 
		 * try { FileReader fr = new FileReader(filename); BufferedReader in = new
		 * BufferedReader(fr); String line = in.readLine(); while (line != null) {
		 * System.out.println(line); line = in.readLine(); } in.close(); } catch
		 * (FileNotFoundException e) { System.out.println("Arquivo \"" + filename +
		 * "\" não existe."); } catch (IOException e) {
		 * System.out.println("Erro na leitura de " + filename + "."); }
		 */
	}

	/*
	 * Criar um método chamado "carregaLabirinto", que recebe por parâmetro uma
	 * String fileName e retorna um array bidimensional de caracteres. Este método
	 * abre o arquivo indicado por fileName e retorna um array de caracteres,
	 * representado no arquivo.
	 * 
	 * A primeira linha do arquivo (vamos chamar de L) indica o número de linhas do
	 * array e a segunda linha (vamos chamar de C) indica o número de colunas. Em
	 * seguida, existem L linhas, cada uma com C colunas, preenchidas de forma a
	 * criar o array do labirinto. O método cria um array bidimensional de
	 * caracteres com as informações do arquivo e retorna este array. Dica: pesquise
	 * e utilize o método charAt da classe String para percorrer todos os caracteres
	 * de uma linha.
	 */
	public static char[][] carregaLabirinto(String fileName) {
		char[][] labirinto = new char[0][0];

		return labirinto;
	}
}