package com.example.floricultura.database.model;

// IMPORTANTE: Os imports corretos vêm do jakarta.persistence
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data; // Se quiser usar o Lombok para gerar getters/setters automaticamente

@Entity
@Table(name = "produtos") // Define o nome da tabela que será criada no SQL Server
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremento para o SQL Server
    private Long id;

    private String nome;
    private Double preco;
    private Integer quantidade;
}