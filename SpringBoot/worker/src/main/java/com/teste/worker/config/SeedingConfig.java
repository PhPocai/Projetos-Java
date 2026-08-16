package com.teste.worker.config;

import com.teste.worker.entities.Departament;
import com.teste.worker.entities.HourContract;
import com.teste.worker.entities.Worker;
import com.teste.worker.entities.WorkerLevel;
import com.teste.worker.repositories.DepartmentRepsitory;
import com.teste.worker.repositories.WorkerRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Date;

@Configuration
public class SeedingConfig implements CommandLineRunner {

    @Autowired
    private DepartmentRepsitory departmentRepsitory;

    @Autowired
    private WorkerRepository workerRepository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        Departament dept = new Departament("Design");

        dept = departmentRepsitory.save(dept);

        Worker worker = new Worker("Alex", WorkerLevel.MID, 1200.0, dept);

        worker = workerRepository.save(worker);

        HourContract contract1 = new HourContract(LocalDate.of(2018, 8, 20), 50, 20);
        HourContract contract2 = new HourContract(LocalDate.of(2018, 6, 13), 30, 18);
        HourContract contract3 = new HourContract(LocalDate.of(2018, 8, 25), 80, 10);

        worker.addContract(contract1);
        worker.addContract(contract2);
        worker.addContract(contract3);
    }
}
