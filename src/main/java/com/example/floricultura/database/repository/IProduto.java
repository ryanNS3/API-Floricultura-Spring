package com.example.floricultura.database.repository;

import com.example.floricultura.database.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProduto extends JpaRepository<Produto, String> {

}
