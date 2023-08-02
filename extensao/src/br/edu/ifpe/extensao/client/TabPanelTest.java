package br.edu.ifpe.extensao.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class TabPanelTest implements EntryPoint
{
	@Override public void onModuleLoad()
	{
		FlowPanel painel = new FlowPanel();
		// Neste elementos, os widgets são adicionados um ao lado do outro, e
		// quando não couber, ele passa o elemento para a próxima linha. No caso
		// abaixo, como o espaço é pequeno, isso acontecer.
		// painel.setSize("100px", "100px");
		// Já na linha de baixo, o elemento tem um espaço bem maior, cabendo
		// mais botões, ou seja, não passando para o linha de baixo.
		painel.setStyleName("panel");
		painel.setSize("700px", "700px");
		painel.add(new Button("Salvar"));
		painel.add(new Button("Alterar"));
		painel.add(new Button("Excluir"));
		painel.add(new Button("Imprimir"));
		painel.add(new Button("Sair"));
		
		// Colocando itens em determinadas posições:
		painel.insert(new TextBox(), 1);
		painel.insert(new CheckBox("Selecionado"), 2);
		
		RootPanel.get().add(painel);
		// Já para os labels, os elementos são adicionados de cima para baixo.
	}
}
