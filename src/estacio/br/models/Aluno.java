package estacio.br.models;

public class Aluno {
	private String nome;
	private String sexo;
	private int idade;

	public Aluno() {
	}

	public Aluno(String nome, String sexo, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Aluno criarAluno(Aluno aluno) {
		aluno.setNome(nome);
		aluno.setSexo(sexo);
		aluno.setIdade(idade);
		return aluno;
	}

	public Aluno editarAluno(Aluno aluno) {
		if (aluno != null) {
			aluno.setNome(nome);
			aluno.setSexo(sexo);
			aluno.setIdade(idade);
			return aluno;
		}
		return aluno;
	}
}
