package aula12;
public class Cachorro extends Mamifero {

    public Cachorro() {
        this.superCondicaoNome = "correndo";
    }

    @Override
    public void locomover() {
        usarSuperCondicao(this.getSuperCondicaoNome());
    }
    @Override
    public void emitirSom() {
    System.out.println(nome()+" emite: Au au au");
    }
    
}
