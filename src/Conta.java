

public class Conta {
	
	
	private int numero;
	private String titular;
	private double saldo;
	static int qtdContas=0;
	
	
	
	public Conta(String Titular) {
		this.titular =Titular;
		qtdContas++;
		this.numero=qtdContas;
		this.saldo=0;
			
	}
	
	//
	public void  dadosBancarios() {
	System.out.println("");
	System.out.println("--dados bancarios--");
	System.out.println("--numero-- " + this.numero);
	System.out.println("--titular-- "+ this.titular);
	System.out.println("--saldo-- "  +this.saldo);
	
	}
	
	
	//deposit
	public void Depositar (double ValorDeposito) {
		System.out.println("");
		System.out.println("--processing the deposit--");
		System.out.println("--account balance previously-- "+this.saldo);
		this.saldo+=ValorDeposito;     //this.saldo=this.saldo+pValor;
		System.out.println("--balance after deposit-- "+this.saldo);
		
     	}
	
	//metodo sacar
	public void Sacar (double saque) {
		System.out.println("");
		System.out.println("--realizando saque--");
		System.out.println("--account balance previously-- "+this.saldo);
		if(saque <=this.saldo) {
		this.saldo-=saque;
		System.out.println("--account balance after withdrawal-- "+ this.saldo);
        }else {
		System.out.println("insufficient funds");
		
        }
       }
      }
	


