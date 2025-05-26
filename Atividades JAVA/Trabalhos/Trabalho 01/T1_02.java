public class T1_02 {
	public static void main(String[] args) {
		String cliente;
		String produto1;
		String produto2;
		String produto3;

        // Arte ASCII com o nome da lanchonete

        System.out.println("    __  __                __\r\n" + //
                        "   / / / /_  ______ ___  / /\r\n" + //
                        "  / /_/ / / / / __ `__ \\/ / \r\n" + //
                        " / __  / /_/ / / / / / /_/  \r\n" + //
                        "/_/ /_/\\__,_/_/ /_/ /_(_)   \r\n" + //
                        "                            \r\n" + //
                        "\r\n" + //
                        "");
		
		// Produto 1

		System.out.println("Insira seu nome: ");
		cliente = System.console().readLine();
		
		System.out.println("Insira o nome do primeiro produto: ");
		produto1 = System.console().readLine();
		
		System.out.println("Insira o valor do primeiro produto: ");
		double valproduto1 = Double.parseDouble(System.console().readLine());
		
		System.out.println("Insira a quantidade do primeiro produto: ");
		int quantproduto1 = Integer.parseInt(System.console().readLine());
		
		// Produto 2
		
		System.out.println("Insira o nome do segundo produto: ");
		produto2 = System.console().readLine();
		
		System.out.println("Insira o valor do segundo produto: ");
		double valproduto2 = Double.parseDouble(System.console().readLine());
		
		System.out.println("Insira a quantidade do segundo produto: ");
		int quantproduto2 = Integer.parseInt(System.console().readLine());
		
		// Produto 3
		
		System.out.println("Insira o nome do terceiro produto: ");
		produto3 = System.console().readLine();
		
		System.out.println("Insira o valor do terceiro produto: ");
		double valproduto3 = Double.parseDouble(System.console().readLine());
		
		System.out.println("Insira a quantidade do terceiro produto: ");
		int quantproduto3 = Integer.parseInt(System.console().readLine());
		
		// Total dos produtos
		
		double totproduto1 = valproduto1 * quantproduto1;
		double totproduto2 = valproduto2 * quantproduto2;
		double totproduto3 = valproduto3 * quantproduto3;
		
		// Calculos finais
		
		double subtotal = totproduto1+totproduto2+totproduto3;
		double tax = subtotal/10;
		double total = tax+subtotal;
		
        // Recibo
        
        System.out.println("-----------------RECIBO-----------------");
		System.out.printf("Cliente: %s%n", cliente);
        System.out.println("-----------------------------------------");
		System.out.printf("%s - %d x R$%.1f = R$%.1f%n", produto1 , quantproduto1, valproduto1, totproduto1);
		System.out.printf("%s - %d x R$%.1f = R$%.1f%n", produto2, quantproduto2, valproduto2, totproduto2);
		System.out.printf("%s - %d x R$%.1f = R$%.1f%n", produto3, quantproduto3, valproduto3, totproduto3);
		System.out.println("-----------------------------------------");
        System.out.printf("Valor do Serviço: R$%.2f%n", tax);
		System.out.printf("TOTAL: R$%.2f%n", total);
        System.out.println("-----------------------------------------");
        System.out.println("              Volte Sempre!              ");
        System.out.println("-----------------------------------------");
	}
}