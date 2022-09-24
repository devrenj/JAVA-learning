package aula12;
public class Canguru extends Mamifero {
    
    public Canguru() {
        this.superCondicaoNome = "pulando forte";
    }
    
    @Override
    public void locomover() {
        this.usarSuperCondicao(this.getSuperCondicaoNome());
    }
    
    public void usarBolsa() {
        System.out.println(nome()+" está usando bolsa");
    }
}
