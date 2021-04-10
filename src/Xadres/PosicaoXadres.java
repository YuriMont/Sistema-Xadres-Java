
package Xadres;

import Tabuleiro.Posicao;

public class PosicaoXadres {
    private char coluna;
    private int fileira;

    public PosicaoXadres(char coluna, int fileira) {
        if(coluna < 'a'||coluna > 'h'|| fileira<1||fileira > 8){
            throw new ExcecoesXadres("Erro instanciando a posição");
        }
        this.coluna = coluna;
        this.fileira = fileira;
    }

    public char getColuna() {
        return coluna;
    }

    public int getFileira() {
        return fileira;
    }
    protected Posicao toPosicao(){
        return new Posicao(8-fileira, coluna - 'a');
    }
    protected static PosicaoXadres fromPosicao(Posicao posicao){
        return new PosicaoXadres((char)('a' - posicao.getColuna()), 8 - posicao.getFileira());
    }

    @Override
    public String toString() {
        return "" + coluna + fileira;
    }
    
    
    
}
