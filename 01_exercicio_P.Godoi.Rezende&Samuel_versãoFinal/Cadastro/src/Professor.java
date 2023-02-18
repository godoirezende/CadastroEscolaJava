


    public class Professor extends Cadastro{
        
        private String disciplina[] = new String[4];
        private String comissao[] = new String[2];
        
        
    Professor(String nome, String rg, String[]disciplina, String[]comissao ){
        super(nome, rg);
        this.disciplina= disciplina;
        this.comissao= comissao;
    }
    
        
 
       
		public String[] getDisciplina(){
            return disciplina;
        }
        public void setDisciplina(String[] disciplina){
            this.disciplina= disciplina;
    
        }public String [] getComissao(){
            return comissao;
        }
        public void setComissao(String[] comissao){
            this.comissao= comissao;
        }

        public String toString(){

            return "Nome:"+super.getNome() +"RG:"+ super.getRg();
            
            
            
            
        }
    
         public void imprimeDisciplinaComissao(){
           
            
             for(int i=0;i<4;i++)
             {
                 System.out.println("Disciplinas: "+this.disciplina[i]);

             }

             for(int f=0;f<2;f++)
             {
                 System.out.println("Comissôes: "+this.comissao[f]);

             }
                 System.out.println("______________________________");




            }
        
    }
     

