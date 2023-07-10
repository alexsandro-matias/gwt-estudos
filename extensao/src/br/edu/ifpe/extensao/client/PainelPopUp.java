package br.edu.ifpe.extensao.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RootPanel;

// Porém uma vez criado, esta classe que tem um EntryPoint. 
//Isso precisa ser declarado no arquivo .XML que referencia o EntryPoint.
public class PainelPopUp implements EntryPoint
{
	@Override public void onModuleLoad()
	{
		PopupPanel popUp = new PopupPanel();
		// criando um painel relativamente simples
		Button botaoPopUp = new Button("Painel Pop Up");
		// Da mesma forma que no outro arquivo, iremos criar um evento para que
		// quando o botão for clicado.
		botaoPopUp.addClickHandler(new ClickHandler()
		{
			@Override public void onClick(ClickEvent event)
			{
			}
		});
		RootPanel.get().add(botaoPopUp);
	}
}
