package br.edu.ifpe.extensao.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class FolhaDeEstilo implements EntryPoint
{
	// Como é um interface - precisa implementar esse método.
	@Override public void onModuleLoad()
	{
		Button botao = new Button("botão normal");
		//
		Button botaoFechar = new Button("Botão Fechar");
		botaoFechar.setStyleName("meubotao");
		// Este botão fechar vai ter sua estilização própria, ou seja, diferente
		// da estilização padrão.
		RootPanel.get().add(botao);
		// Não deu certo a estilização.
		RootPanel.get().add(botaoFechar);
	}
}
