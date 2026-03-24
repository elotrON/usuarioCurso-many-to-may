package com.example.usuarioCursos.service;

import com.example.usuarioCursos.entity.Alumno;
import com.example.usuarioCursos.dto.AlumnoRequest;
import com.example.usuarioCursos.dto.AlumnoResponse;
import org.springframework.stereotype.Service;
import com.example.usuarioCursos.repository.AlumnoRepository;
import com.example.usuarioCursos.repository.CursoRepository;

@Service
public class AlumnoService {

    AlumnoRepository alumnoRepository;
    CursoRepository cursoRepository;

    public AlumnoService(AlumnoRepository alumnoRepository, CursoRepository cursoRepository) {
        this.alumnoRepository = alumnoRepository;
        this.cursoRepository = cursoRepository;
    }

    /**
     * CREA NUEVO USUARIO
     * @param alumnoRequest
     * @return
     */
    public AlumnoResponse crearAlumno(AlumnoRequest alumnoRequest){
        Alumno alumno = new Alumno();
        alumno.setNombre(alumnoRequest.getNombre());
        alumno.setApellidos(alumno.getApellidos());
        alumno.setDni(alumnoRequest.getDni());
        alumno.setDireccion(alumnoRequest.getDireccion());
        alumno.setTelefono(alumnoRequest.getTelefono());


        alumnoRepository.save(alumno);
        return toAlumnoResponse(alumno);
    }

    // crear curso


    // añadir curso a usuario


    // quitar curso de usuario


    // obtener usuario por id


    // obtener curso por id


    // listar usuarios


    // listar cursos

    /**
     * CONVIERTE Alumno --> AlumnoResponse
     * @param alumno
     * @return
     */
    private AlumnoResponse toAlumnoResponse(Alumno alumno){
        AlumnoResponse alumnoResponse = new AlumnoResponse();

        alumnoResponse.setNombre(alumno.getNombre());
        alumnoResponse.setApellidos(alumno.getApellidos());
        alumnoResponse.setDni(alumno.getDni());
        alumnoResponse.setDireccion(alumno.getDireccion());
        alumnoResponse.setTelefono(alumno.getTelefono());

        return alumnoResponse;
    }

}
