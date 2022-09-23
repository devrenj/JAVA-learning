public class Tartaruga extends Reptil {

    
    public Tartaruga() {
        this.superCondicaoNome = "movimentando-se";
    }

    @Override
    public void locomover() {
       this.usarSuperCondicao(this.getSuperCondicaoNome());
    }
    
}
