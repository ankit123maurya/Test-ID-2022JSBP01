package com.example.demo.controller;

import com.example.demo.Payload.CompanyDto;
import com.example.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/company")
public class CompanyRestController {

    @Autowired
    private CompanyService companyService;

    @GetMapping
    public ResponseEntity<CompanyDto> getCompanyById(@PathVariable long id){
        CompanyDto companyDto=companyService.getCompanyById(id);
        return new ResponseEntity<>(companyDto, HttpStatus.OK);

    }
    @GetMapping("/byCode/{companyCode}")
    public ResponseEntity<CompanyDto> getCompanyByCompanyCode(@PathVariable String companyCode){
        CompanyDto companyDto=companyService.getCompanyByCompanyCode(companyCode);
        return new ResponseEntity<>(companyDto, HttpStatus.OK);

    }
}
