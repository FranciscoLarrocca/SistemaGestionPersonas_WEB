/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Usuario
 */
@Stateless
public class PersonaServiceImpl implements PersonaService {
    
    @Inject
    private PersonaDAO personaDAO;
    
    @Resource
    private SessionContext contexto;
    
    @Override
    public List<Persona> listarPersonas() {
        return personaDAO.findAllPersonas();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona p) {
        return personaDAO.findPersonaById(p);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona p) {
        return personaDAO.findPersonaByEmail(p);
    }

    @Override
    public void agregarPersona(Persona p) {
        personaDAO.insertPersona(p);
    }

    @Override
    public void modificarPersona(Persona p){
        try{
            personaDAO.updatePersona(p);
            
        }catch(Throwable t){
            contexto.setRollbackOnly();
            t.printStackTrace(System.out);
            
        }
    }

    @Override
    public void eliminarPersona(Persona p) {
         personaDAO.deletePersona(p);
    }

}
