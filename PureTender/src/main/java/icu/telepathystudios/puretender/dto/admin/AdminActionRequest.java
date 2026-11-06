package icu.telepathystudios.puretender.dto.admin;

import icu.telepathystudios.puretender.model.AccountStatus;

import java.util.UUID;

public record AdminActionRequest(
        UUID userId,
        String message,
        AccountStatus status) {}
