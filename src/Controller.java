import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String read;
	int option;
	double value;
	int number,number2;
	
	System.out.println("enter with the account holder");
	
	ArrayList<Conta> lc = new ArrayList<>();
	
	read= scan.nextLine();
	
	Conta c1,c2;
	
	do{
		System.out.println("");
		System.out.println("--menu service--");
		System.out.println("1) open account ");
		System.out.println("2) dados bancarios ");
		System.out.println("3) deposito");
		System.out.println("4) saque ");
		System.out.println("5) transfer");
		System.out.println("0) sair");
		
		System.out.println("option");
		option = scan.nextInt();
		scan.nextLine();
		
		switch (option) {

        case 1:
            System.out.println("digite o nome do titular");
            read = scan.nextLine();
            c1 = new Conta(read);
            lc.add(c1);
            break;

        case 2:
            System.out.println("digite o numero da conta");
            number = scan.nextInt();
            c1 = lc.get(number - 1);//ajuste para auto incrementar o vetor devido o mesmo sair do 0
            c1.dadosBancarios();
            break;

        case 3:

            System.out.println("digite o numero da conta");
            number = scan.nextInt();
            c1 = lc.get(number - 1);
            System.out.println("digite o valor do deposito ");
            value = scan.nextDouble();
            c1.Depositar(value);
            break;

        case 4:
            System.out.println("digite o numero da conta");
            number = scan.nextInt();
            c1 = lc.get(number - 1);
            System.out.println("digite o valor de saque");
            value = scan.nextDouble();
            c1.Sacar(value);
            break;
            
        case 5:
            System.out.println("digite a conta de origem");
            number = scan.nextInt();
            c1 = lc.get(number - 1);
            
            System.out.println("digite a conta de destino");
            number2 = scan.nextInt();
            c2 = lc.get(number2 - 1);
        
            System.out.println("digite o valor de transfer");
            value = scan.nextDouble();
            c1.Transfer(c2,value);
            break;

        default:
            if (option != 0)
                System.out.println("Option invalid");
            break;
    }
            System.out.println("");

    } while (option != 0) ;

    scan.close();
}
}