package com.store.api.dto.user;

import com.store.api.entity.enums.Role;

import java.time.Instant;

public record UserResponseDTO(
        Long id,
        String name,
        String email,
        Role role,
        boolean enabled,
        Instant createdAt
) {
}
