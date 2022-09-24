package aula14;
public class Gafanhoto extends Pessoa {
    
    private boolean login;
    private int totAssistido;

public void viuMaisUm() {
    this.setTotAssistido(this.getTotAssistido() +1);
}

public boolean getLogin() {
    return login;
}

public void setLogin(boolean login) {
    this.login = login;
}

public int getTotAssistido() {
    return totAssistido;
}

public void setTotAssistido(int totAssistido) {
    this.totAssistido = totAssistido;
}


}
