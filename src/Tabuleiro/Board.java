
package Tabuleiro;

public class Board {
    private  int fileiras;
    private  int colunas;
    private Peca[][] pecas;

    public Board(int fileira, int coluna) {
        
        this.fileiras = fileira;
        this.colunas = coluna;
        pecas = new Peca[fileira][coluna];
        if (fileiras < 1||colunas <1){
            throw new BoardExcecao("Erro criando o tabuleiro: é necessário que haja 1 fileira e 1 coluna ");
        }
    }

    public int getFileira() {
        return fileiras;
    }


    public int getColuna() {
        return colunas;
    }
    public Peca peca(int fileira, int coluna){
        if(!posicaoExistente(fileira, coluna)){
            throw new BoardExcecao("Posição não encontrada");
        }
        return pecas[fileira][coluna];
    }
    public Peca peca(Posicao posicao){
         if(!posicaoExistente(posicao)){
            throw new BoardExcecao("Posição não encontrada");
        }
        return pecas[posicao.getFileira()][posicao.getColuna()];
        
    }
    public void lugarPeca(Peca peca, Posicao posicao){
        if(ondeEstaPeca(posicao)){
            throw new BoardExcecao("já existe uma peça na posição "+posicao);
        }
        pecas[posicao.getFileira()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }
    public boolean posicaoExistente(int fileira, int coluna){
        return fileira >=0 && fileira < fileiras && coluna >= 0 && coluna < colunas; 
    }
    public boolean posicaoExistente(Posicao posicao){
        return posicaoExistente(posicao.getFileira(), posicao.getColuna());
    }
    public boolean ondeEstaPeca(Posicao posicao){
         if(!posicaoExistente(posicao)){
            throw new BoardExcecao("Posição não encontrada");
        }
        return peca(posicao) != null;
    }
 
}
