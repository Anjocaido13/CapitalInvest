package com.example.CapitalInvest.Repository;

import com.example.CapitalInvest.Entity.RendaFixa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RendaFixaRepository extends JpaRepository<RendaFixa, Long> {

}
