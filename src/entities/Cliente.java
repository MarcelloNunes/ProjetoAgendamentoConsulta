package entities;

public class Cliente {
	private String nome;
	private String cpf;
	private String numero;
	private String descriaçaoDoCaso;
	private Boolean deficiencia;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescriaçaoDoCaso() {
		return descriaçaoDoCaso;
	}
	public void setDescriaçaoDoCaso(String descriaçaoDoCaso) {
		this.descriaçaoDoCaso = descriaçaoDoCaso;
	}
	public Boolean getDeficiencia() {
		return deficiencia;
	}
	public void setDeficiencia(Boolean deficiencia) {
		this.deficiencia = deficiencia;
	}
	
}
