package com.corhuila.shoppingcar.IService;

import com.corhuila.shoppingcar.Document.Provedor;

import java.util.List;
import java.util.Optional;

public interface IProvedorService {
    List<Provedor> findAll(); // Devuelve una lista de Provedors
    Optional<Provedor> findById(String id); // Devuelve un Provedor por su id
    Provedor save(Provedor provedor); // Guarda un producto
    void update(Provedor provedor, String id); // Actualiza un producto
    void delete(String id); // Elimina un producto
}
