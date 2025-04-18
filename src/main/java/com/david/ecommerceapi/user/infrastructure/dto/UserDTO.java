package com.david.ecommerceapi.user.infrastructure.dto;

import com.david.ecommerceapi.user.domain.Role;
import com.david.ecommerceapi.user.infrastructure.annotation.MaskData;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private Long id;
    private String firstname;
    private String lastname;
    @MaskData
    private String email;
    @Enumerated(EnumType.STRING)
    private Role role;

}
