package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String nombre) {
        return "Hola, " + nombre + ". Estás ejecutando un proyecto Maven";
    }

    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{nombre}"})
    public String saluda2(@PathVariable(required = false) String nombre) {
        if (nombre == null) nombre = "UNKNOWN";
        return "Hola, " + nombre + ". Estás ejecutando un proyecto Maven";
    }
}
