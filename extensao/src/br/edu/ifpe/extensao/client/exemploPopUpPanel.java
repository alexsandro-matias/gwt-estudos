package br.edu.ifpe.extensao.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class exemploPopUpPanel implements EntryPoint
{
	@Override public void onModuleLoad()
	{
		PopupPanel painelPopUp = new PopupPanel(true);
		painelPopUp.setWidget(new Label("Um label"));
		Button botaoPopUpPanel = new Button("Chamar painel Pop up");
		botaoPopUpPanel.addClickHandler(new ClickHandler()
		{
			@Override public void onClick(ClickEvent event)
			{
				painelPopUp.show();
				// Mas desta forma, uma vez mostrado este componente não é
				// possível fecha-lo. Para isso, precisamos mudar o construtor e
				// passar o parâmetro True. Isso fará o método autohide como
				// True. Ou seja, ao clicar fora do componente, ele desaparece.
				// Para mostrar centralizado.
				painelPopUp.center();
				// Ou para ajustar a posição em pixels.
				painelPopUp.setPopupPosition(300, 300);
			}
		});
		RootPanel.get().add(botaoPopUpPanel);
	}
}
