package AntonioRodrigues.Automacao.Web.Exemplo.Util;

import AntonioRodrigues.Automacao.Web.Core.HostExecucao;
import AntonioRodrigues.Automacao.Web.Core.Navegador;
import AntonioRodrigues.Automacao.Web.Exemplo.Entidades.AutomacaoEntidade;
import AntonioRodrigues.Automacao.Web.Exemplo.MassaDados.MassaDados;

public class FabricaEntidades {
	public static AutomacaoEntidade ObterAutomacaoEntidade(){
		AutomacaoEntidade retorno = new AutomacaoEntidade();
		org.json.simple.JSONObject jsonObject = null;
		
		try {
			jsonObject= new MassaDados().ObterJson(System.getProperty("user.dir") + GerenciadorConfiguracoes.ObterConfig("MassaDadosJson"));
		} catch (Exception e) {
			System.out.println(e);
		}

		retorno.ParametroConsultaCanal = (String)jsonObject.get("ParametroConsultaCanal");

		return retorno;
	} 
	
	public static HostExecucao ObterHostExecucaoFirefox(){
		HostExecucao retorno = new HostExecucao();

		retorno.Navegador = Navegador.MozillaFirefox;
		retorno.Url = "https://cas5-0-urlprotect.trendmicro.com/wis/clicktime/v1/query?url=https%3a%2f%2fautomationexercise.com%2fO&umid=1b42c5c2-09cc-4c60-a373-e4ff9fdb6b5f&auth=3cc318718b7241c4bb94e1d2ad66b229d228ca92-0815e2853623be4e20af27433fd01b9c97a32b1b";

		return retorno;
	} 
}
