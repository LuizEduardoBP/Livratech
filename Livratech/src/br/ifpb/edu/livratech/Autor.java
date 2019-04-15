package br.ifpb.edu.livratech;


public class Autor {
	private Integer idAutor;
	private String nomeAutor;
	
	public Integer getIdAutor() {
		return idAutor; 
	}
	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAutor == null) ? 0 : idAutor.hashCode());
		result = prime * result + ((nomeAutor == null) ? 0 : nomeAutor.hashCode());
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
		Autor other = (Autor) obj;
		if (idAutor == null) {
			if (other.idAutor != null)
				return false;
		} else if (!idAutor.equals(other.idAutor))
			return false;
		if (nomeAutor == null) {
			if (other.nomeAutor != null)
				return false;
		} else if (!nomeAutor.equals(other.nomeAutor))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Autor [idAutor=" + idAutor + ", nomeAutor=" + nomeAutor + "]";
	}
	public Autor(Integer idAutor, String nomeAutor) {
		super();
		this.idAutor = idAutor;
		this.nomeAutor = nomeAutor;
	}
	
	
	
}