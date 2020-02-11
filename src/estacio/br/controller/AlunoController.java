package estacio.br.controller;

import javax.swing.JOptionPane;

import estacio.br.models.Aluno;

public class AlunoController {
	String nome, sexo;
	int idade;

	public Aluno criarAlunoPrincipal(Aluno aluno) {
		do {
			limparCampos();
			try {
				nome = (JOptionPane.showInputDialog("Informe o nome do aluno:"));
				sexo = (JOptionPane.showInputDialog("Informe o sexo do aluno:"));
				String idadeAluno = JOptionPane.showInputDialog("Informe a idade do aluno:");
				if (!idadeAluno.equals("")) {
					idade = Integer.parseInt(idadeAluno);
					if (!nome.equals("") && !sexo.equals("") && idade != 0) {
						aluno.setNome(nome);
						aluno.setSexo(sexo);
						aluno.setIdade(idade);
						aluno.criarAluno(aluno);
						JOptionPane.showMessageDialog(null, "Nome: " + aluno.getNome() + ", \nSexo: " + aluno.getSexo()
								+ ", \nIdade: " + aluno.getIdade());
						return aluno;
					} else {
						limparCampos();
						JOptionPane.showMessageDialog(null, "Os campos são obrigatorios");
					}
				} else {
					limparCampos();
					JOptionPane.showMessageDialog(null, "A idade só pode haver números.");
				}
			} catch (NumberFormatException e) {
				limparCampos();
				JOptionPane.showMessageDialog(null, "A idade só pode haver números. " + e.getMessage());
			}
		} while (nome.equals("") && sexo.equals("") && idade == 0);
		return aluno;
	}

	public Aluno editarAlunoPrincipal(Aluno aluno) {
		if (aluno.getNome() != null && aluno.getNome() != "") {
			int confirme = JOptionPane.showConfirmDialog(null, "Deseja alterar o aluno " + aluno.getNome());
			if (confirme == 0) {
				criarAlunoPrincipal(aluno);
			} else {
				return aluno;
			}
			return aluno;
		} else {
			JOptionPane.showMessageDialog(null, "Aluno não cadastrado");
			return aluno;
		}
	}

	public Aluno excluirAluno(Aluno aluno) {
		if (aluno.getNome() != null && aluno.getNome() != "") {
			int ok = JOptionPane.showConfirmDialog(null,
					"Tem certeza que deseja excluir o aluno " + aluno.getNome() + "?");
			if (ok == 0) {
				limparCampos();
				aluno.setNome(nome);
				aluno.setSexo(sexo);
				aluno.setIdade(idade);
				JOptionPane.showMessageDialog(null, "Aluno excluido com sucesso.");
				return aluno;
			} else {
				return aluno;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Aluno não cadastrado");
			return aluno;
		}
	}

	public void limparCampos() {
		nome = "";
		sexo = "";
		idade = 0;
	}
}
