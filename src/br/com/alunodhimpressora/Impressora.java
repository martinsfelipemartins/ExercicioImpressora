package br.com.alunodhimpressora;

import java.util.ArrayList;
import java.util.List;

public class Impressora {

    private List<Imprimivel> imprimiveis = new ArrayList<>();


    public void imprimirTudo(){
        for (Imprimivel imprimivei : imprimiveis) {
            imprimivei.imprimir();

        }

    }

    public void adicionarImprimivel(Imprimivel umImprimivel){
        imprimiveis.add(umImprimivel);

    }

}
