package br.com.api;

import br.com.api.action.ExecuteBot;

public class App {

	public static void main(String[] args) {
		ExecuteBot exec = new ExecuteBot();
		exec.setUrl("http://www.google.com.br");
		exec.execute();
	}
}
