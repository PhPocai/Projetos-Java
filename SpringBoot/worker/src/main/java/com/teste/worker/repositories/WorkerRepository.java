package com.teste.worker.repositories;

import com.teste.worker.entities.Departament;
import com.teste.worker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Long> {
}
