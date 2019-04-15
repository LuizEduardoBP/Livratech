package br.ifpb.edu.livratech;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

public class Editora {
	@Id
	private Integer cnpj;
	private String nomeEditora;
	private String Endereco;
	public Integer getCnpj() {
		return cnpj;
	}
	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeEditora() {
		return nomeEditora;
	}
	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Endereco == null) ? 0 : Endereco.hashCode());
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((nomeEditora == null) ? 0 : nomeEditora.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Editora other = (Editora) obj;
		if (Endereco == null) {
			if (other.Endereco != null)
				return false;
		} else if (!Endereco.equals(other.Endereco))
			return false;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (nomeEditora == null) {
			if (other.nomeEditora != null)
				return false;
		} else if (!nomeEditora.equals(other.nomeEditora))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Editora [cnpj=" + cnpj + ", nomeEditora=" + nomeEditora + ", Endereco=" + Endereco + "]";
	}
	public Editora(Integer cnpj, String nomeEditora, String endereco) {
		super();
		this.cnpj = cnpj;
		this.nomeEditora = nomeEditora;
		Endereco = endereco;
	}
}


