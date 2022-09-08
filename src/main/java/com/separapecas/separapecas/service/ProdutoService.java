package com.separapecas.separapecas.service;

import com.separapecas.separapecas.model.Produto;
import com.separapecas.separapecas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    };

    public Produto findById(int codigo){
        return produtoRepository.findById(codigo).get();
    }
}
