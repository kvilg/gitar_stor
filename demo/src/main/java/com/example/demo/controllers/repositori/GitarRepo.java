package com.example.demo.controllers.repositori;

import com.example.demo.model.Gitar;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GitarRepo extends CrudRepository<Gitar, Long> {

    List<Gitar> findByName(String name);


}
