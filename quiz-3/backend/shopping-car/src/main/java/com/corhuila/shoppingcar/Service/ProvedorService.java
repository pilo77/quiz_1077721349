package com.corhuila.shoppingcar.Service;

import com.corhuila.shoppingcar.Document.Factura;
import com.corhuila.shoppingcar.Document.Provedor;
import com.corhuila.shoppingcar.IRepository.IProvedorRepository;
import com.corhuila.shoppingcar.IService.IProvedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvedorService implements IProvedorService {

    @Autowired
    private IProvedorRepository repository;
    @Override
    public List<Provedor> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Provedor> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Provedor save(Provedor provedor) {
        return repository.save(provedor);
    }

    @Override
    public void update(Provedor provedor, String id) {

        //Verificar con el id, si exiten los datos
        Optional<Provedor> ps = repository.findById(id);

        //Cargar nuevo objeto
        if (!ps.isEmpty()){
            Provedor provedorUpadate = ps.get();
            provedorUpadate.setCodigo(provedor.getCodigo());
            provedorUpadate.setNombre(provedor.getNombre());
            provedorUpadate.setDireccion(provedor.getDireccion());

            //Actualizar el objeto factura
            repository.save(provedorUpadate);
        }else{
            System.out.println("No existe el factura");
        }

    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);

    }
}
