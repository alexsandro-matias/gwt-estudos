package br.edu.ifpe.extensao.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class DeckPanelExemplo implements EntryPoint
{
	@Override public void onModuleLoad()
	{
		DeckPanel deckPanel = new DeckPanel();
		Button botao1 = new Button("Botão 1");
		botao1.setStyleName("meubotao", true);
		TextBox textBoxUsuario = new TextBox();
		PasswordTextBox senha = new PasswordTextBox();
		Label labelUsuario = new Label("Usuário");
		Label labelSenha = new Label("Senha");
		// //
		VerticalPanel painelVertical = new VerticalPanel();
		painelVertical.add(labelUsuario);
		painelVertical.add(textBoxUsuario);
		painelVertical.add(labelSenha);
		painelVertical.add(senha);
		RootPanel.get().add(deckPanel);
	}
}
