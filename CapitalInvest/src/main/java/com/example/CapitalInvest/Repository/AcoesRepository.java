package com.example.CapitalInvest.Repository;


import com.example.CapitalInvest.Entity.Acoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcoesRepository extends JpaRepository<Acoes, Long> {
}
