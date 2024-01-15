package br.com.devleonzera.tasky.entity;

import jakarta.persistence.*;
import java.time.LocalDate; // Importe a classe LocalDate

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private String tipo;
    private boolean ativo;
    private LocalDate dataContrato;

    private int diaVencimento;
    private boolean mensalista;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public boolean isMensalista() {
        return mensalista;
    }

    public void setMensalista(boolean mensalista) {
        this.mensalista = mensalista;
    }
}
