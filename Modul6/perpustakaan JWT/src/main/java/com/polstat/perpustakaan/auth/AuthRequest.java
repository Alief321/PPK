package com.polstat.perpustakaan.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthRequest {
    @Email
    @NotNull
    @Size(max = 50)
    private String email;
    
    @NotNull
    @Size(max = 16)
    private String password;
}