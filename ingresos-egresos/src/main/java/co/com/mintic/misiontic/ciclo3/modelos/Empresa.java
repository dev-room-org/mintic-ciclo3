package co.com.mintic.misiontic.ciclo3.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nombre;
    private String direccion;
    private String telefono;
    private StringNIT;
}
