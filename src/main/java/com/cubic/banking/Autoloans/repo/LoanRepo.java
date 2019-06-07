package com.cubic.banking.Autoloans.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cubic.banking.Autoloans.DTO.LoanDTO;

@Repository
public interface LoanRepo extends JpaRepository<LoanDTO, Long> {

}
