package br.edu.ifpe.extensao.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class PainelHorizontal implements EntryPoint
{
	@Override public void onModuleLoad()
	{
		// Movendo todo o código para a classe implementada
		// Button botao1 = new Button("Botão 1");
		// Button botao2 = new Button("Botão 2");
		// TextBox textBoxUsuario = new TextBox();
		// PasswordTextBox senha = new PasswordTextBox();
		// Label labelUsuario = new Label("Usuário");
		// Label labelSenha = new Label("Senha");
		// //
		// HorizontalPanel painelHorizontal = new HorizontalPanel();
		// painelHorizontal.add(labelUsuario);
		// painelHorizontal.add(textBoxUsuario);
		// painelHorizontal.add(labelSenha);
		// painelHorizontal.add(senha);
		// RootPanel.get().add(painelHorizontal);
		new FilhaDeDialogBox();
	}
}
