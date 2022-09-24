package aula14;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    protected void ganharExp(){ 
        this.experiencia =+ 10;
    }
}
