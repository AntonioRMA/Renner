package AntonioRodrigues.Automacao.API.Exemplo;

import org.junit.runner.RunWith;

import AntonioRodrigues.Automacao.Web.Exemplo.Util.GerenciadorConfiguracoes;
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "AntonioRodrigues/Automacao/API/Exemplo/Features",
		format = {"pretty", "html:target/cucumber"},
		glue = "AntonioRodrigues.Automacao.API.Exemplo.Steps",
		tags = {"@ValidacaoAPI"}
)

public class ExecuteCucumberAPI {
	public String LocalExecucaoEvidencia;
	public String LocalExecucaoLog;

	public ExecuteCucumberAPI() {
		LocalExecucaoEvidencia = System.getProperty("user.dir").concat(GerenciadorConfiguracoes.ObterConfig("local.evidencias"));
		LocalExecucaoLog = System.getProperty("user.dir").concat(GerenciadorConfiguracoes.ObterConfig("local.evidencias").concat("/Logs"));
	}
}
