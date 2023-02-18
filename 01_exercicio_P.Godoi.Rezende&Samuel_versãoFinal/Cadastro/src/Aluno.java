

public class Aluno extends Cadastro {
    private int ano, semestre;
    

    Aluno( String nome, String rg,int ano, int semestre){
        super(nome, rg);
        this.ano= ano;
        this.semestre= semestre;
    }
    


    
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano= ano;

    }public int getSemestre(){
        return semestre;
    }
    public void setSemestre(int semestre){
        this.semestre= semestre;
    }

    public String toString(){
        return "Nome:"+super.getNome() +"RG:"+ super.getRg() +"Ano:"+ano  +"Semestre:"+ semestre;
        
        
    }
    

    




    

}
