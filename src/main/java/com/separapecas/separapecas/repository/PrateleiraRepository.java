package com.separapecas.separapecas.repository;

import com.separapecas.separapecas.model.Prateleira;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrateleiraRepository extends JpaRepository<Prateleira, Integer> {
}
