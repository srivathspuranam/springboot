package com.bean.mod;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ERepository extends CrudRepository<Employees, Integer> {
}
