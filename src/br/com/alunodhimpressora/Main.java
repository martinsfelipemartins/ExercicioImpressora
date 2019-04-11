package br.com.alunodhimpressora;

public class Main {

    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        Contrato contrato = new Contrato();
        Foto foto = new Foto();
        Documento documento = new Documento();


        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(documento);
        impressora.adicionarImprimivel(foto);

        impressora.imprimirTudo();
    }
}
