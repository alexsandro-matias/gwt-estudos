package br.edu.ifpe.extensao.client;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;

public class FilhaDePopUpPanel extends PopupPanel
{
	public FilhaDePopUpPanel()
	{
		super(true);
		setWidget(new Label("Widget Filha"));
		center();
	}
}
