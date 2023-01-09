package Projeto;

public class Municipio {

	private String nome, macroregiao, cep;
	private int casos = 0, ativos = 0, curados = 0, obitos = 0, descartados = 0, suspeitos = 0;
	Macroregiao macr;

	private void setNome(String nome) {
		this.nome = nome;
	}

	public void atualizaNome(String nome) {
		setNome(nome);
	}

	private void setMacro(String macroregiao) {
		this.macroregiao = macroregiao;
	}

	public void atualizaMacro(String macro) {
		setMacro(macro);
	}

	private void setCep(String cep) {
		this.cep = cep;
	}

	public void atualizaCep(String cep) {
		setCep(cep);
	}

	private void setCasos(int casos) {
		this.casos = casos;
	}

	public void atualizaCasos(int casos) {
		setCasos(casos);
	}

	private void setAtivos(int ativos) {
		this.ativos = ativos;
	}

	public void atualizaAtivos(int ativos) {
		setAtivos(ativos);
	}

	private void setCurados(int curados) {
		this.curados = curados;
	}

	public void atualizaCurados(int curados) {
		setCurados(curados);
	}

	private void setDescartados(int descartados) {
		this.descartados = descartados;
	}

	public void atualizaDescartados(int descartados) {
		setDescartados(descartados);
	}

	private void setSuspeitos(int suspeitos) {
		this.suspeitos = suspeitos;
	}

	public void atualizaSuspeitos(int suspeitos) {
		setSuspeitos(suspeitos);
	}

	private void setObitos(int obitos) {
		this.obitos = obitos;
	}

	public void atualizaObitos(int obitos) {
		setObitos(obitos);
	}

	public void setMacr(Macroregiao macr) {
		this.macr = macr;
	}

	private String getNome() {
		return nome;
	}

	public String exibirNome() {
		return getNome();
	}

	private String getMacro() {
		return macroregiao;
	}

	public String exibirMacro() {
		return getMacro();
	}

	private String getCep() {
		return cep;
	}

	public String exibirCep() {
		return getCep();
	}

	public int getCasos() {
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

	public Macroregiao getCasinho() {
		return macr;
	}
	
	//Metodo cadastrar do municipio
    public void Cadastro(String nome, String cep, String macroregiao, int casos, int ativos, int curados, int obitos, int descartados, int suspeitos){
    	this.nome = nome;
    	this.cep = cep;
    	this.macroregiao = macroregiao;
    	this.casos = casos;
    	this.ativos = ativos;
    	this.curados = curados;
    	this.obitos = obitos;
    	this.descartados = descartados;
    	this.suspeitos = suspeitos;
    	
    }

}
