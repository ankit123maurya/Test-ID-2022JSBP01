package com.example.demo.Payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {
    private long id;
    @NotBlank
    @Size(min=5)
    private  String companyName;

    @Email
    private String email;

    private  Integer strength;
    private  String webSiteUrl;
    @Pattern(regexp = "^[a-zA-Z]{2}\\d{2}[EN]$",message = "Length should be 5 characters\n" +
            "1st & 2nd characters should be alphabets\n" +
            "(case insensitive)\n" +
            "3rd & 4th characters should be numbers\n" +
            "5th character should be E or N")
    private String companyCode;
}
