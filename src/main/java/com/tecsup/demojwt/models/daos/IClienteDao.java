package com.tecsup.demojwt.models.daos;

import com.tecsup.demojwt.models.entities.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {

    @Query("select c from Cliente c left join fetch c.facturas f where c.id=?1")
    public Cliente fetchByIdWithFacturas(Long id);
}
