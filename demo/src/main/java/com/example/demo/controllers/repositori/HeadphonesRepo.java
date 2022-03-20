package com.example.demo.controllers.repositori;

import com.example.demo.model.Headphones;
import org.springframework.data.repository.CrudRepository;

public interface HeadphonesRepo extends CrudRepository<Headphones,Long> {
}
