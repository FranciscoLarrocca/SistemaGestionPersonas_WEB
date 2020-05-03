/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.Usuario;
import java.util.List;
import javax.ejb.*;
import javax.persistence.*;

/**
 *
 * @author Usuario
 */
@Stateless
public class UsuarioDAOImpl implements UsuarioDAO {

    @PersistenceContext(unitName="SgaPU")
    EntityManager em;

    @Override
    public List<Usuario> findAllUsuarios() {
        return em.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario findUsuarioById(Usuario u) {
        return em.find(Usuario.class, u.getIdUsuario());
    }

    @Override
    public void insertUsuario(Usuario u) {
        em.persist(u);
    }

    @Override
    public void updateUsuario(Usuario u) {
        em.merge(u);
    }

    @Override
    public void deleteUsuario(Usuario u) {
        em.remove(em.merge(u));        
    }

}
