package projetolivro;
    //Inicio da classe
public class Pessoa {

    //Atributos
    private String nome;
    private Integer idade;
    private Boolean genero;
    
    //Métodos Principais
    
        public void fazerAniver() {
            this.setIdade(this.getIdade() +1);
            //Ou this.idade++;
        }
    
    //Métodos Especiais
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setIdade(Integer idade) {
            this.idade = idade;
        }
    
        public Integer getIdade() {
            return idade;
        }
    
        public void setGenero(Boolean genero) {
            this.genero = genero;
        }
    
        public Boolean getGenero() {
            return genero;
        }	
    
    //Fim da classe
}