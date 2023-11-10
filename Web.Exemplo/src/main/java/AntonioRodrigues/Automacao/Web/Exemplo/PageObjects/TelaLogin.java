package AntonioRodrigues.Automacao.Web.Exemplo.PageObjects;

import AntonioRodrigues.Automacao.Web.Core.LocalizaPor;
import AntonioRodrigues.Automacao.Web.Core.TeclasEspeciais;
import AntonioRodrigues.Automacao.Web.Exemplo.Base.TelaBase;
import AntonioRodrigues.Automacao.Web.Exemplo.Mapeamentos.TelaLoginMap;

public class TelaLogin extends TelaBase {
	public boolean ConsultarExistenciaTela() throws Exception {
//		super.AguardarPor(4);
		
		return super.ConsultarExistenciaTela(LocalizaPor.Xpath, TelaLoginMap.TextBoxLoginEmail.toString());
	}
	
	public boolean InserirTextoLoginEmail(String texto) {
		return super.InserirTexto(LocalizaPor.Xpath, TelaLoginMap.TextBoxLoginEmail.toString(), texto);
	}
	
	public boolean InserirTextoLoginSenha(String texto) {
		return super.InserirTexto(LocalizaPor.Xpath, TelaLoginMap.TextBoxLoginSenha.toString(), texto);
	}
	
	public boolean ClicarBotaoLogin() {
		return super.ClicarBotao(LocalizaPor.Xpath, TelaLoginMap.BotaoLogar.toString());
	}
	
	public boolean InserirTextoCadastroEmail(String texto) {
		return super.InserirTexto(LocalizaPor.Xpath, TelaLoginMap.TextBoxCadastroEmail.toString(), texto);
	}
	
	public boolean InserirTextoCadastroNomeUsuario(String texto) {
		return super.InserirTexto(LocalizaPor.Xpath, TelaLoginMap.TextBoxCadastroNomeUsuario.toString(), texto);
	}
	
	public boolean ClicarBotaoCadastrar() {
		return super.ClicarBotao(LocalizaPor.Xpath, TelaLoginMap.BotaoCadastrar.toString());
	}
}
