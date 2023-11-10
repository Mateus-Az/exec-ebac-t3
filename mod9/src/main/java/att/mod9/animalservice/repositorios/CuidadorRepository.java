package att.mod9.animalservice.repositorios;

import att.mod9.animalservice.entidades.Cuidador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuidadorRepository extends JpaRepository<Cuidador, Integer> {
    Cuidador findByNome(String nome);

}