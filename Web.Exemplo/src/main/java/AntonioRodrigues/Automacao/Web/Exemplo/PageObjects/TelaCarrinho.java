package AntonioRodrigues.Automacao.Web.Exemplo.PageObjects;

import java.util.List;

import AntonioRodrigues.Automacao.Web.Core.LocalizaPor;
import AntonioRodrigues.Automacao.Web.Core.TeclasEspeciais;
import AntonioRodrigues.Automacao.Web.Exemplo.Base.TelaBase;
import AntonioRodrigues.Automacao.Web.Exemplo.Mapeamentos.TelaCarrinhoMap;

public class TelaCarrinho extends TelaBase {
	public boolean ConsultarExistenciaTela() throws Exception {		
		return super.ConsultarExistenciaTela(LocalizaPor.Xpath, TelaCarrinhoMap.BotaoFinalizarCompra.toString());
	}
	
	public List<List<String>> ListarResumoCompra() {
		return super.ObterLinhasTabela(LocalizaPor.Xpath, TelaCarrinhoMap.LinhasResumoCarrinho.toString());
	}
}
