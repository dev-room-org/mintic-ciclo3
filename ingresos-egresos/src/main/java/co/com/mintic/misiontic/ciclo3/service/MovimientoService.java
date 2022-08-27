package co.com.mintic.misiontic.ciclo3.service;
import co.com.mintic.misiontic.ciclo3.modelos.MovimientoDinero;
import co.com.mintic.misiontic.ciclo3.repo.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//Le decimos a Spring que esta clase es de servicios
@Service
public class MovimientoService {
    @Autowired //Conectamos esta clase con el repository de Empresa
    MovimientoRepository movimientoRepository; //Creamos un objeto tipo EmpresaRepository para poder usar los metodos que dicha clase hereda

    //Metodo que retornará la lista de empresas usando metodos heredados del jpaRepository
    public List<MovimientoDinero> getAllMovimientos(){
        List<MovimientoDinero> MovimientosList = new ArrayList<>();
        movimientoRepository.findAll().forEach(movimientos -> MovimientosList.add(movimientos));  //Recorremos el iterable que regresa el metodo findAll del Jpa y lo guardamos en la lista creada
        return MovimientosList;
    }

    //Metodo que me trae un objeto de tipo Empresa cuando cuento con el id de la misma
    public MovimientoDinero getMovimientoDineroById(Integer id){
        return movimientoRepository.findById(id).get();
    }

    //Metodo para guardar o actualizar objetos de tipo Empresa
    public boolean saveOrUpdateMovimientos(MovimientoDinero movimientoDinero){
        MovimientoDinero mov= movimientoRepository.save(movimientoDinero);
        if (movimientoRepository.findById(mov.getId())!=null){
            return true;
        }
        return false;
    }

    //Metodo para eliminar empresas registradas teniendo el id
    public boolean deleteMovimientoDinero(Integer id){
        movimientoRepository.deleteById(id);
        if (getMovimientoDineroById(id)!=null){
            return false;
        }
        return true;
    }

}
