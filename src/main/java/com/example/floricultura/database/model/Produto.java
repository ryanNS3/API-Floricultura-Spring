package com.example.floricultura.database.model;

// IMPORTANTE: Os imports corretos vêm do jakarta.persistence
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Produto") // Define o nome da tabela que será criada no SQL Server
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Double preco;
    @Column(nullable = false)
    private Integer qtd_estoque;
    @Column(nullable = false)
    private String imagem;
}