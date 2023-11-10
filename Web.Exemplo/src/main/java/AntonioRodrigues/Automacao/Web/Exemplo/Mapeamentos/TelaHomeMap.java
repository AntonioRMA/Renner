package AntonioRodrigues.Automacao.Web.Exemplo.Mapeamentos;

public enum TelaHomeMap {
	BotaoLogin("//a[@href='/login']"),
	BotaoHome("//a[@href='/']"),
	BotaoProdutos("//a[@href='/products']"),
	BotaoPesquisar("//button[@id='search-icon-legacy']"),
	BotaoCarrinho("//a[@href='/view_cart']");
	
	
    private String _mapeamento;
    
    TelaHomeMap(String map) {
        this._mapeamento = map;
    }

    @Override
    public String toString(){
        return _mapeamento;
    }
}
