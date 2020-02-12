package com.example.repo;

import javax.servlet.http.HttpSession;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.UserM;

@Repository
public interface Urepository extends CrudRepository<UserM, String> {

}
