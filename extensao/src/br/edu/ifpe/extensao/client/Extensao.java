//Aula a ser vista - aula 3756 gwt Conhecendo a estrutura da aplicacao gwt
//https://www.youtube.com/watch?v=GukLbyJc7MU&list=PL3821B1F5BC3E5C11&index=8
package br.edu.ifpe.extensao.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Extensao implements EntryPoint
{
	// Como é um interface - precisa implementar esse método.
	@Override public void onModuleLoad()
	{
		// Da mesma forma que o código é JavaScript, também existe um método
		// chamado alert.
		Window.alert("Bem-vindo.");
		Label label1 = new Label("Isto é uma label.");
		// Um label pode ser considerado um texto relativamente simples na
		// página. Então para adicionar um texto que tenha alguma
		// característica de HTML, se deve usar uma classe HTML do pacote do
		// google.gwt
		HTML htmlQualquer = new HTML("Isso é um HTML");
		// Já que é um texto em HTML, então é suportado
		HTML htmlEmNegrito = new HTML("<b>Label em Negrito<b>");
		String link = "https://www.gwtproject.org/doc/latest/tutorial/index.html";
		// Não somente essas características, também os de link.
		HTML linkReferenciado = new HTML("<a href=\"" + link + "\">Linkqualquer</a>");
		//
		// Adicionando um botão
		Button botao = new Button("Veja o estado do botão abaixo");
		// Para adicionar uma ação ao botão usaremos o método abaixo que recebe
		// um clique como parâmetro.
		/*
		 * Outro widget é o ToogleButton. que muda de situação quando clicado
		 * mais uma vez, ou seja, um clique um estado, e quando clicado
		 * novamente vai apresentar outro estado (Dois estado).
		 */
		// Verificando quais itens foram selecionados ou marcados.
		Button botaoStatus = new Button("Clique para ver o que estado civil.");
		ToggleButton toggleButton = new ToggleButton("Botão não clicado", "Botão clicado");
		/**
		 * Com esse botão, em cada estado desse, já possível personalizar as
		 * ações que cada estado. usando também o método clickHandler()
		 */
		//
		// PushButton
		//
		/**
		 * Já para um botão mais personalizado como conteúdo, cor ou imagens
		 * dentro dele, se usa o Pushbutton. Outra característica é que para
		 * passar para a segunda ação, o mouse precisa pressionar o botão.
		 */
		PushButton pushButton = new PushButton("Primeiro texto", "Segundo texto");
		// Também possui um construtor sobrecarregado. dando control + space é
		// fácil de ver tais construtores. Outra forma de instanciar usando
		// imagens:
		// PushButton pushButton = new PushButton(new
		// Image("pathComLocalDaImagem"),
		// "Segundo texto");
		//
		// RadioButton
		/**
		 * Usado para seleção de itens exclusivos - sexo por exemplo e estado
		 * civil
		 */
		RadioButton radioButtonFeminino = new RadioButton("Sexo", "Feminino");
		// supondo que por padrão os valor já venha marcado.
		radioButtonFeminino.setValue(true);
		RadioButton radioButtonMasculino = new RadioButton("Sexo", "Masculino");
		RadioButton radioButtonSolteiro = new RadioButton("Estado Civil", "Solteiro");
		RadioButton radioButtonCasado = new RadioButton("Estado Civil", "Casado");
		//
		// Checkbox
		CheckBox curso1 = new CheckBox("Java");
		CheckBox curso2 = new CheckBox("Android");
		CheckBox curso3 = new CheckBox("MySQL");
		// Flag já selecionada já quando a página é atualizada.
		curso1.setValue(true);
		botao.addClickHandler(new ClickHandler()
		{
			@Override public void onClick(ClickEvent event)
			{
				if (toggleButton.isDown())
				{
					Window.alert("Botão pressionado.");
				}
				else
				{
					Window.alert("Botão liberado");
				}
			}
		});
		//
		// TextBox
		/**
		 * Este elemento é utilizado quando se deseja, como o próprio nome
		 * define, uma caixa de texto na página. O que é algo similar ao
		 * TextField em Java.
		 */
		TextBox textBox = new TextBox();
		PasswordTextBox senha = new PasswordTextBox();
		// Este é um texto de observação que alguém queria colocar que pode ser
		// redimensionado.
		TextArea observacao = new TextArea();
		// A função deste método get() é utilizar um elemento dentro da página
		// html.
		// Lista de itens - ListBox
		ListBox listaDeNome = new ListBox();
		listaDeNome.addItem("Alexsandro");
		listaDeNome.addItem("Paulo Guedes");
		listaDeNome.addItem("Rafael Moraes");
		RootPanel.get("primeiraColuna").add(label1);
		RootPanel.get("segundaColuna").add(htmlQualquer);
		RootPanel.get().add(htmlEmNegrito);
		RootPanel.get().add(linkReferenciado);
		RootPanel.get().add(botao);
		// Este método get ele é sobrecarregado, ele também pode ser um Id como
		// Para adicionar um label à página ou qualquer outro elemento(também
		// chamado de Widgets), é
		// necessário outra classe chamada
		// RootPanel.
		// parâmetro do tipo String.
		// ToggleButton iniciado.
		// Personalizando os estados.
		RootPanel.get().add(toggleButton);
		RootPanel.get().add(pushButton);
		RootPanel.get().add(radioButtonMasculino);
		RootPanel.get().add(radioButtonFeminino);
		RootPanel.get().add(radioButtonSolteiro);
		RootPanel.get().add(radioButtonCasado);
		RootPanel.get().add(curso1);
		RootPanel.get().add(curso2);
		RootPanel.get().add(curso3);
		RootPanel.get().add(botaoStatus);
		botaoStatus.addClickHandler(new ClickHandler()
		{
			@Override public void onClick(ClickEvent event)
			{
				if (radioButtonCasado.getValue())
				{
					Window.alert("Estado civil: Casado");
				}
				else
				{
					Window.alert("Estado civil: Solteiro.");
				}
				Window.alert(listaDeNome.getSelectedItemText());
			}
		});
		//
		// Estes elementos, ao invés de serem adicionados a página de forma
		// aleatória, agora serão colocados dentro de um painel vertical.
		// RootPanel.get().add(textBox);
		// RootPanel.get().add(senha);
		// RootPanel.get().add(observacao);
		//
		VerticalPanel painel = new VerticalPanel();
		painel.add(textBox);
		painel.add(senha);
		painel.add(observacao);
		//
		// Adicionando a lista de Pessoas ao painel vertical.
		painel.add(listaDeNome);
		RootPanel.get().add(painel);
	}
	// Esta parte é criada como projeto de exemplo.Linha toda comentada para ser
	// feita do zero. Todo este corpo deve está
	// dentro de Extensao.
	// // sugestão de exclusão destes atributos.
	// // /**
	// // * The message displayed to the user when the server cannot be reached
	// or
	// // * returns an error.
	// // */
	// // private static final String SERVER_ERROR = "An error occurred while "
	// // + "attempting to contact the server. Please check your network " +
	// // "connection and try again.";
	// // /**
	// // * Create a remote service proxy to talk to the server-side Greeting
	// // service.
	// // */
	// // private final GreetingServiceAsync greetingService =
	// // GWT.create(GreetingService.class);
	// //
	// // /**
	// // * This is the entry point method.
	// // */
	// // Adicionando itens à página
	// // private Label labelBoasVindas = new Label("Primeiro programa");
	// // private Button botaoOK = new Button("Ok");
	// // private TextBox caixaDeTexto = new TextBox();
	// // Realizando uma média simples
	// private Label labelNumero1 = new Label("Primeiro Número");
	// private TextBox textoNumero1 = new TextBox();
	// private Label labelNumero2 = new Label("Segundo Número");
	// private TextBox textoNumero2 = new TextBox();
	// private Button botaoresposta = new Button("Calcular");
	//
	// public void onModuleLoad()
	// {
	// // RootPanel.get().add(labelBoasVindas);
	// // RootPanel.get().add(caixaDeTexto);
	// // RootPanel.get().add(botaoOK);
	// // // adicionando evento ao botão
	// // botaoOK.addClickHandler(new ClickHandler()
	// // {
	// // @Override public void onClick(ClickEvent event)
	// // {
	// // Window.alert("Olá " + caixaDeTexto.getText());
	// // }
	// // });
	// RootPanel.get().add(labelNumero1);
	// RootPanel.get().add(textoNumero1);
	// RootPanel.get().add(labelNumero2);
	// RootPanel.get().add(textoNumero2);
	// RootPanel.get().add(botaoresposta);
	// botaoresposta.addClickHandler(new ClickHandler()
	// {
	// @Override public void onClick(ClickEvent event)
	// {
	// double primeiro = Double.parseDouble(textoNumero1.getText());
	// double segundo = Double.parseDouble(textoNumero2.getText());
	// double media = (primeiro + segundo) / 2;
	// // Para exibir a resposta
	// botaoresposta.setText("Média = " + media);
	// }
	// });
	// // // Todo este conteúdo dentro do método deve ser excluído
	// // final Button sendButton = new Button("Send");
	// // final TextBox nameField = new TextBox();
	// // nameField.setText("GWT User");
	// // final Label errorLabel = new Label();
	// // // We can add style names to widgets
	// // sendButton.addStyleName("sendButton");
	// // // Add the nameField and sendButton to the RootPanel
	// // // Use RootPanel.get() to get the entire body element
	// // RootPanel.get("nameFieldContainer").add(nameField);
	// // RootPanel.get("sendButtonContainer").add(sendButton);
	// // RootPanel.get("errorLabelContainer").add(errorLabel);
	// // // Focus the cursor on the name field when the app loads
	// // nameField.setFocus(true);
	// // nameField.selectAll();
	// // // Create the popup dialog box
	// // final DialogBox dialogBox = new DialogBox();
	// // dialogBox.setText("Remote Procedure Call");
	// // dialogBox.setAnimationEnabled(true);
	// // final Button closeButton = new Button("Close");
	// // // We can set the id of a widget by accessing its Element
	// // closeButton.getElement().setId("closeButton");
	// // final Label textToServerLabel = new Label();
	// // final HTML serverResponseLabel = new HTML();
	// // VerticalPanel dialogVPanel = new VerticalPanel();
	// // dialogVPanel.addStyleName("dialogVPanel");
	// // dialogVPanel.add(new HTML("<b>Sending name to the server:</b>"));
	// // dialogVPanel.add(textToServerLabel);
	// // dialogVPanel.add(new HTML("<br><b>Server replies:</b>"));
	// // dialogVPanel.add(serverResponseLabel);
	// // dialogVPanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
	// // dialogVPanel.add(closeButton);
	// // dialogBox.setWidget(dialogVPanel);
	// // // Add a handler to close the DialogBox
	// // closeButton.addClickHandler(new ClickHandler()
	// // {
	// // public void onClick(ClickEvent event)
	// // {
	// // dialogBox.hide();
	// // sendButton.setEnabled(true);
	// // sendButton.setFocus(true);
	// // }
	// // });
	// // // Create a handler for the sendButton and nameField
	// // class MyHandler implements ClickHandler, KeyUpHandler
	// // {
	// // /**
	// // * Fired when the user clicks on the sendButton.
	// // */
	// // public void onClick(ClickEvent event)
	// // {
	// // sendNameToServer();
	// // }
	// //
	// // /**
	// // * Fired when the user types in the nameField.
	// // */
	// // public void onKeyUp(KeyUpEvent event)
	// // {
	// // if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER)
	// // {
	// // sendNameToServer();
	// // }
	// // }
	// //
	// // /**
	// // * Send the name from the nameField to the server and wait for a
	// // response.
	// // */
	// // private void sendNameToServer()
	// // {
	// // // First, we validate the input.
	// // errorLabel.setText("");
	// // String textToServer = nameField.getText();
	// // if (!FieldVerifier.isValidName(textToServer))
	// // {
	// // errorLabel.setText("Please enter at least four characters");
	// // return;
	// // }
	// // // Then, we send the input to the server.
	// // sendButton.setEnabled(false);
	// // textToServerLabel.setText(textToServer);
	// // serverResponseLabel.setText("");
	// // greetingService.greetServer(textToServer, new AsyncCallback<String>()
	// // {
	// // public void onFailure(Throwable caught)
	// // {
	// // // Show the RPC error message to the user
	// // dialogBox.setText("Remote Procedure Call - Failure");
	// // serverResponseLabel.addStyleName("serverResponseLabelError");
	// // serverResponseLabel.setHTML(SERVER_ERROR);
	// // dialogBox.center();
	// // closeButton.setFocus(true);
	// // }
	// //
	// // public void onSuccess(String result)
	// // {
	// // dialogBox.setText("Remote Procedure Call");
	// // serverResponseLabel.removeStyleName("serverResponseLabelError");
	// // serverResponseLabel.setHTML(result);
	// // dialogBox.center();
	// // closeButton.setFocus(true);
	// // }
	// // });
	// // }
	// // }
	// // // Add a handler to send the name to the server
	// // MyHandler handler = new MyHandler();
	// // sendButton.addClickHandler(handler);
	// // nameField.addKeyUpHandler(handler);
	// // final do comentário
	// }
}
