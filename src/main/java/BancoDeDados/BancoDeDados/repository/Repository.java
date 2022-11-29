package BancoDeDados.BancoDeDados.repository;

import BancoDeDados.BancoDeDados.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Usuario, Long> {

}
