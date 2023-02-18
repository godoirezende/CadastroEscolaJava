


public class Cadastro {
    private String nome, rg;
    
    Cadastro(String nome, String rg){
        this.nome= nome;
        this.rg= rg;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome= nome;

    }public String getRg(){
        return rg;
    }
    public void setRg(String rg){
        this.rg= rg;
    }

    public void imprimeNome(){
        System.out.println("______________________________");
        System.out.println("Nome: "+this.nome);

    }
     public void imprimeRg(){
        System.out.println("N° do RG: "+this.rg);

    }
}
