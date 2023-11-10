package AntonioRodrigues.Automacao.Web.Exemplo.PageObjects;

import java.util.List;

import AntonioRodrigues.Automacao.Web.Core.LocalizaPor;
import AntonioRodrigues.Automacao.Web.Exemplo.Base.TelaBase;
import AntonioRodrigues.Automacao.Web.Exemplo.Mapeamentos.TelaCadastroUsuarioMap;

public class TelaCadastroUsuario extends TelaBase{	
	public boolean ValidarExistenciaTela() {
		return true;
	};
	
	public boolean SelecionarRadioTitulo() {
		return super.ClicarElemento(LocalizaPor.Xpath, TelaCadastroUsuarioMap.RadioTitulo.toString());
	}
	
	public boolean InserirSenha(String texto) {
		return super.InserirTexto(LocalizaPor.Xpath, TelaCadastroUsuarioMap.TextBoxSenha.toString(), texto);
	}
	
	public boolean DefinirDataAniversarioDia() {
		return super.ClicarElemento(LocalizaPor.Xpath, TelaCadastroUsuarioMap.ComboBoxDataNascimentoDia.toString());
	}
	
	public boolean DefinirDataAniversarioMes() {
		return super.ClicarElemento(LocalizaPor.Xpath, TelaCadastroUsuarioMap.ComboBoxDataNascimentoMes.toString());
	}
	
	public boolean DefinirDataAniversarioAno() {
		return super.ClicarElemento(LocalizaPor.Xpath, TelaCadastroUsuarioMap.ComboBoxDataNascimentoAno.toString());
	}
	
	public boolean ClicarRadioNewsLetter() {
		return super.ClicarElemento(LocalizaPor.Xpath, TelaCadastroUsuarioMap.CheckBoxNewsLetter.toString());
	}
	
	public boolean ClicarRadioOfertasEspeciais() {
		return super.ClicarElemento(LocalizaPor.Xpath, TelaCadastroUsuarioMap.CheckboxOfertasEspeciais.toString());
	}
	
	public boolean InserirNomePrimeiro(String texto) {
		return super.InserirTexto(LocalizaPor.Xpath, TelaCadastroUsuarioMap.TextBoxNomePrimeiro.toString(), texto);
	}
	
	public boolean InserirNomeUltimo(String texto) {
		return super.InserirTexto(LocalizaPor.Xpath, TelaCadastroUsuarioMap.TextBoxNomeSegundo.toString(), texto);
	}
	
	public boolean InserirEmpresaNome(String texto) {
		return super.InserirTexto(LocalizaPor.Xpath, TelaCadastroUsuarioMap.TextBoxEmpresaNome.toString(), texto);
	}
	
	public boolean InserirEmpresaEndereco1(String texto) {
		return super.InserirTexto(LocalizaPor.Xpath, TelaCadastroUsuarioMap.TextBoxEmpresaEndereco1.toString(), texto);
	}
	
	public boolean InserirEmpresaEndereco2(String texto) {
		return super.InserirTexto(LocalizaPor.Xpath, TelaCadastroUsuarioMap.TextBoxEmpresaEndereco2.toString(), texto);
	}
	
	public boolean SelecionarPais(String texto) {
		return super.InserirTexto(LocalizaPor.Xpath, TelaCadastroUsuarioMap.ComboBoxPais.toString(), texto);
	}
	
	public boolean InserirUF(String texto) {
		return super.InserirTexto(LocalizaPor.Xpath, TelaCadastroUsuarioMap.TextBoxUF.toString(), texto);
	}
	
	public boolean InserirCidade(String texto) {
		return super.InserirTexto(LocalizaPor.Xpath, TelaCadastroUsuarioMap.TextBoxCidade.toString(), texto);
	}
	
	public boolean InserirCEP(String texto) {
		return super.InserirTexto(LocalizaPor.Xpath, TelaCadastroUsuarioMap.TextBoxCEP.toString(), texto);
	}
	
	public boolean InserirCelular(String texto) {
		return super.InserirTexto(LocalizaPor.Xpath, TelaCadastroUsuarioMap.TextBoxTelefoneCelular.toString(), texto);
	}
	
	public boolean ClicarBotaoCriarConta() {
		return super.ClicarBotao(LocalizaPor.Xpath, TelaCadastroUsuarioMap.BotaoCriarConta.toString());
	}
	
	public boolean ClicarBotaoContinuar() {
		return super.ClicarBotao(LocalizaPor.Xpath, TelaCadastroUsuarioMap.BotaoContinuar.toString());
	}
}
