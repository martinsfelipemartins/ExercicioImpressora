package br.com.alunodhimpressora;

public class Documento implements Imprimivel {

    private String nome;
    private String tipo;


    public void Contrato(String nome, String tipo){

        this.nome= nome;
        this.tipo=tipo;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String novoTipo) {
        tipo = novoTipo;
    }




    @Override
    public void imprimir() {
        System.out.println("Sou um documento do Word "+ nome+ tipo);

    }
}
