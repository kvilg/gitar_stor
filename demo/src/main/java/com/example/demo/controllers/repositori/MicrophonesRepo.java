package com.example.demo.controllers.repositori;

import com.example.demo.model.Microphones;
import org.springframework.data.repository.CrudRepository;

public interface MicrophonesRepo extends CrudRepository<Microphones, Long> {
}
