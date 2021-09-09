package tp1;

import java.util.Scanner;

public class Trabalho1 {

	public static void main(String[] args) {
		String s1, s2, s3, s4, s5;
    	int i1, i2, i3, i4, i5, i6;
    	int menuEs, i, numCliente=0, numFum=0, numSap=0, numMeia=0;
    	Cliente []cliente= new Cliente[100];
    	Funcionario []funcionario= new Funcionario[100];
    	Sapato []sapato = new Sapato[100];
    	Meia []meia= new Meia[100];
    	Loja loja;
    	String procura;
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o caracter a ser verificado::\n");    
       do {
        System.out.print("-----------------------------------------------------\n");
        System.out.print("Digite o número do menu da opção que você quer:\n");
        System.out.print("1. Cadastro de novo cliente\n");
        System.out.print("2. Cadastro de novo funcionario\n");
        System.out.print("3. Cadastro de novo sapato\n");
        System.out.print("4. Cadastro de novo meia\n");
        System.out.print("5. Cadastro de venda\n");
        System.out.print("6. Cadastro da loja\n");
        System.out.print("7. Modifica cliente\n");
        System.out.print("8. Modifica funcionario\n");
        System.out.print("9. Modifica sapato\n");
        System.out.print("10. Modifica meia\n");
        System.out.print("11. Modifica venda\n");
        System.out.print("12. Modifica loja\n");
        System.out.print("13. Deleta cliente\n");
        System.out.print("14. Deleta funcionario\n");
        System.out.print("15. Deleta sapato\n");
        System.out.print("16. Deleta meia\n");
        System.out.print("17. Deleta venda\n");
        System.out.print("18. Deleta loja\n");
        System.out.print("19. Sair\n");
        System.out.print("-----------------------------------------------------\n");
        System.out.print("Número:");
    	menuEs = ler.nextInt();
    	
    	switch (menuEs) {
    		
    	case 1:
    		numCliente=numCliente+1;
    		System.out.println("Nome:");
    		s1 = ler.next();
    		System.out.println("Endereço:");
    		s2 = ler.next();
    		System.out.println("Telefone:");
    		i1 = ler.nextInt();
    		System.out.println("CPF:");
    		i2 = ler.nextInt();
    		System.out.println("RG:");
    		i3 = ler.nextInt();
    		System.out.println("ID do Cliente:");
    		i4 = ler.nextInt();
    		cliente[numCliente] = new Cliente (s1, s2, i1,i2,i3,i4);
    		

        
    		break;
    		
    	case 2:
    		numFum=numFum+1;
    		System.out.println("Nome:");
    		s1 = ler.next();
    		System.out.println("endereço:");
    		s2 = ler.next();
    		System.out.println("telefone:");
    		i1 = ler.nextInt();
    		System.out.println("CPF:");
    		i2 = ler.nextInt();
    		System.out.println("RG:");
    		i3 = ler.nextInt();
    		System.out.println("funçao:");
    		s3 = ler.next();
    		System.out.println("CNPJ:");
    		s4 = ler.next();
    		System.out.println("Salario:");
    		i4 = ler.nextInt();
    		System.out.println("Horario de trabalho(Horario entrada,Horario saida):");
    		i5 = ler.nextInt();
    		System.out.println("ID do funcionario:");
    		i6 = ler.nextInt();
    		funcionario[numFum] = new Funcionario (s1, s2, i1,i2,i3,s3, s4,i4,i5,i6);
    		
    		break;
    		
    	case 3:
    		numSap=numSap+1;
    		System.out.println("Marca:");
    		s1 = ler.next();
    		System.out.println("Tipo:");
    		s2 = ler.next();    		
    		System.out.println("Cor:");
    		s3 = ler.next();  
    		System.out.println("ID do sapato:");
    		i1 = ler.nextInt();
    		System.out.println("Tamanho:");
    		i2 = ler.nextInt();
    		System.out.println("Preço:");
    		i3 = ler.nextInt();


    		sapato[numSap] = new Sapato (s1, s2, s3,i1,i2,i3);
    		
    		break;
    		
    	case 4:
    		
    		numMeia=numMeia+1;
    		System.out.println("Marca:");
    		s1 = ler.next();
    		System.out.println("Tipo:");
    		s2 = ler.next();
    		System.out.println("Preço:");
    		i1 = ler.nextInt();    		
    		System.out.println("Cor:");
    		s3 = ler.next();  
    		System.out.println("ID do sapato:");
    		i2 = ler.nextInt();



    		meia[numMeia] = new Meia (s1, s2, i1,s3,i2);
    		
    		break;
    		
    	case 5:
    		
    		break;
    		
    	case 6:
    		
    		System.out.println("Nome");
    		s1 = ler.next();
    		System.out.println("endereco:");
    		s2 = ler.next();
    		System.out.println("cnpj:");
    		s3 = ler.next();    		
    		System.out.println("Quantidade de funcionarios:");
    		i1 = ler.nextInt();  
    		System.out.println("Horario de funcionamento:");
    		i2 = ler.nextInt();
    		
    		loja = new Loja (s1, s2, s3,i1,i2);
    		break;
    		
    	case 8:
    		
    		break;
    		
    	case 9:
    		
    		break;
    		
    	case 10:
    		
    		break;
    		
    	case 11:
    		
    		break;
    		
    	case 12:
    		
    		break;
    	case 13:
    		
    		break;
    	case 14:
    		
    		break;
    	case 15:
    		
    		break;
    	case 16:
    		
    		break;
    	case 17:
    		
    		break;
    	case 18:
    		
    		break;
    		
    		
    	default:
    		System.out.println("Número invalido");
    		
    		break;
    	
    	}
       }while (menuEs !=19);
    }
}
