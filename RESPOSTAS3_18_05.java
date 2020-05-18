import java.util.Scanner;

public class RESPOSTAS3_18_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner leitor = new Scanner (System.in);
		
		float salario;
		
			System.out.println("Digite seu antigo salário :");
		salario=leitor.nextFloat();
				
		if (salario>=0 && salario<=1000)
			System.out.println("Seu salário terá 15% de aumento, agora será de "+ (salario+(salario/100*15)));	
		
		if (salario>=1000.01 && salario<=2500)
			
			System.out.println("Seu salário terá 7% de aumento, agora será de "+ (salario+(salario/100*7)));	
			
		if (salario>2500)
				System.out.println("Seu salário continuará o mesmo.");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
