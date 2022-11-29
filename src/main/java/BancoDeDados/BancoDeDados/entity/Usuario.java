package BancoDeDados.BancoDeDados.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Date dataNasc;
    private String email;
    private String password;
    private Integer cpf;
    private Integer rg;
    private String nomeMae;

    private Usuario(){

    }


    public Usuario(Long id, String nome, Date dataNasc, String email, String password, Integer cpf, Integer rg, String nomeMae) {
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.rg = rg;
        this.nomeMae = nomeMae;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
}
