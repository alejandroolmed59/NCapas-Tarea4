package com.example.olmedo.tarea3.Controller;

import com.example.olmedo.tarea3.Model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
public class ProductoController {
    @RequestMapping(value="/producto", method = RequestMethod.GET)
    public static ModelAndView ingresar(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("producto", new Producto());
        mav.setViewName("agregarProducto");
        return mav;
    }
    @RequestMapping(value="/productoResponse")
    public ModelAndView nuevoProducto(@Valid @ModelAttribute Producto producto, BindingResult result){

        ModelAndView mav = new ModelAndView();
        if(result.hasErrors()){
            mav.setViewName("agregarProducto");
        }else{
            mav.addObject("nombre", producto.getNombre());
            mav.setViewName("mostrarMensaje");
        }

        return mav;
    }
}
