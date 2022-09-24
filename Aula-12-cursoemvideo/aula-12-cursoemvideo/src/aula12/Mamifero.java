package aula12;

public class Mamifero extends Animal {

    private String corDoPelo;

    @Override
    public void alimentar() {
        System.out.println(nome()+" está mamando");        
    }

    @Override
    public void emitirSom() {
        System.out.println(nome()+" emite: Som de mamífero");    
    }

    @Override
    public void locomover() {
        System.out.println(nome()+" andando");    
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
    
}
