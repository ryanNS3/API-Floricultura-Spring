package com.example.floricultura.service;


import com.example.floricultura.database.model.Produto;
import com.example.floricultura.database.repository.IProduto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    private final IProduto produtoRepository;

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Produto createProduct(Produto produto){
        return produtoRepository.save(produto);
    }

    public String deleteProductById( String id){
        return produtoRepository.deleteById(id);
    }

}
