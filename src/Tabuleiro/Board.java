
package Tabuleiro;

public class Board {
    private int fileira;
    private int coluna;
    private Peca[][] peca;

    public Board(int fileira, int coluna) {
        this.fileira = fileira;
        this.coluna = coluna;
        peca = new Peca[fileira][coluna];
    }

    public int getFileira() {
        return fileira;
    }


    public int getColuna() {
        return coluna;
    }

    
    
}
