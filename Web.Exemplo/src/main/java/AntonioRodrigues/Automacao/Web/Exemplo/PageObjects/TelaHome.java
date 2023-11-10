package AntonioRodrigues.Automacao.Web.Exemplo.PageObjects;

import AntonioRodrigues.Automacao.Web.Core.LocalizaPor;
import AntonioRodrigues.Automacao.Web.Exemplo.Base.TelaBase;
import AntonioRodrigues.Automacao.Web.Exemplo.Mapeamentos.TelaHomeMap;

@SuppressWarnings("static-access")
public class TelaHome extends TelaBase {
	public boolean ConsultarExistenciaTela() throws Exception {
		boolean retorno = false;

		retorno |= super.ConsultarExistenciaTela(LocalizaPor.Xpath, TelaHomeMap.BotaoCarrinho.toString());
		retorno |= super.ConsultarExistenciaTela(LocalizaPor.Xpath, TelaHomeMap.BotaoHome.toString());
		
		return retorno;
	}
	
	public boolean ClicarMenuProdutos() {
		return super.ClicarBotao(LocalizaPor.Xpath, TelaHomeMap.BotaoProdutos.toString());
	}
	
	public boolean ClicarMenuLogin() {
		return super.ClicarBotao(LocalizaPor.Xpath, TelaHomeMap.BotaoLogin.toString());
	}
	
	public boolean ClicarMenuCarrinho() {
		return super.ClicarBotao(LocalizaPor.Xpath, TelaHomeMap.BotaoCarrinho.toString());
	}
}
