package com.analistajunior.cartola.model2;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="professor")
public class Professor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String sobrenome;
	@Column(nullable = false)
	private String dataNasc;
	@Column(nullable = false)
	private String genero;
	@Column(nullable = false)
	private String telefone;
	@Column(nullable = false)
	private String nomeUsuario;
	@Column(nullable = false) 
	private int senha;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String cpf;
	@Column(nullable = false)
	private String rg;
	@Column(nullable = false)
	private String endereco;
	@Column(nullable = false)
	private String bairro;
	@Column(nullable = false)
	private String estado;
	@Column(nullable = false)
	private String cep;
	@Column(nullable = false)
	private String cidade;
	@Column(nullable = false)
	private String nomeAcademia;
	@Column(nullable = false)
	private String siglaAcademia;
	@Column(nullable = false)
	private String ederecoAcademia;
	@OneToMany(mappedBy="turma")
	private List<Turma> turmas;

	public List<Turma> getTurmas() {
		return turmas;
	}
	public void setTurma(List<Turma> turmas) {
		this.turmas = turmas;
	}
	public int getId() {	

		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNomeAcademia() {
		return nomeAcademia;
	}
	public void setNomeAcademia(String nomeAcademia) {
		this.nomeAcademia = nomeAcademia;
	}
	public String getSiglaAcademia() {
		return siglaAcademia;
	}
	public void setSiglaAcademia(String siglaAcademia) {
		this.siglaAcademia = siglaAcademia;
	}
	public String getEderecoAcademia() {
		return ederecoAcademia;
	}
	public void setEderecoAcademia(String ederecoAcademia) {
		this.ederecoAcademia = ederecoAcademia;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Professor other = (Professor) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
