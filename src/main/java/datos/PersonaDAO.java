/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.Persona;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface PersonaDAO {

    public List<Persona> findAllPersonas();

    public Persona findPersonaById(Persona p);

    public Persona findPersonaByEmail(Persona p);

    public void insertPersona(Persona p);

    public void updatePersona(Persona p);

    public void deletePersona(Persona p);
}
