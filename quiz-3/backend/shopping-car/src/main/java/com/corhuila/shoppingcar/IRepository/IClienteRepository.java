package com.corhuila.shoppingcar.IRepository;

import com.corhuila.shoppingcar.Document.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String> {
    List<Cliente> findByDeletedAtIsNull();

}
