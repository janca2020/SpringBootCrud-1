package com.example.demo.interfaceServices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Persona;
@Service
public interface IpersonaService {
public List<Persona>listar();
public  Optional<Persona>listarId(int id);
public  int save(Persona p);
public void delete(int id);


}
