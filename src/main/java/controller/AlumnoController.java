package controller;

import dto.AlumnoRequest;
import dto.AlumnoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import service.AlumnoService;

@RestController
public class AlumnoController {

    AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @PostMapping("/alumno")
    public AlumnoResponse nuevoAlumno(AlumnoRequest alumnoRequest){
        return alumnoService.crearAlumno(alumnoRequest);
    }


}
