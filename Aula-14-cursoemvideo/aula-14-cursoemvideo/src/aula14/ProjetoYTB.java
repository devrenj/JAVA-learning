package aula14;

public class ProjetoYTB {
    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Aula de JS");
        v[2] = new Video("Aula de MongoDB");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Lomar", 22, "M", "lomarinho");
        g[1] = new Gafanhoto("Alzira", 34, "F", "alzigata");

        print("Listagem de pessoas::::::::::::::");
        print(g[0].toString());
        print(g[1].toString());
        trace();
        print("Listagem de vídeos::::::::::::::");
        print(v[0].toString());
        print(v[1].toString());
        print(v[2].toString());
        trace();

    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void trace() {
        System.out.println("______________________");
    }
}
