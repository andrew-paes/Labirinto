/*
OK - O labirinto será um array bidimensional de caracteres.
OK - No labirinto, posições com 'X' indicam que não é possível passar, enquanto posições com ' ' (espaço) indicam que é possível a passagem. 
OK - O local de destino está marcado no labirinto com a letra 'D'.
OK - O ponto inicial sempre será a posição [0][0] do array.

OK - Criar um método recursivo 
	NO (com métodos público e privado) chamado labirinto, 
	NO - que recebe um array de caracteres 
	OK - e retorna verdadeiro caso exista pelo menos um caminho para chegar ao destino 
	OK - e falso caso não exista.
	 
NO - No método público, para criar o array, você deve chamar o método carregaLabirinto, criado na parte 1.
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
				if (_labirinto[linha][coluna] == 'D') // verifica se é saída
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