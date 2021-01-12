package banco_superior_modelo;

public class Programa {
	public static void main(String[] args) {
		
		IConta conta1 = new ContaCorrente("111", "222", "12/01/2021");
		
		IConta conta2 = new ContaPoupanca("222", "333", "10/01/2021");
		
		IConta conta3 = new ContaPoupanca("333", "010", "10/01/2020");
		
		Cliente cliente1 = new Cliente("Gabriel", "083", "10/01/2021", "Gabrielvasco3431@gmail.com");
		
		Cliente cliente2 = new Cliente("Everton", "044", "12/02/2020", "Ellg1@gmail.com");
		
		cliente1.adicionarContas(conta1);
		cliente2.adicionarContas(conta2);
		
		cliente1.adicionarTelefone("83206942");
		cliente2.adicionarTelefone("06542563");
		
		System.out.println("Contas criadas sem saldo");
		System.out.println(cliente1);
		System.out.println(cliente2);
		
		System.out.println("Mostrando conta");
		System.out.println(conta1);
		
		conta1.depositar(1000f);
		conta2.depositar(100f);
		
		conta1.transferencia(conta2, 100f);
		
		System.out.println("Contas após transferência");
		System.out.println(cliente1);
		System.out.println(cliente2);
		
		IConta conta4 = new ContaSalario("111", "000", "12/01/2020");
		
		conta4.transferencia(conta2, 200);
		
		
	}
		

}
