package com.store.api.dto.common;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.Instant;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ErrorResponseDTO(
        Instant timestamp,
        int status,
        String error,
        String message,
        String path,
        Map<String, String> validationErrors
) {
    public static ErrorResponseDTO of(int status, String error, String message, String path) {
        return new ErrorResponseDTO(Instant.now(), status, error, message, path, null);
    }

    public static ErrorResponseDTO ofValidation(int status, String error, String message, String path,
                                                  Map<String, String> validationErrors) {
        return new ErrorResponseDTO(Instant.now(), status, error, message, path, validationErrors);
    }
}
