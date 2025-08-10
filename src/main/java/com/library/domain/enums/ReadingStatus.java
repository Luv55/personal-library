package com.library.domain.enums;

public enum ReadingStatus {
    NOT_STARTED("No iniciado"),
    READING("Leyendo"),
    FINISHED("Leído"),
    ABANDONED("Abandonado");

    private final String displayName;

    ReadingStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}