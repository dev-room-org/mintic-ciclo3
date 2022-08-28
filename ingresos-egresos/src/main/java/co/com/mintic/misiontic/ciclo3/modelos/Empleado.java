package co.com.mintic.misiontic.ciclo3.modelos;

import org.springframework.ui.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String nombre;
    private String correo;
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;
    private String rol;
    @OneToMany(mappedBy = "usuario")
    private Set<MovimientoDinero> movimientos;

    public Empleado() {
    }

    public Empleado(String nombre, String correo, Empresa empresa, String rol, Set<MovimientoDinero> movimientos) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
        this.movimientos = movimientos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Set<MovimientoDinero> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Set<MovimientoDinero> movimientos) {
        this.movimientos = movimientos;
    }
}