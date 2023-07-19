package br.edu.ifpe.extensao.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class TiposPaineis implements EntryPoint
{
	@Override public void onModuleLoad()
	{
		// Movendo todo o código para a classe implementada
		Button botao1 = new Button("Botão 1");
		botao1.setStyleName("meubotao", true);
		TextBox textBoxUsuario = new TextBox();
		PasswordTextBox senha = new PasswordTextBox();
		Label labelUsuario = new Label("Usuário");
		Label labelSenha = new Label("Senha");
		// //
		// HorizontalPanel painelHorizontal = new HorizontalPanel();
		// painelHorizontal.add(labelUsuario);
		// painelHorizontal.add(textBoxUsuario);
		// painelHorizontal.add(labelSenha);
		// painelHorizontal.add(senha);
		// RootPanel.get().add(painelHorizontal);
		//
		//
		// Painel Absoluto
		/**
		 * O painel absoluto permite que seja adicionado o Widget e sua posição
		 * absoluta na página.
		 */
		AbsolutePanel absoluto = new AbsolutePanel();
		absoluto.add(labelUsuario, 20, 20);
		absoluto.add(textBoxUsuario, 20, 50 );
		absoluto.add(labelSenha,20,70);
		absoluto.add(senha);
		absoluto.add(botao1);
		RootPanel.get().add(absoluto);
		// new FilhaDeDialogBox();
	}
}
