package aula12;
public class Aula12 {
    public static void main(String[] args) throws Exception {


    // Animal n = new Animal(); //Classe abstrata não pode ser instanciada

    Mamifero m1 = new Mamifero();
    Reptil r1 = new Reptil();
    Ave a1 = new Ave();

    Canguru c = new Canguru();
    Cachorro k = new Cachorro();
    Cobra j = new Cobra();
    Tartaruga t = new Tartaruga();
    Goldfish g = new Goldfish();
    Arara e = new Arara();

    c.locomover();
    c.emitirSom();
    c.locomover();
    c.emitirSom();
    c.ficarAnimado();
    c.locomover();
    c.locomover();
    c.locomover();
    System.out.println("Empolgação: "+k.getSuperCondicao());
    c.locomover();
    
trace();
        k.nome();
        // k.setSuperCondicaoNome("Força do pulo");
    k.locomover();
    k.emitirSom();
    print(k.superCondicaoNome);
    k.ficarAnimado();
    k.locomover();
    k.locomover();
    k.locomover();
    k.locomover();
    k.descansar();
    k.locomover();
    System.out.println("Empolgação: "+k.getSuperCondicao());
    k.locomover();
    k.descansar();
    k.locomover();
    trace();
        t.nome();
        // t.setSuperCondicaoNome("Velocidade");
    t.locomover();
    t.emitirSom();
    t.ficarAnimado();
    t.locomover();
    t.locomover();
    t.locomover();
    t.locomover();
    System.out.println("Empolgação: "+t.getSuperCondicao());
    t.ficarAnimado();
    t.locomover();

    }
    // Métodos complementares do método MAIN
    public static void print(String text) {
        System.out.println(text);
    }
    
    public static void trace() {
        System.out.println("___________________________");
    }    
}

