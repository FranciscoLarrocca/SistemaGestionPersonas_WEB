/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.Persona;
import java.util.List;
import javax.ejb.*;
import javax.persistence.*;

/**
 *
 * @author Usuario
 */
@Stateless
public class PersonaDAOImpl implements PersonaDAO {

    @PersistenceContext(unitName="SgaPU")
    EntityManager em;

    @Override
    public List<Persona> findAllPersonas() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaById(Persona p) {
        return em.find(Persona.class, p.getIdPersona());
    }

    @Override
    public Persona findPersonaByEmail(Persona p) {
        Query query = em.createQuery("FROM persona p WHERE p.email =: email");
        query.setParameter("email", p.getEmail());
        return (Persona) query.getSingleResult();
    }

    @Override
    public void insertPersona(Persona p) {
        em.persist(p);
    }

    @Override
    public void updatePersona(Persona p) {
        em.merge(p);
    }

    @Override
    public void deletePersona(Persona p) {
        em.remove(em.merge(p));
    }
}
