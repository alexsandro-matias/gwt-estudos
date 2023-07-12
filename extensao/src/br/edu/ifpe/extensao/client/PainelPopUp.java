package br.edu.ifpe.extensao.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RootPanel;

// Porém uma vez criado, esta classe que tem um EntryPoint. 
//Isso precisa ser declarado no arquivo .XML que referencia o EntryPoint.
public class PainelPopUp implements EntryPoint
{
	@Override public void onModuleLoad()
	{
//		 PopupPanel painelPopUp = new PopupPanel();
		 PopupPanel painelPopUp = new PopupPanel(true);
		// criando um painel relativamente simples
		 Button botaoPopUp = new Button("Clique no Botão");
		//
		// Mas ainda falta melhorar o posicionamento do popup. Para isso, usa-se
		// o método setPosition().
		// painelPopUp.setPopupPosition(250, 300);
		//
		
		// Da mesma forma que no outro arquivo, iremos criar um evento para que
		// quando o botão for clicado.
		//
		 painelPopUp.setWidget(new Label("Botão clicado"));
		// Porém quando o botão é clicado, essa seleção não sai, ou seja, fica
		// selecionado o tempo todo. Em outras palavras, não é possível fazer
		// outra ação. Isso acontece por que o construtor espera um valor
		// booleano que por padrão já vem passado como falso. Se passar
		// verdadeiro, existe um método autohide que se receber esse valor do
		// construtor como true, ele vai esconder o popUp depois de clicado.
		// Assim quando for passado o parâmetro true, quando clicado fora do
		// botão, o PopUp vai sumir.
		botaoPopUp.addClickHandler(new ClickHandler()
		{
			@Override public void onClick(ClickEvent event)
			{
				// Para centralizar o popup. Apesar de que já fica inicialmente
				// centralizado.
//				new PontoDeEntrada().show();
				 painelPopUp.center();
				 painelPopUp.show();
				// Caso a forma como os botões esteja diferente das aulas, basta
				// escolher qual tema que será herdado no arquivo .xml de
				// configuração de temas herdados.
				// <inherits name='com.google.gwt.user.theme.standard.Standard'
				// />
			}
		});
		RootPanel.get().add(botaoPopUp);
	}
}
