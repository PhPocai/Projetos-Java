package com.teste.worker.repositories;

import com.teste.worker.entities.Departament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepsitory extends JpaRepository<Departament,Long> {

}
