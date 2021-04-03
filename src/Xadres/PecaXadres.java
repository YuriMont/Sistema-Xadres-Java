
package Xadres;

import Tabuleiro.Board;
import Tabuleiro.Peca;

public class PecaXadres extends Peca{
    private Cor cor;

    public PecaXadres(Cor cor, Board board) {
        super(board);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

   
    
}
