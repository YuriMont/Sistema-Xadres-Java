
package Xadres.Pecas;

import Tabuleiro.Board;
import Xadres.Cor;
import Xadres.PecaXadres;

public class Rei extends PecaXadres{
    
    public Rei(Cor cor, Board board) {
        super(cor, board);
    }

    @Override
    public String toString() {
        return "R";
    }
    
}
