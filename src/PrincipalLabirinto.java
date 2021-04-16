
/*
 Crie uma classe chamada PrincipalLabirinto. 
 Nela, crie o m�todo main. 
 	No main, fa�a o trecho de c�digo necess�rio para executar os m�todos criados, 
 	percorrendo um determinado labirinto 
 		(o nome do arquivo do labirinto deve ser indicado pelo usu�rio via teclado). 
 Ao final do main, deve ser criado um arquivo chamado "saidaLabirinto.txt" 
 	com a frase: 
 		"Existe um caminho para o labirinto" 
 		ou "N�o existe um caminho para o labirinto", 
	de acordo com o resultado do m�todo recursivo criado. 
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
				resultado = "N�o existe um caminho para o labirinto";
			}
			
			System.out.println(resultado);
		}

		/*
		 * String nomeDir = "../"; File f1 = new File(nomeDir); if (f1.isDirectory()) {
		 * System.out.println("Diret�rio " + nomeDir); String s[] = f1.list(); for (int
		 * i = 0; i < s.length; i++) { f = new File(s[i]); System.out.print(s[i]); if
		 * (f.isDirectory()) System.out.println(" <dir> "); else
		 * System.out.println(" <file>"); } } else System.out.println(nomeDir +
		 * " n�o � um diret�rio.");
		 * 
		 * System.out.println("*********"); System.out.println("*********");
		 * 
		 * String texto = "Gr�mio--�--o--melhor--time--!!"; String separada[] =
		 * texto.split("--"); for (int i = 0; i < separada.length; i++) {
		 * System.out.println("Palavra " + (i + 1) + ": " + separada[i]); }
		 * 
		 * System.out.println("*********");
		 * 
		 * try { f = new File("hino.txt"); FileWriter fr = new FileWriter(f);
		 * PrintWriter out = new PrintWriter(fr); out.println("At� a p� n�s iremos...");
		 * out.print("Para o que der e vier...");
		 * out.println("Mas o certo � que n�s estaremos...");
		 * out.println("Com o Gr�mio onde o Gr�mio estiver!"); out.close(); } catch
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
		 * "\" n�o existe."); } catch (IOException e) {
		 * System.out.println("Erro na leitura de " + filename + "."); }
		 */
	}

	/*
	 * Criar um m�todo chamado "carregaLabirinto", que recebe por par�metro uma
	 * String fileName e retorna um array bidimensional de caracteres. Este m�todo
	 * abre o arquivo indicado por fileName e retorna um array de caracteres,
	 * representado no arquivo.
	 * 
	 * A primeira linha do arquivo (vamos chamar de L) indica o n�mero de linhas do
	 * array e a segunda linha (vamos chamar de C) indica o n�mero de colunas. Em
	 * seguida, existem L linhas, cada uma com C colunas, preenchidas de forma a
	 * criar o array do labirinto. O m�todo cria um array bidimensional de
	 * caracteres com as informa��es do arquivo e retorna este array. Dica: pesquise
	 * e utilize o m�todo charAt da classe String para percorrer todos os caracteres
	 * de uma linha.
	 */
	public static char[][] carregaLabirinto(String fileName) {
		char[][] labirinto = new char[0][0];

		return labirinto;
	}
}