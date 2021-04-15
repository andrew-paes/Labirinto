/*
O labirinto será um array bidimensional de caracteres.
No labirinto, posições com 'X' indicam que não é possível passar, enquanto posições com ' ' (espaço) indicam que é possível a passagem. 
O local de destino está marcado no labirinto com a letra 'D'.
O ponto inicial sempre será a posição [0][0] do array.

Criar um método recursivo (com métodos público e privado) chamado labirinto, 
	que recebe um array de caracteres 
	e retorna verdadeiro caso exista pelo menos um caminho para chegar ao destino 
	e falso caso não exista.
	 
No método público, para criar o array, você deve chamar o método carregaLabirinto, criado na parte 1.
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
    	System.out.println("====================");
    	
    	/*for(int i=0; i < _tabuleiro.length; i++) {
    		for(int j=0; j < _tabuleiro[i].length; j++) {
    			String jogadaAnterior = _tabuleiro[i][j];
    			
    			System.out.print(((jogadaAnterior != null && !jogadaAnterior.trim().isEmpty()) ? jogadaAnterior : "-")  + "\t");
    		}
    		
    		System.out.println("");
    	}*/
    	
    	System.out.println("====================");
    }

	public boolean temSaida() {
		return false;
	}
}