package com.UvTech.EMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UvTech.EMS.Entity.EMSEntity;
import com.UvTech.EMS.Service.EMSService;

@RestController
public class EMSController {
	
	@Autowired
	private EMSService service;
	
	@GetMapping("/EMS")
	public String EMS() {
		return"EMS Running Properly....";
	}
	
	@PostMapping("/AddEmp")
	public String AddEmp(@RequestBody EMSEntity employee) {
		return service.AddEmp(employee);	
	}

	@DeleteMapping("/delemp/{Id}")
	public String delemp(@PathVariable Integer Id) {
		return service.delemp(Id);
	}
	
	@GetMapping("/retemp/{Id}")
	public String retemp(@PathVariable Integer Id) {
		  return service.retemp(Id);
		
	}
	
	@PutMapping("/putemp/{Id}/{eName}/{lName}/{Address}/{Department}/{Dob}")
	public String putemp( @PathVariable Integer Id,
			              @PathVariable String Address,
			              @PathVariable String Department,
			              @PathVariable String eName,
			              @PathVariable String lName,
			              @PathVariable String Dob){
		
		
		EMSEntity putempp =new EMSEntity();
		putempp.setAddress(Address);
		putempp.setDepartment(Department);
	    putempp.setId(Id);
	    putempp.seteName(eName);
	    putempp.setlName(lName);
	    putempp.setDob(Dob);
	    
		
		return service.putemp(putempp);	
	}
}
