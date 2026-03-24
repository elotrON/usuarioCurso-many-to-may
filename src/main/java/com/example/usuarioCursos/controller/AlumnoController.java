package com.example.usuarioCursos.controller;

import com.example.usuarioCursos.dto.AlumnoRequest;
import com.example.usuarioCursos.dto.AlumnoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.usuarioCursos.service.AlumnoService;

@RestController
public class AlumnoController {

    AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @PostMapping("/alumno")
    public AlumnoResponse nuevoAlumno(@RequestBody AlumnoRequest alumnoRequest){
        return alumnoService.crearAlumno(alumnoRequest);
    }


    @GetMapping("/test")
    public String test() {
        return "ok";
    }

}
