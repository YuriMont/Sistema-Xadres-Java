
package Xadres.Pecas;

import Tabuleiro.Board;
import Xadres.Cor;
import Xadres.PecaXadres;

public class Torre extends PecaXadres {
    
    public Torre(Cor cor, Board board) {
        super(cor, board);
    }

  

    @Override
    public String toString() {
        return "T";
    }
    
    
}
