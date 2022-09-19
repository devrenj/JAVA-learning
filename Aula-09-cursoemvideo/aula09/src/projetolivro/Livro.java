package projetolivro;
    //Início da classe
public class Livro implements Publicacao {

    //Atributos
    private String titulo;
    private String autor;
    private Pessoa leitor;
    private Integer totPaginas;
    private Integer pagAtual;
    private Boolean aberto;
    
    //Métodos Principais

/*          public void detalhes() {
            System.out.println(this.getLeitor+" Está lendo no momento");
            System.out.println(this.getAutor+" é o autor deste livro");
            System.out.println("O total de páginas é de "+this.getTotPaginas());
        }
 */

    //Métodos Especiais
    
    public String detalhes() {
        return "Livro [aberto=" + aberto + ", autor=" + autor + ", leitor=" + leitor + ", pagAtual=" + pagAtual
                + ", titulo=" + titulo + ", totPaginas=" + totPaginas + "]";
    }
    
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
    

        public String getTitulo() {
            return titulo;
        }
    
        public void setAutor(String autor) {
            this.autor = autor;	
        }
    
        public String getAutor() {
            return autor;
        }
    
        public void setLeitor(Pessoa leitor) {
            this.leitor = leitor;
        }
    
        public Pessoa getLeitor() {
            return leitor;
        }
    
        public void setTotPaginas(Integer totPaginas) {
            this.totPaginas = totPaginas;
        }
    
        public Integer getTotPaginas() {
            return totPaginas;
        }

        @Override
        public void abrir() {
            if (!this.aberto || this.aberto == null) {
                this.aberto = true;
            }
        }

        @Override
        public void fechar() {
            if (this.aberto) {
                this.aberto = false;
            }
        }

        @Override
        public void folhear() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void avancarPag() {
            this.pagAtual++;
        }

        @Override
        public void voltarPag() {
            this.pagAtual--;    
        }

    //Aberto não será constrúido pois quando instânciado estará fechado
    //PagAtual também não será construído pois estará com 0

    //Fim da classe
}
