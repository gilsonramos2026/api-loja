package com.store.api.dto.auth;

import com.store.api.entity.enums.Role;

public record AuthResponseDTO (
    String token,
    String type,
    Long id,
    String name,
    String email,
    Role role
) {
    public static AuthResponseDTO of(String token, Long id, String name, String email, Role role) {
        return new AuthResponseDTO(token, "Bearer", id, name, email, role);
    }
}
