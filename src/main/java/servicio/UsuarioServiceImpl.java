/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Usuario
 */
@Stateless
public class UsuarioServiceImpl implements UsuarioService {
    
    @Inject
    private UsuarioDAO usuarioDAO;
    
    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioDAO.findAllUsuarios();
    }
    
    @Override
    public Usuario encontrarUsuarioPorId(Usuario u) {
        return usuarioDAO.findUsuarioById(u);
    }
    
    @Override
    public void agregarUsuario(Usuario u) {
        usuarioDAO.insertUsuario(u);
    }
    
    @Override
    public void modificarUsuario(Usuario u) {
        usuarioDAO.updateUsuario(u);
    }
    
    @Override
    public void eliminarUsuario(Usuario u) {
        usuarioDAO.deleteUsuario(u);
    }
    
}
