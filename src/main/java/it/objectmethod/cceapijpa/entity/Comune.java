package it.objectmethod.cceapijpa.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "comune")
public class Comune {

	@Column(name = "istat")
	private int istat;
	@Column(name = "nome")
	private String nome;
	@Column(name = "provincia")
	private String provincia;
	@Column(name = "regione")
	private String regione;
	@Column(name = "prefisso")
	private int prefisso;
	@Column(name = "cap")
	private String cap;
	@Column(name = "cod_fisco")
	private String codFisco;
	@Column(name = "abitanti")
	private int abitanti;
	@Column(name = "link")
	private String link;

	public int getIstat() {
		return istat;
	}

	public void setIstat(int istat) {
		this.istat = istat;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public int getPrefisso() {
		return prefisso;
	}

	public void setPrefisso(int prefisso) {
		this.prefisso = prefisso;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getCodFisco() {
		return codFisco;
	}

	public void setCodFisco(String codFisco) {
		this.codFisco = codFisco;
	}

	public int getAbitanti() {
		return abitanti;
	}

	public void setAbitanti(int abitanti) {
		this.abitanti = abitanti;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "Comune [istat=" + istat + ", nome=" + nome + ", provincia=" + provincia + ", regione=" + regione
				+ ", prefisso=" + prefisso + ", cap=" + cap + ", codFisco=" + codFisco + ", abitanti=" + abitanti
				+ ", link=" + link + "]";
	}
}
