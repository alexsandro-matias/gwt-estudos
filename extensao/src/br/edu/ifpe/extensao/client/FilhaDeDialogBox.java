package br.edu.ifpe.extensao.client;

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Label;

public class FilhaDeDialogBox extends DialogBox
{
	// A princípio, ele tem as mesma funcionalidades do PopUpPanel. Porém com
	// mais interatividade. Essas funcionalidades a mais são: inserção de bordas
	// e possibilidade de mover o componente pela página, possibilidade de barra
	// de título e outras.
	public FilhaDeDialogBox()
	{
		super(true);
		setText("Título da caixa de diálogo");
		setWidget(new Label("filha de DialogBox"));
		// adicionando animação à caixa.
		setAnimationEnabled(true);
		// Deixando a cor de fundo da animação.
		setGlassEnabled(true);
		center();
	}
}
