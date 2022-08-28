package co.com.mintic.misiontic.ciclo3.repo;

import co.com.mintic.misiontic.ciclo3.modelos.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{
}
