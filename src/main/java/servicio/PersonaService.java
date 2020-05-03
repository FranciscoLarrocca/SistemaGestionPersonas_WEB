/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import domain.Persona;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface PersonaService {

    public List<Persona> listarPersonas();

    public Persona encontrarPersonaPorId(Persona p);

    public Persona encontrarPersonaPorEmail(Persona p);

    public void agregarPersona(Persona p);

    public void modificarPersona(Persona p);

    public void eliminarPersona(Persona p);
}
