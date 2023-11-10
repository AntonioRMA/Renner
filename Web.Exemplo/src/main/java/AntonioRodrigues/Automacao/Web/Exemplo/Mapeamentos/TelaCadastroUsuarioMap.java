package AntonioRodrigues.Automacao.Web.Exemplo.Mapeamentos;

public enum TelaCadastroUsuarioMap {
	RadioTitulo("//input[@value='Mr']"),
	TextBoxSenha("//input[@data-qa='password']"),
	ComboBoxDataNascimentoDia("//select[@data-qa='days']/option[@value='21']"),
	ComboBoxDataNascimentoMes("//select[@data-qa='months']/option[@value='11']"),
	ComboBoxDataNascimentoAno("//select[@data-qa='years']/option[@value='1981']"),
	CheckBoxNewsLetter("//input[@name='newsletter']"),
	CheckboxOfertasEspeciais("//input[@name='optin']"),
	TextBoxNomePrimeiro("//input[@data-qa='first_name']"),
	TextBoxNomeSegundo("//input[@data-qa='last_name']"),
	TextBoxEmpresaNome("//input[@data-qa='company']"),
	TextBoxEmpresaEndereco1("//input[@data-qa='address']"),
	TextBoxEmpresaEndereco2("//input[@data-qa='address2']"),
	ComboBoxPais("//select[@data-qa='country']"),
	TextBoxUF("//input[@name='state']"),
	TextBoxCidade("//input[@name='city']"),
	TextBoxCEP("//input[@name='zipcode']"),
	TextBoxTelefoneCelular("//input[@name='mobile_number']"),
	BotaoCriarConta("//button[@data-qa='create-account']"),
	BotaoContinuar("//a[@data-qa='continue-button']");
	
    private String _mapeamento;
    
    TelaCadastroUsuarioMap(String map) {
        this._mapeamento = map;
    }

    @Override
    public String toString(){
        return _mapeamento;
    }
}
