package co.com.mintic.misiontic.ciclo3.controller;

import co.com.mintic.misiontic.ciclo3.modelos.Empleado;
import co.com.mintic.misiontic.ciclo3.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping ({"/VerEmpleado"})
    public String viewEmpleado(Model model){
        List<Empleado> listaEmpleados=empleadoService.getAllEmpleados();
        model.addAttribute("emplist",listaEmpleados);
        return "verEmpleados";
    }
}
