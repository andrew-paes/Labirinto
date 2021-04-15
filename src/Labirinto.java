/*
O labirinto ser� um array bidimensional de caracteres.
No labirinto, posi��es com 'X' indicam que n�o � poss�vel passar, enquanto posi��es com ' ' (espa�o) indicam que � poss�vel a passagem. 
O local de destino est� marcado no labirinto com a letra 'D'.
O ponto inicial sempre ser� a posi��o [0][0] do array.

Criar um m�todo recursivo (com m�todos p�blico e privado) chamado labirinto, 
	que recebe um array de caracteres 
	e retorna verdadeiro caso exista pelo menos um caminho para chegar ao destino 
	e falso caso n�o exista.
	 
No m�todo p�blico, para criar o array, voc� deve chamar o m�todo carregaLabirinto, criado na parte 1.
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