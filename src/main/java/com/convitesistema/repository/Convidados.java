package com.convitesistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.convitesistema.model.Convidado;

@Repository
public interface Convidados extends JpaRepository<Convidado, Long>{

}
