
public class Conta {
	
	
	private int numero;
	private String titular;
	private double saldo;
	static int qtdContas=0;
	double value;
	
	
	
	public Conta(String Titular) {
		this.titular =Titular;
		qtdContas++;
		this.numero=qtdContas;
		this.saldo=0;
			
	}
	
	//
	public void  dadosBancarios() {
	System.out.println("");
	System.out.println("--Bank data--");
	System.out.println("--number-- " + this.numero);
	System.out.println("--holder-- "+ this.titular);
	System.out.println("--balance-- "  +this.saldo);
	
	}
	
	
	//deposit
	public void Depositar (double ValorDeposito) {
		System.out.println("");
		System.out.println("--processing the deposit--");
		System.out.println("--account balance previously-- "+this.saldo);
		this.saldo+=ValorDeposito;     //this.saldo=this.saldo+pValor;
		System.out.println("--balance after deposit-- "+this.saldo);
		
     	}
	
	
	public void Sacar (double saque) {
		System.out.println("");
		System.out.println("--realizando saque--");
		System.out.println("--account balance previously-- "+this.saldo);
		if (value <=this.saldo) {
		this.saldo-=value;
		System.out.println("--account balance after withdrawal-- "+ this.saldo);
        }else{
		System.out.println("insufficient funds");
        }
        
		System.out.println("fim saque");
      
		}
		
     
		
		public void Transfer (Conta dest, double value) {
			System.out.println("");
			System.out.println("--realizando transfer--");
			System.out.println("--account balance origem-- "+this.saldo); 
			System.out.println("--account balance destino-- "+dest.saldo);
			
			if(value <=this.saldo) {
			this.saldo-=value;    //debitacao
			dest.saldo+=value;		//creditacao
			System.out.println("--saldo posteior a origem-- "+ this.saldo);
			System.out.println("--saldo posteior  dest-- "+ dest.saldo);
			
	        }else {
			System.out.println("insufficient funds");
			
	        }
	       
			System.out.println("fim transfer");
			
			
		}
		}
		
			
			
			
			
		
	
