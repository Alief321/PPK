
package com.polstat.perpustakaan.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private Long id;
    @NotEmpty(message = "memberid wajib diisi")
    private String memberID;
    @NotNull(message = "nama wajib diisi")
    private String name;
    private String address;
    private String phoneNumber;
}
