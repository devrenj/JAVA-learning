package aula12;

public class Ave extends Animal {
    private String corPena;
    
    public void fazerNinho() {
        System.out.println(nome()+" está fazendo ninho");
    }

    @Override
    public void alimentar() {
        System.out.println(nome()+" está comendo frutas");    
    }

    @Override
    public void emitirSom() {
        System.out.println(nome()+" emite: Som de ave");    
    }

    @Override
    public void locomover() {
        System.out.println(nome()+" está voando");    
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    
}
