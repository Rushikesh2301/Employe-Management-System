package com.UvTech.EMS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UvTech.EMS.Entity.EMSEntity;

public interface EMSPRepo extends JpaRepository<EMSEntity, Integer>{

}
