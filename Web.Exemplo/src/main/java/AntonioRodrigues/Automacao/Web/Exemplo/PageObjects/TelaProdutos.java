package AntonioRodrigues.Automacao.Web.Exemplo.PageObjects;

import AntonioRodrigues.Automacao.Web.Core.LocalizaPor;
import AntonioRodrigues.Automacao.Web.Exemplo.Base.TelaBase;
import AntonioRodrigues.Automacao.Web.Exemplo.Mapeamentos.TelaProdutosMap;

public class TelaProdutos extends TelaBase {
	public boolean ConsultarExistenciaTela() throws Exception {
		super.AguardarPor(4);
		
		return super.ConsultarExistenciaTela(LocalizaPor.Xpath, TelaProdutosMap.TextBoxPesquisaProduto.toString());
	}
	
	public boolean InserirTextoPesquisaProduto(String texto) {
		return super.InserirTexto(LocalizaPor.Xpath, TelaProdutosMap.TextBoxPesquisaProduto.toString(), texto);
	}

	public boolean ClicarBotaoPesquisarProduto() {
		return super.ClicarBotao(LocalizaPor.Xpath, TelaProdutosMap.BotaoPesquisarProduto.toString());
	}
	
	public String ObterTextoProdutoPesquisado() {
		return super.ObterTexto(LocalizaPor.Xpath, TelaProdutosMap.TextoDescricaoProduto.toString());
	}
	
	public boolean ClicarBotaoAdicionarAoCarrinho() {
		return super.ClicarBotao(LocalizaPor.Xpath, TelaProdutosMap.BotaoAdicionarAoCarrinho.toString());
	}
	
	public boolean ClicarBotaoFecharModalConfirmacao() {
		return super.ClicarBotao(LocalizaPor.Xpath, TelaProdutosMap.BotaoFecharModalConfirmacao.toString());
	}
}
