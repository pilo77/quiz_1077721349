package com.corhuila.shoppingcar.IRepository;


import com.corhuila.shoppingcar.Document.Provedor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProvedorRepository extends MongoRepository<Provedor,String> {
}
