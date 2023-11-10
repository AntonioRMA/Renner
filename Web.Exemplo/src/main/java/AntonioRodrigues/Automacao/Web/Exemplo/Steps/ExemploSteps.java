package AntonioRodrigues.Automacao.Web.Exemplo.Steps;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;

import com.github.javafaker.Faker;

import AntonioRodrigues.Automacao.Web.Exemplo.PageObjects.*;
import AntonioRodrigues.Automacao.Web.Exemplo.Util.FabricaEntidades;
import AntonioRodrigues.Automacao.Web.Exemplo.Util.RegistroEvidencia;
import AntonioRodrigues.Automacao.Web.Exemplo.Util.ResumoEvidencia;
import AntonioRodrigues.Automacao.Evidencias.PDF.EvidenciaPDF;
import AntonioRodrigues.Automacao.Logs.Log;
import AntonioRodrigues.Automacao.Web.Exemplo.ExecuteCucumber;
import AntonioRodrigues.Automacao.Web.Exemplo.Entidades.*;

import cucumber.annotation.pt.*;
import cucumber.table.DataTable;

import gherkin.formatter.model.DataTableRow;

@SuppressWarnings("static-access")
public class ExemploSteps {
	private DataTable ProdutosSelecionados;
	private TelaHome TelaHome = new TelaHome();
	private TelaLogin TelaLogin = new TelaLogin();
	private TelaProdutos TelaProdutos = new TelaProdutos(); 
	private TelaCarrinho TelaCarrinho = new TelaCarrinho();
	private TelaCadastroUsuario TelaCadastroUsuario = new TelaCadastroUsuario();
	private AutomacaoEntidade AutomacaoEntidade = FabricaEntidades.ObterAutomacaoEntidade();
	
	@Dado("^Que configuro o documento de evidencia da execucao$")
	public void Que_configuro_o_documento_de_evidencia_da_execucao(DataTable dataTable) throws Exception {
		try {
			if(null != dataTable){
				ResumoEvidencia resumoEvidencia = new ResumoEvidencia(dataTable.raw());

				Log.DefinirLocalAquivoLog(new ExecuteCucumber().LocalExecucaoLog);
				Log.LogarInfo("Dado Que configuro o documento de evidencia da execucao");

				RegistroEvidencia.Evidencia = new EvidenciaPDF(resumoEvidencia.EvidenciaCaminho, resumoEvidencia.EvidenciaNomeArquivo);
				RegistroEvidencia.Evidencia.Cabecalho = resumoEvidencia.ObterCabecalho();
				RegistroEvidencia.Evidencia.Resumo = resumoEvidencia.ObterResumo();
				RegistroEvidencia.Evidencia.Resumo.Ambiente = "Firefox";

				RegistroEvidencia.InserirMassa("URL", FabricaEntidades.ObterHostExecucaoFirefox().Url);
				RegistroEvidencia.InserirMassa("Parâmetro pesquisa canal", this.AutomacaoEntidade.ParametroConsultaCanal);
			}
		}
		catch(Exception ex){
			this.TelaHome.MensagemErro = ex.toString();
			RegistroEvidencia.RegistrarFalhaExecucao("Falha na execucao", this.TelaHome.MensagemErro, this.TelaHome.CapturarPrint());
			this.TelaHome.FecharAplicacao();
			Assert.fail(this.TelaHome.MensagemErro);
			throw new Exception(ex.toString()); 
		}
	}

	@Dado("^que acessei o portal de teste com usuário deslogado$")
	public void que_acessei_o_portal_de_teste_com_usuário_deslogado() {
		try{
			this.TelaHome.ConsultarExistenciaTela();
			RegistroEvidencia.InserirPrintEvidenciaInfo(this.TelaHome.CapturarPrint(), "Tela Home");
		}
		catch(Exception ex){
			this.TelaHome.RegistrarFalhaExecucao(ex.toString());							
			Assert.fail(ex.toString());
		}
	}

	@Quando("^realizo o login do usuario$")
	public void realizo_o_login_do_usuario(DataTable dataTable) {
		try{
			this.TelaHome.ConsultarExistenciaTela();
			this.TelaHome.ClicarMenuLogin();						
			
			this.TelaLogin.InserirTextoLoginEmail(dataTable.getGherkinRows().get(1).getCells().get(0));
			this.TelaLogin.InserirTextoLoginSenha(dataTable.getGherkinRows().get(1).getCells().get(1));
			
			RegistroEvidencia.InserirPrintEvidenciaInfo(this.TelaLogin.CapturarPrint(), "Tela Login");
			
			this.TelaLogin.ClicarBotaoLogin();
		}
		catch(Exception ex){
			this.TelaLogin.RegistrarFalhaExecucao(ex.toString());							
			Assert.fail(ex.toString());
		}
	}

	@Quando("^realizo o cadastro de um novo usuario$")
	public void realizo_o_cadastro_de_um_novo_usuario() {       
		Faker faker = new Faker();

		try{
			this.TelaHome.ConsultarExistenciaTela();
			this.TelaHome.ClicarMenuLogin();						

			this.TelaLogin.InserirTextoCadastroNomeUsuario(faker.harryPotter().character());
			this.TelaLogin.InserirTextoCadastroEmail(faker.internet().emailAddress());
			
			RegistroEvidencia.InserirPrintEvidenciaInfo(this.TelaLogin.CapturarPrint(), "Tela Login");
			
			this.TelaLogin.ClicarBotaoCadastrar();

			this.TelaCadastroUsuario.RolarParaBaixo();
			this.TelaCadastroUsuario.ValidarExistenciaTela();			
			this.TelaCadastroUsuario.SelecionarRadioTitulo();		
			this.TelaCadastroUsuario.RolarParaBaixo();	
			this.TelaCadastroUsuario.InserirSenha("102030");
			this.TelaCadastroUsuario.DefinirDataAniversarioDia();
			this.TelaCadastroUsuario.DefinirDataAniversarioMes();
			this.TelaCadastroUsuario.DefinirDataAniversarioAno();
			this.TelaCadastroUsuario.ClicarRadioNewsLetter();
			this.TelaCadastroUsuario.ClicarRadioOfertasEspeciais();
			this.TelaCadastroUsuario.InserirNomePrimeiro(faker.name().firstName());
			this.TelaCadastroUsuario.InserirNomeUltimo(faker.name().lastName());
			this.TelaCadastroUsuario.InserirEmpresaNome(faker.company().name());
			this.TelaCadastroUsuario.InserirEmpresaEndereco1(faker.address().fullAddress());
			this.TelaCadastroUsuario.InserirEmpresaEndereco2(faker.address().secondaryAddress());
//			this.TelaCadastroUsuario.SelecionarPais("India");
			this.TelaCadastroUsuario.InserirUF(faker.address().state());
			this.TelaCadastroUsuario.InserirCidade(faker.address().city());
			this.TelaCadastroUsuario.InserirCEP(faker.address().zipCode());
			this.TelaCadastroUsuario.InserirCelular(faker.phoneNumber().cellPhone());
			this.TelaCadastroUsuario.RolarParaBaixo();
			this.TelaCadastroUsuario.ClicarBotaoCriarConta();	
			this.TelaCadastroUsuario.ClicarBotaoContinuar();
		}
		catch(Exception ex){
			this.TelaLogin.RegistrarFalhaExecucao(ex.toString());							
			Assert.fail(ex.toString());
		}
	}

	@Quando("^acesso a tela de produtos$")
	public void acesso_a_tela_de_produtos() {
		try{
			this.TelaHome.ConsultarExistenciaTela();
			this.TelaHome.ClicarMenuProdutos();
			
			RegistroEvidencia.InserirPrintEvidenciaInfo(this.TelaHome.CapturarPrint(), "Tela de Produtos");
		}
		catch(Exception ex){
			this.TelaHome.RegistrarFalhaExecucao(ex.toString());							
			Assert.fail(ex.toString());
		} 
	}

	@Quando("^insiro os produtos no carrinho com suas quantidades$")
	public void insiro_os_produtos_no_carrinho_com_suas_quantidades(DataTable dataTable) {
		this.ProdutosSelecionados = dataTable;
		
		try{
			String confirmacaoDescricaoProduto, produtoDescricao;
			int produtoQuantidade;
			
			this.TelaProdutos.ConsultarExistenciaTela();

			for(int i = 1; i < dataTable.getGherkinRows().size(); i++) {
				produtoDescricao = dataTable.getGherkinRows().get(i).getCells().get(0);
				produtoQuantidade = Integer.parseInt(dataTable.getGherkinRows().get(i).getCells().get(1));
				
				this.TelaProdutos.InserirTextoPesquisaProduto(produtoDescricao.trim());
				this.TelaProdutos.ClicarBotaoPesquisarProduto();
				
				confirmacaoDescricaoProduto = this.TelaProdutos.ObterTextoProdutoPesquisado();
				
				if(null != confirmacaoDescricaoProduto && confirmacaoDescricaoProduto.contains(produtoDescricao)) {
					for(int j = 0; j < produtoQuantidade;  j++) {
						this.TelaProdutos.RolarParaBaixo();
						this.TelaProdutos.ClicarBotaoAdicionarAoCarrinho();
						this.TelaProdutos.ClicarBotaoFecharModalConfirmacao();
						this.TelaProdutos.ClicarBotaoPesquisarProduto();
					}
				}
				
				RegistroEvidencia.InserirPrintEvidenciaInfo(this.TelaProdutos.CapturarPrint(), "Tela de produtos");
			}
		}
		catch(Exception ex){
			this.TelaProdutos.RegistrarFalhaExecucao(ex.toString());							
			Assert.fail(ex.toString());
		}
	}

	@Entao("^Verifico se os produtos foram incluidos no carrinho$")
	public void Verifico_se_os_produtos_foram_incluidos_no_carrinho() {
		String produtoDescricao, produtoQuantidade, resumoCompraQuantidade;
		
		try{
			this.TelaHome.ClicarMenuCarrinho();
			
			this.TelaCarrinho.ConsultarExistenciaTela();
			
			List<List<String>> listaResumoCompra = this.TelaCarrinho.ListarResumoCompra();
			

			for(int i = 1; i < this.ProdutosSelecionados.getGherkinRows().size(); i++) {
				produtoDescricao = this.ProdutosSelecionados.getGherkinRows().get(i).getCells().get(0);
				produtoQuantidade = this.ProdutosSelecionados.getGherkinRows().get(i).getCells().get(1);
				
				resumoCompraQuantidade = ObterQuantidadeProdutoResumoCompra(produtoDescricao, listaResumoCompra);
				
				assertEquals(produtoQuantidade, produtoQuantidade);
			}
			
			
			RegistroEvidencia.InserirPrintEvidenciaInfo(this.TelaCarrinho.CapturarPrint(), "Validando produtos inseridos no carrinho");
			
//			assertEquals(this.AutomacaoEntidade.ParametroConsultaCanal, this.TelaListaCanais.ObterTextoCanalFiltrado());
			
			RegistroEvidencia.GravarDocumentoEvidencia();
			
			this.TelaCarrinho.FecharAplicacao();
		}
		catch(Exception ex){
			this.TelaCarrinho.RegistrarFalhaExecucao(ex.toString());							
			Assert.fail(ex.toString());
		}
	}
	
	private String ObterQuantidadeProdutoResumoCompra(String descricaoProduto, List<List<String>> listaResumoCompra) {
		String retorno = null;
		
		for(List<String> produtos : listaResumoCompra)
			if(produtos.get(0).contains(descricaoProduto)) {
				retorno = produtos.get(2);
				break;
			}
		
		return retorno;
	}
}
