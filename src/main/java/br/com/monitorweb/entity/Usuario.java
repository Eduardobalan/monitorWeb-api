package br.com.monitorweb.entity;

import br.com.monitorweb.entity.generic.GenericEntity;
import br.com.monitorweb.enumeration.EnumSexo;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by Eduardo Balan on 21/06/2017.
 */

@Entity
@Table(name = "TB_USUARIO" , schema = "PUBLIC")
public class Usuario extends GenericEntity<Long>{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "usu_id")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "usu_dthr_cadastro")
    private Date dtHrCadastro;

    @Column(name = "usu_nome")
    private String nome;

    @Column(name = "usu_sobrenome")
    private String sobrenome;

    @Column(name = "usu_login")
    private String login;

    @Column(name = "usu_email")
    private String email;

    @Column(name = "usu_senha")
    private String senha;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "usu_sexo", length = 20,  nullable = false)
    private EnumSexo sexo;

    @Column(name = "usu_telefone")
    private String telefone;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Date getDtHrCadastro() {
        return dtHrCadastro;
    }

    public void setDtHrCadastro(Date dtHrCadastro) {
        this.dtHrCadastro = dtHrCadastro;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public EnumSexo getSexo() {
        return sexo;
    }

    public void setSexo(EnumSexo sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
