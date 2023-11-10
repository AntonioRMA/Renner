package AntonioRodrigues.Automacao.Web.Exemplo.Mapeamentos;

public enum TelaLoginMap {
	TextBoxLoginEmail("//input[@data-qa='login-email']"),
	TextBoxLoginSenha("//input[@data-qa='login-password']"),
	BotaoLogar("//button[@data-qa='login-button']"),
	TextBoxCadastroEmail("//input[@data-qa='signup-email']"),
	TextBoxCadastroNomeUsuario("//input[@data-qa='signup-name']"),
	BotaoCadastrar("//button[@data-qa='signup-button']");
	
	
    private String _mapeamento;
    
    TelaLoginMap(String map) {
        this._mapeamento = map;
    }

    @Override
    public String toString(){
        return _mapeamento;
    }
}
