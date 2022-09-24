package aula13;

import java.util.Scanner;

public class Aula13 {
    public static void main(String[] args) {
        Scanner scint = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        c.setNome("Miles");
        //Lobo é animal selvagem, não recebe nome

        c.emitirSom();
        l.emitirSom();
        c.reagir(false);
        c.reagir(18, 30);
        c.reagir(4, 5f);
        c.reagir(true);

        c.reagir("oi toto");
        c.reagir("Cachorro");
        l.reagir("oi toto");    //Foi apenas uma piadinha :D
        /* TENTATIVA DE IMPLEMENTAÇÃO DE UM LAÇO DO-WHILE
        NÃO FUNCIONOU PORQUE O SWITCH CASE RETORNA UMA STRING
        (MESMO QUE HAJA DUAS VARIÁVEIS SCANNER DE CADA TIPO)
        POIS NA FUNÇÃO REAGIR(); TEMOS TAMBÉM ENTRADAS DO TIPO INT
        --REALIZADO PARA FINS DIDÁTICOS, A FUNÇÃO REAGIR(STRING FRASE);
        ESTÁ FUNCIONANDO PERFEITAMENTE. 
        String input = "";
        int inputTipo = 0;
        do {
            System.out.println("Com quem quer interagir?");
            System.out.println("[1] Cachorro");
            System.out.println("[2] Lobo");
            inputTipo = scint.nextInt();
        switch(inputTipo){
            case 1:
            System.out.println("Dê um comando para o cachorro:");        
            input = sc.nextLine();
            c.reagir(input);
            trace();
            // input = "";
            // inputTipo = 0;
            break;

            case 2:
            System.out.println("Dê um comando para o lobo:");        
            input = sc.nextLine();
            l.reagir(input);
            trace();
            // input = "";
            // inputTipo = 0;
            break;
        }
    } while (!"parar".equals(input));
    
    sc.close();
    System.exit(1);
    */
}
    //Acho muito útil para testes de console
    public static void trace() {
        System.out.println("_____________________________");
    }
}
