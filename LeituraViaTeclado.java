
import java.util.Scanner;

class LeituraViaTeclado{
    public static void main(String args[]){
        // Lendo um inteiro:
        Scanner ler = new Scanner(System.in);
        int umInteiro;
        
        System.out.print("Entre com um valor inteiro qualquer: ");
        umInteiro = ler.nextInt();
        
        System.out.println("O valor inteiro entrado foi: " + umInteiro);
        /*---------------------------------------------------------*/
        
        // Lendo um float:
        float umFloat;
		
		System.out.println("\n");
        System.out.print("Entre com um valor real de precisão simples (virgula decimal): ");
        umFloat = ler.nextFloat();
        
        System.out.println("O valor real entrado foi: " + umFloat);
        /*---------------------------------------------------------*/
		System.out.println("\n");

        
        System.out.println("\n");
		// Lendo um double:
        double umDouble;
        
        System.out.print("Entre com um valor real de precisão dupla (virgula decimal): ");
        umDouble = ler.nextDouble();
        
        System.out.println("O valor real entrado foi: " + umDouble);
        /*---------------------------------------------------------*/
    	System.out.println("\n");

		// Precisamos esvaziar o buffer de leitura antes de ler o próximo String.
		// Isso tem de ser feito quando se lê string depois de número. Usar o nextLine():
        ler.nextLine();
        
        // Lendo uma palavra isolada:
		System.out.println("\n");

		String umaPalavra;
        
        System.out.print("Entre com uma palavra: ");
        umaPalavra = ler.next();
        
        System.out.println("O valor da palavra entrada foi: " + umaPalavra);
        /*---------------------------------------------------------*/
		System.out.println("\n");

        // Lendo uma frase:
		System.out.println("\n");
        String umaFrase;
        ler.nextLine();
        
        System.out.print("Entre com uma frase: ");
        umaFrase = ler.nextLine();
        
        System.out.println("O valor da frase entrada foi: \"" + umaFrase + "\""); // observe como se digita ums aspas dentro de uma frase
        /*---------------------------------------------------------*/
        
		// Mais simples
		System.out.println("\nAgora do jeito mais simples\n===========================");
		int x = 0;
		String buffer;
		
		System.out.print("\n\nint x = ");
		x = Integer.parseInt(ler.nextLine());
		System.out.println("x = " + x);
		System.out.print("\nAgora uma cadeia de caracteres. Entre com o seu nome: ");
		buffer = ler.nextLine();
		System.out.println("Seu nome é: " + buffer + "\n");
		
		float y = (float)0.0;
		System.out.print("Entre com um float y (agora deve usar ponto decimal e nao virgula)= ");
		y = Float.parseFloat(ler.nextLine());
		System.out.println("y = " + y);
	        
		System.out.print("\nQual a cor do ceu: ");
		buffer = ler.next();
		System.out.println("O ceu tem cor " + buffer);
		
		System.out.println("\nAcabamos de aprender a ler e escrever dados do programa na tela\n" + 
		"de duas maneiras!\n");
    }
}        