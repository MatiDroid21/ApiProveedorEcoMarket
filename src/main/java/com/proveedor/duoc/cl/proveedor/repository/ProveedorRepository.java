package com.proveedor.duoc.cl.proveedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proveedor.duoc.cl.proveedor.model.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, buscar por nombre o email
    // List<Proveedor> findByNombre(String nombre);
    // List<Proveedor> findByEmail(String email);

}
