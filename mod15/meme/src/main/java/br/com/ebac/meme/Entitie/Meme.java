package br.com.ebac.meme.Entitie;

import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.sql.Date;

@Data
@Slf4j
@Entity
public class Meme {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_meme")
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_cadastro")
    private Date dataCadastro;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "usuario")
    private String usuario;

    public Meme() {
    }
}