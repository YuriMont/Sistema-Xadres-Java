
package Xadres;

import Tabuleiro.Board;

public class PartidaXadres {
     private Board board;   

    public PartidaXadres() {
        board = new Board(8, 8);
    }
    public PecaXadres[][]getPecas(){
        PecaXadres[][] mat = new PecaXadres[board.getFileira()][board.getColuna()];
        for (int i =0;i<board.getFileira();i++){
            for(int j=0;j<board.getColuna();j++){
                mat[i][j] = (PecaXadres) board.peca(i, j);
            }
        }
        return mat;
    } 
}
