package estacio.br.principal;

import javax.swing.JOptionPane;

import estacio.br.controller.AlunoController;
import estacio.br.models.Aluno;

public class Principal {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		try {
			int opcao = 0;
			do {
				opcao = addAluno(opcao, aluno);
			} while (opcao != 0);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Programa encerrado!");
		}
	}

	public static int addAluno(int opcao, Aluno aluno) {
		AlunoController alunoController = new AlunoController();
		
		try {
			JOptionPane.showMessageDialog(null,
					"### SCA - Sistema de Cadastro de Alunos ###"
							+ "\n                  ========================="
							+ "\n                   |     1 - Criar Aluno         |"
							+ "\n                   |     2 - Editar Aluno	       |"
							+ "\n                   |     3 - Excluir Aluno	     |"
							+ "\n                   |     0 - Exit                       |"
							+ "\n                  =========================\n");

			String op = JOptionPane.showInputDialog("Informe uma opção!");
			if (!op.equals("")) {
				opcao = Integer.parseInt(op);
				switch (opcao) {
				case 1:
					alunoController.criarAlunoPrincipal(aluno);
					break;
				case 2:
					alunoController.editarAlunoPrincipal(aluno);
					break;
				case 3:
					alunoController.excluirAluno(aluno);
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Programa encerrado!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida!");
					break;
				}
			} else {
				opcao = 3;
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
			}

		} catch (NumberFormatException e) {
			opcao = 3;
			JOptionPane.showMessageDialog(null, "A opcão só pode ser números.");
		}
		return opcao;
	}
}
