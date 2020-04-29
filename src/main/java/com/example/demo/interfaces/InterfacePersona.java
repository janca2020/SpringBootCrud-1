package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.lang.Integer;

import com.example.demo.modelo.Persona;
@Repository
public interface InterfacePersona extends CrudRepository<Persona, Integer> {

}
