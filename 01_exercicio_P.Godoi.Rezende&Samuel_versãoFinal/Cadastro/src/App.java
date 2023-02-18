import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Array;

public class App {

	public static void main(String[] args) {
		  Scanner x = new Scanner(System.in);
		  
		    String nome="", rg="";
	        Cadastro cad= new Cadastro(nome, rg);
	       
	        int resposta=0;
	        
			ArrayList<Aluno> alunos = new ArrayList<>();
			ArrayList<Professor> professores = new ArrayList<>();
	     

			
	        
			System.out.println("_______________________");
			System.out.println("|  Entrar em cadastro  |  ");
			System.out.println("|______________________|\n");

			System.out.println("|[1]Entrar|\n|[5]Sair|\n");
	        resposta = x.nextInt();
			
			while (resposta!=5) {
				
			System.out.println("______________");
			System.out.println("|  CADASTRO  |  ");
			System.out.println("|____________|\n");

	        System.out.println("Escolha uma opção: \n[1] Criar um Aluno                |\n[2] Criar um Professor            |\n[3] Imprimir todos os Alunos      |\n[4] Imprimir todos os Professores |\n[5] Sair do programa              |");
	        resposta = x.nextInt();

			
	        if(resposta==1){
	            
				int semestre=0, ano=0;
	        	
				
				cad = new Aluno(nome, rg, ano, semestre);

	            System.out.println("Insira o nome: ");
	            nome = x.next();
				cad.setNome(nome);

	            System.out.println("Insira o RG: ");
				rg = x.next();
	            cad.setRg(rg);

	            System.out.println("Insira o ano: ");
				ano = x.nextInt();
	            ((Aluno)cad).setAno(ano);
	            
	            System.out.println("Insira o semestre: ");
				semestre = x.nextInt();
	            ((Aluno)cad).setSemestre(semestre);
				
				
				Aluno dadoaluno = new Aluno(nome, rg, ano, semestre);
				alunos.add(dadoaluno);

				
				
	           
	            
	            
	           
	    
	        }
	        
			if(resposta==2){
	        	
				String  disciplina[]= new String[4] ;
	        	String  comissao[]= new String[2];

				cad = new Professor(nome, rg, disciplina, comissao);

				

	            System.out.println("Insira o nome: ");
	            nome = x.next();
				cad.setNome(nome);

	            System.out.println("Insira o RG: ");
				rg = x.next();
	            cad.setRg(rg);
	            
	            for(int i=0; i < 4; i++){
	                System.out.println("Insira o Disciplinas: ");
	                disciplina[i]= x.next();
	            }
	            for(int f=0; f < 2; f++){
	            System.out.println("Insira o Comissões: ");
	             comissao[f] = x.next();
	            }

				((Professor)cad).setComissao(comissao);
				((Professor)cad).setDisciplina(disciplina);

				Professor dadoprofessor = new Professor(nome, rg, disciplina, comissao);
				professores.add(dadoprofessor);
	            
	            
	        }
	        
			if (resposta==3) {
				
				System.out.println("Alunos: "+ alunos);
				
			}

			if (resposta==4) {
				
				System.out.println("Professores: "+ professores);
				((Professor)cad).imprimeDisciplinaComissao();
			}


			
	        
			if (resposta==5) {
				System.out.println("Tchau!!!");
			}
			
			
			
			/*Questão 2
	        System.out.println("Seu nomeA: "+aluno.getNomeA());
	        System.out.println("Seu RG: "+aluno.getRgA());
	        System.out.println("Seu ano: "+aluno.getAno());
	        System.out.println("Seu semestre: "+aluno.getSemestre());
	        */
	      
	    }
	}	
}

	