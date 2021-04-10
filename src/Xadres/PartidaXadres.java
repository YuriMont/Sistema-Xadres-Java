
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
    private void lugarDaNovaPeca(char coluna, int fileira, PecaXadres peca){
        board.lugarPeca(peca, new PosicaoXadres(coluna, fileira).toPosicao());
    }
    private void configuraçãoInicial(){
        lugarDaNovaPeca('b', 6, new Torre(Cor.BRANCO, board));
        lugarDaNovaPeca('e', 8, new Rei(Cor.PRETO, board));
        lugarDaNovaPeca('e', 1, new Rei(Cor.BRANCO, board));
    }
}
