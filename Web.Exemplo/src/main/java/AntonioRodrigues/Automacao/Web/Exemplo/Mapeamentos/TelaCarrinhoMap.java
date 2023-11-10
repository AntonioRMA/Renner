package AntonioRodrigues.Automacao.Web.Exemplo.Mapeamentos;

public enum TelaCarrinhoMap {
	LinhasResumoCarrinho("//table[@id='cart_info_table']/tbody/tr"),
	BotaoFinalizarCompra("//a[@class='btn btn-default check_out']");
	
    private String _mapeamento;
    
    TelaCarrinhoMap(String map) {
        this._mapeamento = map;
    }

    @Override
    public String toString(){
        return _mapeamento;
    }
}
