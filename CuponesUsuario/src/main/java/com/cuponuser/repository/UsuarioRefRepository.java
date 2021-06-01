/**
 * 
 */
package com.cuponuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cuponuser.model.UsuarioRef;

/**
 * @author LX
 *
 */
@Repository
public interface UsuarioRefRepository extends JpaRepository<UsuarioRef, Integer>{

}
