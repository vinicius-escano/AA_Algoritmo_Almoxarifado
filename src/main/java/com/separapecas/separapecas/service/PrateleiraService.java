package com.separapecas.separapecas.service;

import com.separapecas.separapecas.model.Prateleira;
import com.separapecas.separapecas.repository.PrateleiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrateleiraService {

    @Autowired
    PrateleiraRepository prateleiraRepository;

    public List<Prateleira> findAll(){
        return prateleiraRepository.findAll();
    }
}
