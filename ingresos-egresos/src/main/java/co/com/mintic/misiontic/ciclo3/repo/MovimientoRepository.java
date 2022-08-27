package co.com.mintic.misiontic.ciclo3.repo;

import co.com.mintic.misiontic.ciclo3.modelos.Empresa;
import co.com.mintic.misiontic.ciclo3.modelos.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Anotacion que le dice a Spring que esta clase es un repositorio
public interface MovimientoRepository extends JpaRepository<MovimientoDinero, Integer> {
}