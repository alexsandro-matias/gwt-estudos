package br.edu.ifpe.extensao.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class FilhaDeDialogBox extends DialogBox
{
	// A princípio, ele tem as mesma funcionalidades do PopUpPanel. Porém com
	// mais interatividade. Essas funcionalidades a mais são: inserção de bordas
	// e possibilidade de mover o componente pela página, possibilidade de barra
	// de título e outras.
	public FilhaDeDialogBox()
	{
		super(true);
		Button botao1 = new Button("Enviar");
		TextBox textBoxUsuario = new TextBox();
		PasswordTextBox senha = new PasswordTextBox();
		Label labelUsuario = new Label("Usuário");
		Label labelSenha = new Label("Senha");
		VerticalPanel painelVertical = new VerticalPanel();
		painelVertical.add(labelUsuario);
		painelVertical.add(textBoxUsuario);
		painelVertical.add(labelSenha);
		painelVertical.add(senha);
		painelVertical.add(botao1);
		setWidget(painelVertical);
		setText("Título da caixa de diálogo");
		// RootPanel.get().add(painelHorizontal);
		// adicionando animação à caixa.
		setAnimationEnabled(true);
		// setWidget(new Label("filha de DialogBox"));
		// Deixando a cor de fundo da animação.
		setGlassEnabled(true);
		center();
		// adicionando evento ao botão ser clicado.
		botao1.addClickHandler(new ClickHandler()
		{
			@Override public void onClick(ClickEvent event)
			{
				FilhaDeDialogBox.this.hide();
			}
		});
	}
}
