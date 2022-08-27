package co.com.mintic.misiontic.ciclo3.controller;

import co.com.mintic.misiontic.ciclo3.modelos.Empresa;
import co.com.mintic.misiontic.ciclo3.modelos.MovimientoDinero;
import co.com.mintic.misiontic.ciclo3.service.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MovimientosController {
    @Autowired
    MovimientoService movimientoService;

    @GetMapping ({"/VerMovimientos"})
    public String viewMovimientos(Model model){
        List<MovimientoDinero> listaMovimientos= movimientoService.getAllMovimientos();
        model.addAttribute("movlist",listaMovimientos);
        return "VerMovimientos"; //Llamamos al HTML
    }


}
