package br.edu.ifpe.extensao.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabPanel;

public class TabPanelTest implements EntryPoint
{
	// public TabPanelTest()
	// {
	// }
	@Override public void onModuleLoad()
	{
		Label label = new Label("Hello, GWT!!!");
		Button button = new Button("Click me");
		Button botaoVaiParaJava = new Button("Aba do Java");
		button.addClickHandler(new ClickHandler()
		{
			@Override public void onClick(ClickEvent event)
			{
				label.setVisible(!label.isVisible());
			}
		});
		TabPanel painelAbsoluto = new TabPanel();
		painelAbsoluto.setSize("400", "300px");
		FlowPanel flowPanelQualquer = new FlowPanel();
		flowPanelQualquer.add(new Label("Conteúdo do Label"));
		FlowPanel flowPanelJava = new FlowPanel();
		flowPanelJava.add(new Label("Painel Java"));
		FlowPanel flowPanelAndroid = new FlowPanel();
		flowPanelAndroid.add(new Label("Curso de Android"));
		flowPanelAndroid.add(botaoVaiParaJava);
		//
		painelAbsoluto.add(flowPanelQualquer, "Curso qualquer");
		painelAbsoluto.add(flowPanelJava, "Java");
		painelAbsoluto.add(flowPanelAndroid, "Android");
		// Para explicitar qual das abas deve ser aberta diretamente, usa-se o
		// método selectTab com o respectivo índice.
		//
		// Adicionando uma ação ao botão para sair do android para o Java.
		botaoVaiParaJava.addClickHandler(new ClickHandler()
		{
			@Override public void onClick(ClickEvent event)
			{
				painelAbsoluto.selectTab(1);
			}
		});
		painelAbsoluto.selectTab(2);
		painelAbsoluto.setStyleName("painel");
		RootPanel.get().add(painelAbsoluto);
	}
}
