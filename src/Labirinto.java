/*
OK - O labirinto ser� um array bidimensional de caracteres.
OK - No labirinto, posi��es com 'X' indicam que n�o � poss�vel passar, enquanto posi��es com ' ' (espa�o) indicam que � poss�vel a passagem. 
OK - O local de destino est� marcado no labirinto com a letra 'D'.
OK - O ponto inicial sempre ser� a posi��o [0][0] do array.

OK - Criar um m�todo recursivo 
	NO (com m�todos p�blico e privado) chamado labirinto, 
	NO - que recebe um array de caracteres 
	OK - e retorna verdadeiro caso exista pelo menos um caminho para chegar ao destino 
	OK - e falso caso n�o exista.
	 
NO - No m�todo p�blico, para criar o array, voc� deve chamar o m�todo carregaLabirinto, criado na parte 1.
*/
public class Labirinto {
	private char[][] _labirinto;

	public Labirinto(char[][] labirinto) {
		set_labirinto(labirinto);
	}

	public char[][] get_labirinto() {
		return _labirinto;
	}

	public void set_labirinto(char[][] _labirinto) {
		this._labirinto = _labirinto;
	}

	public void imprime() {
		System.out.println("++++++++++++++++++++");
		System.out.println("+ LABIRINTO");
		System.out.println("++++++++++++++++++++");

		for (int i = 0; i < _labirinto.length; i++) {
			for (int j = 0; j < _labirinto[i].length; j++) {
				System.out.print(_labirinto[i][j]);
			}

			System.out.println("");
		}
	}

	public boolean temSaida(int linha, int coluna) {
		boolean saida = false;

		if (linha >= 0 && linha < _labirinto.length && coluna >= 0 && coluna < _labirinto[0].length) {
			if (_labirinto[linha][coluna] != 'X' && _labirinto[linha][coluna] != '.') {
				if (_labirinto[linha][coluna] == 'D') // verifica se � sa�da
					saida = true;
				else {
					_labirinto[linha][coluna] = '.';
					this.imprime();

					if (!saida) {
						saida = temSaida(linha + 1, coluna); // baixo
					}

					if (!saida) {
						saida = temSaida(linha, coluna + 1); // direita
					}

					if (!saida) {
						saida = temSaida(linha, coluna - 1); // esquerda
					}

					if (!saida) {
						saida = temSaida(linha - 1, coluna); // cima
					}
				}
			}
		}

		return saida;
	}
}