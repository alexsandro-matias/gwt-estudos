package br.edu.ifpe.extensao.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PainelCaption implements EntryPoint
{
	@Override public void onModuleLoad()
	{
		// Painel com uma borda retangular
		CaptionPanel painel = new CaptionPanel("Video aulas");
		VerticalPanel verticalPanel = new VerticalPanel();
		verticalPanel.add(new Label("Nome"));
		verticalPanel.add(new TextBox());
		verticalPanel.add(new Button("Salvar"));
		painel.setContentWidget(verticalPanel);
		DOM.setAttribute(verticalPanel.getElement(), "border", "3px solid red");
		// Configuração do estilo do painel usando métodos de uma classe
		// estática chamada DOM. Ajustando a borda do painel
		DOM.setStyleAttribute(painel.getContentWidget().getElement(), "border", "4px solid blue");
		DOM.setStyleAttribute(painel.getContentWidget().getElement(), "padding", "15px 15px 15px");
		DOM.setStyleAttribute(painel.getContentWidget().getElement(), "margin", "30px 30px 30px");
		// setando o elemento contido no painel:
		// DOM.setStyleAttribute(label.getElement(), "border", "4px solid red");
		// painel.add(textBoxNome);
		RootPanel.get().add(painel);
	}
}
