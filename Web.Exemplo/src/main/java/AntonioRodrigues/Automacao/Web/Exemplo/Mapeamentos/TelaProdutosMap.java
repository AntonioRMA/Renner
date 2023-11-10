package AntonioRodrigues.Automacao.Web.Exemplo.Mapeamentos;

public enum TelaProdutosMap {
	TextBoxPesquisaProduto("//input[@id='search_product']"),
	BotaoPesquisarProduto("//button[@id='submit_search']"),
	BotaoAdicionarAoCarrinho("//a[@class='btn btn-default add-to-cart']"),
	TextoDescricaoProduto("//div[@class='productinfo text-center']/p"),
	BotaoFecharModalConfirmacao("//button[@data-dismiss='modal']");

    private String _mapeamento;
    
    TelaProdutosMap(String map) {
        this._mapeamento = map;
    }

    @Override
    public String toString(){
        return _mapeamento;
    }
}
