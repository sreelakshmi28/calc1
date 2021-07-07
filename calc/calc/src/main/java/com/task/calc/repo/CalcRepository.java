package com.task.calc.repo;

import com.task.calc.entity.Calculator;
import org.springframework.data.repository.CrudRepository;

public interface CalcRepository extends CrudRepository<Calculator,Long> {
}
