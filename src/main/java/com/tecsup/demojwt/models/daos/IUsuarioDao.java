package com.tecsup.demojwt.models.daos;

import com.tecsup.demojwt.models.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

    public Usuario findByUsername(String username);
}
