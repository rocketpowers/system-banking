import java.util.Scanner;

public class Controller {

public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String read;
	int option;
	double value;
	
	System.out.println("enter with the account holder");
	
	read= scan.nextLine();
	
	Conta c1 = new Conta(read);
	
	do{
		System.out.println("");
		System.out.println("--menu service--");
		System.out.println("1) dados bancarios ");
		System.out.println("2) deposit ");
		System.out.println("3) withdraw ");
		System.out.println("0) sair");
		
		System.out.println("option");
		option = scan.nextInt();
		
		if(option ==1) {
			c1.dadosBancarios();
		}
		
		else if(option==2) {
			System.out.println("digite o valor do deposito ");
			value = scan.nextDouble();
					c1.Depositar(value);
		}
		
		else if(option==3) {
			System.out.println("digite o valor de saque");
			value=scan.nextDouble();
			c1.Sacar(value);
		}
		
		else if (option !=0 ) {
			System.out.println("option invalid");
		}
		
		
		System.out.println("");
		} while(option !=0);
	
	
	
		
	
	scan.close();
	}
}