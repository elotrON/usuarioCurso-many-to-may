package repository;


import entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

// Curso → la entidad
// Integer → tipo del ID (@Id)
public interface CursoRepository extends JpaRepository<Curso, Integer> {


}
