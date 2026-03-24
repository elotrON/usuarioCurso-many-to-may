package dto;

import java.util.HashSet;
import java.util.Set;

public class CursoResponse {

    private Integer id;
    private String nombre;
    private int duracion;
    private String habilidades;
    private Set<Integer> alumnosIds = new HashSet<>();

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Integer> getAlumnosIds() {
        return alumnosIds;
    }

    public void setAlumnosIds(Set<Integer> alumnosIds) {
        this.alumnosIds = alumnosIds;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
