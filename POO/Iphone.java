 package POO;

import java.util.Scanner;

public class Iphone implements Ipod, Telefone, Navegador {


      private Scanner scanner;
      public Iphone() {
         this.scanner = new Scanner(System.in);      
      }


    @Override
	public void tocar() {
	
	System.out.println("Digite o nome da música: ");	
	String musica = scanner.nextLine();
	System.out.println("Tocando " + musica);
	}
	
	
	@Override
	public void pausar() {
	System.out.println("\nPausando Música");	
	}
	
	
	@Override
	public void selecionarMusica() {
	System.out.println("Selecionando Música ");	
	}
	
	
	@Override
	public void selecionarBanda() {
	System.out.println("Selecionando Banda ");	
	}
	
	
	@Override
	public void selecionarAlbum() {
	System.out.println("Selecionando Album");
	}

	
	
	
	@Override
	public void ligar() {
	System.out.println("Ligando para o contato");
	}
	@Override
	public void atender() {
	System.out.println("Atendendo Telefone");
	}
	
	@Override
	public void adicionarContato() {
	System.out.println("Adicionando contato novo");
	}
	
	@Override
	public void iniciarCorreioVoz() {
	System.out.println("Iniciando o correio de voz");
	}
	
	
	
	@Override
	public void exibirPagina() {
	System.out.println("Exibindo página");
	}
	
	@Override
	public void adicionarPagina() {
	System.out.println("Adicionando nova aba");
	}
	
	@Override
	public void atualizarPagina() {
	System.out.println("Atualizando a página");
	}
	
	public static void main(String[] args) {
		
		
	 Iphone MeuIphone = new Iphone();	
		
		
	// Ipod
	 MeuIphone.tocar();
	 MeuIphone.pausar();
	 MeuIphone.selecionarMusica();
	 MeuIphone.selecionarBanda();
	 MeuIphone.selecionarAlbum();
	 
	 //telefone
	 MeuIphone.ligar();
	 MeuIphone.atender();
	 MeuIphone.adicionarContato();
	 MeuIphone.iniciarCorreioVoz();
	 
	 //navegador
	 MeuIphone.exibirPagina();
	 MeuIphone.adicionarPagina();
	 MeuIphone.atualizarPagina();
	 	
		
		






















































    
 }
}
 