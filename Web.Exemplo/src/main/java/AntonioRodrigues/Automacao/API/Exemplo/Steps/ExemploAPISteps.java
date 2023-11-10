package AntonioRodrigues.Automacao.API.Exemplo.Steps;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import com.github.javafaker.Faker;

import AntonioRodrigues.Automacao.Evidencias.PDF.EvidenciaPDF;
import AntonioRodrigues.Automacao.Logs.Log;
import AntonioRodrigues.Automacao.Web.Exemplo.ExecuteCucumber;
import AntonioRodrigues.Automacao.Web.Exemplo.Util.FabricaEntidades;
import AntonioRodrigues.Automacao.Web.Exemplo.Util.RegistroEvidencia;
import AntonioRodrigues.Automacao.Web.Exemplo.Util.ResumoEvidencia;
import cucumber.annotation.pt.*;
import cucumber.table.DataTable;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ExemploAPISteps {
	private int StatusRequisicao;
	private String ResponseRequisicao;

	@Quando("^acesso o endpoint via POST$")
	public void acesso_o_endpoint_via_POST(DataTable arg1) {
        String parametro = "exemplo", nome, profissao, uri;
        nome = Faker.instance().name().name();
        profissao = Faker.instance().job().title();
        uri = arg1.raw().get(1).get(0);

        String requestBody = String.format("{ \"name\": \"%s\", \"job\": \"%s\" }", nome, profissao);

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post(uri);

        this.StatusRequisicao = response.getStatusCode();

        this.ResponseRequisicao = response.getBody().asString();
	}
	

	@Entao("^verifico se a resquisicao POST foi bem sucedida$")
	public void verifico_se_a_resquisicao_POST_foi_bem_sucedida() {
		assertEquals(201, this.StatusRequisicao);
	}

	@Quando("^acesso o endpoint via GET$")
	public void acesso_o_endpoint_via_GET(DataTable arg1) {
		
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .get(arg1.raw().get(1).get(0));

        this.StatusRequisicao = response.getStatusCode();

        this.ResponseRequisicao = response.getBody().asString();
	}

	@Entao("^verifico se a resquisicao GET foi bem sucedida$")
	public void verifico_se_a_resquisicao_GET_foi_bem_sucedida() {
		assertEquals(200, this.StatusRequisicao);
	}
	

	@Quando("^acesso o endpoint via PATCH$")
	public void acesso_o_endpoint_via_PATCH(DataTable arg1) {
        String parametro = "exemplo", nome, profissao;
        nome = Faker.instance().name().name();
        profissao = Faker.instance().job().title();        

        String requestBody = String.format("{ \"name\": \"%s\", \"job\": \"%s\" }", nome, profissao);

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .patch(arg1.raw().get(1).get(0));

        this.StatusRequisicao = response.getStatusCode();

        this.ResponseRequisicao = response.getBody().asString();
	}
	
	@Entao("^verifico se a resquisicao PATCH foi bem sucedida$")
	public void verifico_se_a_resquisicao_PATCH_foi_bem_sucedida() {
		assertEquals(200, this.StatusRequisicao);
	}
}
