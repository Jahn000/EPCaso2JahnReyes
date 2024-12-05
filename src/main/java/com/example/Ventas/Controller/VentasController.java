/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Ventas.Controller;

import com.example.Ventas.model.Ventas;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VentasController {

    @GetMapping("/registro")
    public String showRegistroForm(Model model) {
        model.addAttribute("ventas", new Ventas());
        return "registro";
    }

    @PostMapping("/registro")
    public String submitRegistro(Ventas ventas, Model model) {
        
        model.addAttribute("ventas", ventas);
        return "exito";
    }
}
