
package com.DPIManagement.StudentRestApi.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "api/v1/students")
public class StudentServiceManagement {
    
    private final DPIRegisterService DPIRegisterService;
      
    @Autowired
    public StudentServiceManagementr(DPIRegisterService DPIRegisterService){
        this.DPIRegisterService = DPIRegisterService;
    
    }
    
    @GetMapping(path = "/mainmenu")
    public ResponseEntity<String> homepage(){
        
        return new ResponseEntity<>(
        		DPIRegisterService.Grertings(),
                HttpStatus.OK
        
        ) ;
    
    }
    
}
