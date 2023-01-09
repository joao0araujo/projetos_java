package Projeto;

public class Macroregiao {

	private String macroregiao;
	private int casos = 0, ativos = 0, curados = 0, descartados = 0, suspeitos = 0, obitos = 0;
	Municipio munici;

	private void setMacroregiao(String macroregiao) {
		this.macroregiao = macroregiao;
	}

	public void atualizaMacroregiao(String macroregiao) {
		setMacroregiao(macroregiao);
	}

	private void setCasos(int casos) {
		this.casos += casos;
	}

	public void atualizaCasos(int casos) {
		setCasos(casos);
	}

	private void setAtivos(int ativos) {
		this.ativos += ativos;
	}

	public void atualizaAtivos(int ativos) {
		setAtivos(ativos);
	}

	private void setCurados(int curados) {
		this.curados += curados;
	}

	public void atualizaCurados(int curados) {
		setCurados(curados);
	}
	
	private void setObitos(int obitos) {
		this.obitos += obitos;
	}
	
	public void atualizaObitos(int obitos) {
		setObitos(obitos);
	}
	
	private void setDescartados(int descartados) {
		this.descartados += descartados;
	}

	public void atualizaDescartados(int descartados) {
		setDescartados(descartados);
	}

	private void setSuspeitos(int suspeitos) {
		this.suspeitos += suspeitos;
	}

	public void atualizaSuspeitos(int suspeitos) {
		setSuspeitos(suspeitos);
	}
	
	public void setMunici(Municipio munici) {
		this.munici = munici;
	}

	private String getMacroregiao() {
		return macroregiao;
	}

	public String exibirMacroregiao() {
		return getMacroregiao();
	}

	private int getCasos() {
		return casos;
	}

	public int exibirCasos() {
		return getCasos();
	}

	private int getAtivos() {
		return ativos;
	}

	public int exibirAtivos() {
		return getAtivos();
	}

	private int getCurados() {
		return curados;
	}

	public int exibirCurados() {
		return getCurados();
	}

	private int getDescartados() {
		return descartados;
	}

	public int exibirDescartados() {
		return getDescartados();
	}

	private int getSuspeitos() {
		return suspeitos;
	}

	public int exibirSuspeitos() {
		return getSuspeitos();
	}

	private int getObitos() {
		return obitos;
	}

	public int exibirObitos() {
		return getObitos();
	}

	public Municipio getMunici() {
		return munici;
	}
	
	//Metodo cadastrar da macroregiao
	public void CadastroCasos(int casos, int ativos, int curados, int obitos, int descartados, int suspeitos, Municipio munici){
	    	this.casos += casos;
	    	this.ativos += ativos;
	    	this.curados += curados;
	    	this.obitos += obitos;
	    	this.descartados += descartados;
	    	this.suspeitos += suspeitos;
	    	this.munici = munici;
	}

}
