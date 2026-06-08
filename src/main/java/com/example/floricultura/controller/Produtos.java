package com.example.floricultura.controller;

import com.example.floricultura.database.model.Produto;
import com.example.floricultura.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
@RequiredArgsConstructor
public class Produtos {

    private final ProdutoService produtoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> findALL(){
        return produtoService.findAll();
    }

    @PostMapping
    @RequestMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Produto addProduct(@RequestBody Produto produto){
        return produtoService.createProduct(produto);
    }

    @DeleteMapping
    @RequestMapping("/delete")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteProduct(@PathVariable String id){
        return produtoService.deleteProductById(id);
    }
}