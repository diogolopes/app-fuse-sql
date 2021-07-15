package br.com.redhat.model;

import java.io.Serializable;
import java.util.List;

public class Request implements Serializable {

	private List<PessoaJuridica> pessoaJuridica;
	// private PessoaJuridica pessoaJuridica;

	public List<PessoaJuridica> getPessoaJuridica() {
		return pessoaJuridica;
	}

	public void setPessoaJuridica(List<PessoaJuridica> pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

}
