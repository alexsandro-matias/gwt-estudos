package br.edu.ifpe.extensao.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class PainelCaption implements EntryPoint
{
	@Override public void onModuleLoad()
	{
		// Painel com uma borda retangular
		CaptionPanel painel = new CaptionPanel("Video aulas.");
		RootPanel.get().add(painel);
	}
}
