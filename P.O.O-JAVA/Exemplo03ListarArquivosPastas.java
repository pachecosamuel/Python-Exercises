package br.org.serratec.arquivos;

import java.io.File;
import java.util.Scanner;

public class Exemplo03ListarArquivosPastas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o arquivo ou diret�rio");
		String nome = sc.nextLine();
		File file = new File(nome);
		
		if (file.exists()) {
			if (file.isFile()) {
				System.out.printf("O arquivo (%s) existe - e o"
						+ " tamanho �: %d bytes " , file.getName(), file.length());
			}	 else {
				System.out.println("O conte�do da pasta �: ");
				//String[] diretorio = file.list();
				for (Object x : file.list()) {
					System.out.println(x);
				}
			}
		} else {
			System.out.println("Arquivo ou diret�rio n�o encontrado!");
		}
		
	}

}

