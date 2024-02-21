package com.example.demo.service;

import com.example.demo.Payload.CompanyDto;
import com.example.demo.entity.Company;
import com.example.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository  companyRepository;

    public CompanyDto getCompanyById(long id) {
        Company company = companyRepository.findById(id).orElseThrow();
        return mapToDto(company);

    }

    CompanyDto mapToDto (Company company){
        CompanyDto companyDto=new CompanyDto();
        companyDto.setCompanyName(company.getCompanyName());
        companyDto.setId(company.getId());
        companyDto.setEmail(company.getEmail());
        companyDto.setStrength(company.getStrength());
        companyDto.setWebSiteUrl(company.getWebSiteUrl());
        companyDto.setCompanyCode(company.getCompanyCode());
        return companyDto;
    }

    public CompanyDto getCompanyByCompanyCode(String companyCode) {
        Company company = companyRepository.findByCompanyCode(companyCode).orElseThrow();
        return mapToDto(company);
    }
}
