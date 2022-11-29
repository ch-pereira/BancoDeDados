package BancoDeDados.BancoDeDados.controller;

import BancoDeDados.BancoDeDados.entity.Usuario;
import BancoDeDados.BancoDeDados.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/usuario/v1/")

public class Controller {
    @Autowired
    private Repository repositoryUsuario;


    @PostMapping
    @ResponseBody
    public Usuario create(@RequestBody Usuario cliente){
        Usuario clienteSaved = repositoryUsuario.save(cliente);
        return clienteSaved;
    }

    @GetMapping("{id}")
    @ResponseBody
    public Optional<Usuario> getClienteById(@PathVariable Long id){
        Optional<Usuario> clienteReturned = repositoryUsuario.findById(id);
        return clienteReturned;
    }

    @GetMapping
    public List<Usuario> getAllCliente(){
        return repositoryUsuario.findAll();
    }

    @DeleteMapping
    public String deleteClienteById(@PathVariable Long id){
        Optional<Usuario> clienteOptional = repositoryUsuario.findById(id);
        if (clienteOptional.isPresent()){
            repositoryUsuario.deleteById(id);
            return "Cliente de id " + id + " foi deletado com sucesso!";
        }else {
            return "Cliente inexistente!";
        }
    }

    @PutMapping("update/{id}")
    public String updateClienteById(@PathVariable Long id, String novoNome){
        Optional<Usuario> clienteOptional = repositoryUsuario.findById(id);
        if (clienteOptional.isPresent()){
            Usuario c = clienteOptional.get();
            repositoryUsuario.save(c);
            return "Cliente de id "+ id + " salvo com sucesso!";
        }else {
            return "Cliente inexistente!";
        }
    }
}