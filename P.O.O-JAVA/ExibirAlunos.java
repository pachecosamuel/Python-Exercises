package br.org.serratec.exemplos;

import java.util.function.Consumer;

import br.org.serratec.model.Aluno;

public class ExibirAlunos implements Consumer<Aluno>{

	@Override
	public void accept(Aluno t) {

		/*System.out.println(t.getNome());
		System.out.println(t.getEmail());
		System.out.println(t.getIdade());*/
		
		System.out.println(t);
		
	}

	
}
