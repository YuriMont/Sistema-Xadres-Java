
package sistemaxadres;

import Xadres.PecaXadres;

public class UI {
    public static void mostrarBoard(PecaXadres[][] pecas){
        for (int i =0;i<pecas.length;i++){
            System.out.print((8 - i)+ " ");
            for(int j =0;j<pecas.length;j++){
                mostrarPecas(pecas[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void mostrarPecas(PecaXadres peca){
        if(peca==null){
            System.out.print("-");
        }
        else{
            System.out.println(peca);
        }
        System.out.print(" ");
    }
}
        
