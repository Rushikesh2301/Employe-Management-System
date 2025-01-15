package com.UvTech.EMS.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UvTech.EMS.Entity.EMSEntity;
import com.UvTech.EMS.Repo.EMSPRepo;

@Service
public class EMSService {
	@Autowired
	private EMSPRepo emsrepo;
	
	public String AddEmp(EMSEntity employee) {
		 emsrepo.save(employee);
		return "Employee Added To DataBase..";
	}
         public String delemp(Integer Id) {
        	 emsrepo.deleteById(Id);
        	 return "Employee Deleted From Db";
         }
         
         public String retemp(Integer Id) {
        	Optional<EMSEntity> employee = emsrepo.findById(Id);
        	 return employee.toString();
         }
         
         public String putemp(EMSEntity putempp) {
    		 emsrepo.save(putempp);
    		return "employee updated succesfully";
    	}
}
