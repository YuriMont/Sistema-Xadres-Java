
package Xadres;

import Tabuleiro.Board;
import Tabuleiro.Posicao;
import Xadres.Pecas.Rei;
import Xadres.Pecas.Torre;

public class PartidaXadres {
     private Board board;   

    public PartidaXadres() {
        board = new Board(8, 8);
        configuraçãoInicial();
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
    private void configuraçãoInicial(){
        board.lugarPeca(new Torre(Cor.BRANCO, board), new Posicao(2, 1));
        board.lugarPeca(new Rei(Cor.PRETO, board), new Posicao(0, 4));
        board.lugarPeca(new Rei(Cor.BRANCO, board), new Posicao(7, 4));
    }
}
