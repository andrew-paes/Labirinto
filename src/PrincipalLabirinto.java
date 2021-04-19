
/*
 OK - Crie uma classe chamada PrincipalLabirinto. 
 Nela, crie o método main. 
 	OK No main, faça o trecho de código necessário para executar os métodos criados, 
 	percorrendo um determinado labirinto 
 		OK - (o nome do arquivo do labirinto deve ser indicado pelo usuário via teclado). 
 OK - Ao final do main, deve ser criado um arquivo chamado "saidaLabirinto.txt" 
 	OK - com a frase: 
 		OK - "Existe um caminho para o labirinto" 
 		OK - ou "Não existe um caminho para o labirinto", 
	OK - de acordo com o resultado do método recursivo criado. 
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
	private static int _linhaMax = 0;
	private static int _colunaMax = 0;
	private static String _resultado;
	public static Scanner _scanner;

	public static void main(String[] args) {
		_scanner = new Scanner(System.in);
		String filename = null;
		File f;

		boolean fimDeJogo = false;

		do {
			System.out.println("Digite SAIR, para finalizar o programa. Se quiser continuar  o nome do arquivo:");
			String comando = _scanner.nextLine();

			if (comando != null) {
				if (comando.trim().equalsIgnoreCase("SAIR")) {

					fimDeJogo = true;
				} else {
					f = new File(comando);

					if (f.exists()) {
						filename = f.getName();

						System.out.println("++++++++++++++++++++");
						System.out.println("+ ARQUIVO");
						System.out.println("++++++++++++++++++++");
						System.out.println("Nome: " + f.getName());
						System.out.println("Caminho: " + f.getAbsolutePath());
					}
				}
			}
		} while (!fimDeJogo && (filename == null));

		if (filename != null) {
			Labirinto labirinto = new Labirinto(carregaLabirinto(filename));
			labirinto.imprime();

			if (labirinto.temSaida(0, 0)) {
				_resultado = "Existe um caminho para o labirinto";
			} else {
				_resultado = "Não existe um caminho para o labirinto";
			}

			System.out.println("++++++++++++++++++++");
			System.out.println("+ RESULTADO");
			System.out.println("++++++++++++++++++++");
			System.out.println(_resultado);

			try {
				f = new File("saidaLabirinto.txt");
				FileWriter fr = new FileWriter(f);
				PrintWriter out = new PrintWriter(fr);
				out.print(_resultado);
				out.close();
			} catch (IOException e) {
				System.out.println("Erro: " + e.getMessage());
			}
		}
	}

	/*
	 OK - Criar um método chamado "carregaLabirinto", que recebe por parâmetro uma
	 OK - String fileName e retorna um array bidimensional de caracteres. 
	 Este método 
	 	OK - abre o arquivo indicado por fileName e retorna um array de caracteres, 
	 	OK - representado no arquivo. 
	 	OK - A primeira linha do arquivo (vamos chamar de L) indica o número de linhas do array e 
	 	OK - a segunda linha(vamos chamar de C) indica o número de colunas. 
	 	OK - Em seguida, existem L linhas, cada uma com C colunas, preenchidas de forma a criar o array do labirinto. 
	 	OK - O método cria um array bidimensional de caracteres com as informações do arquivo 
	 	OK - e retorna este array. 
	 	OK - Dica: pesquise e utilize o método charAt da classe String para percorrer todos os caracteres de uma linha.
	 */
	public static char[][] carregaLabirinto(String fileName) {
		char[][] labirinto = null;

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			int l = 1;

			System.out.println("++++++++++++++++++++");
			System.out.println("+ CONTEÚDO");
			System.out.println("++++++++++++++++++++");
			while (line != null) {
				System.out.println(line);

				if (!line.trim().isEmpty()) {
					try {
						_linhaMax = (_linhaMax == 0 && l == 1) ? Integer.parseInt(line.trim()) : _linhaMax;
						_colunaMax = (_colunaMax == 0 && l == 2) ? Integer.parseInt(line.trim()) : _colunaMax;
					} catch (Exception e) {

					}
				}

				if (_linhaMax > 0 && _colunaMax > 0 && labirinto == null) {
					labirinto = new char[_linhaMax][_colunaMax];
				}

				if (l > 2 && l <= (_linhaMax + 2)) {
					for (int i = 0; i <= _colunaMax - 1; i++) {
						labirinto[l - 3][i] = line.charAt(i);
					}
				}

				l++;

				line = in.readLine(); // Próxima linha
			}

			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("Erro: Arquivo não encontrado. Msg:" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Erro: Arquivo trancado." + e.getMessage());
		}

		return labirinto;
	}
}