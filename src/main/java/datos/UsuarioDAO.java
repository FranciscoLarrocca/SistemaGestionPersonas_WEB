/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.Usuario;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface UsuarioDAO {

    public List<Usuario> findAllUsuarios();

    public Usuario findUsuarioById(Usuario u);

    public void insertUsuario(Usuario u);

    public void updateUsuario(Usuario u);

    public void deleteUsuario(Usuario u);
}
