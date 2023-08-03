package br.edu.ifpe.extensao.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TabPanelComImagem implements EntryPoint
{
	@Override public void onModuleLoad()
	{
		VerticalPanel painel = new VerticalPanel();
		// Imagem de um link de URL
		// Image imagem = new Image(
		// "https://sites.ufpe.br/polotecnologico/wp-content/uploads/sites/76/2021/09/logo-ifpe.png");
		// Outra forma seria pelo método setURL
		Image imagem = new Image();
		imagem.setUrl("https://sites.ufpe.br/polotecnologico/wp-content/uploads/sites/76/2021/09/logo-ifpe.png");
		// // Colocando um título na imagem - quando o mouse passar na imagem,
		// // mostrar uma mensagem.
		// imagem.setTitle("logo do IFPE");
		// Dando erro neste construtor do local da imagem - imagem não
		// encontrada
		// Image imagemLocal = new
		// Image("C:\\Users\\almei\\github-repositorios\\gwt-estudos\\extensao");
		// imagemLocal.setSize("200px", "200px");
		Label labelNome = new Label("Nome");
		TextBox textBoxNome = new TextBox();
		Button button = new Button("Salvar");
		painel.add(imagem);
		painel.add(labelNome);
		painel.add(textBoxNome);
		painel.add(button);
		button.addClickHandler(new ClickHandler()
		{
			@Override public void onClick(ClickEvent event)
			{
				Window.alert("Cadastro realizado com Sucesso.");
			}
		});
		RootPanel.get().add(painel);
	}
}
