package com.corhuila.shoppingcar.Controller;


import com.corhuila.shoppingcar.Document.Provedor;
import com.corhuila.shoppingcar.IService.IProvedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/provedor")
public class ProvedorController {
    @Autowired
    private IProvedorService service;

    @GetMapping()
    public List<Provedor> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Provedor> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping()
    public Provedor save(@RequestBody Provedor provedor) {
        return service.save(provedor);
    }


    @PutMapping("/{id}")
    public void update(@RequestBody Provedor provedor, @PathVariable String id) {
        service.update(provedor, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}


