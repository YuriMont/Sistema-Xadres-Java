
package Tabuleiro;

public class Posicao {
    private int coluna;
    private int fileira;
    
    public Posicao() {
    }

    public Posicao(int fileira, int coluna ) {
        this.fileira = fileira;
        this.coluna = coluna;
        
    }
    public int getFileira() {
        return fileira;
        }

    public void setFileira(int fileira) {
        this.fileira = fileira;
        }
    public int getColuna() {
        return coluna;
    }

    public void setColuna(char coluna) {
        this.coluna = coluna;
    }

    @Override
    public String toString() {
        return fileira+", "+coluna;
    }
    
}
