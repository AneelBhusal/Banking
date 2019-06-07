package com.cubic.banking.Autoloans.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cubic.banking.Autoloans.DTO.VehicleDTO;

@Repository
public interface VehicleRepo extends JpaRepository<VehicleDTO, Long> {

}
