/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import domain.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface UsuarioService {
    
    public List<Usuario> listarUsuarios();

    public Usuario encontrarUsuarioPorId(Usuario u);
    
    public void agregarUsuario(Usuario u);

    public void modificarUsuario(Usuario u);

    public void eliminarUsuario(Usuario u);
}
