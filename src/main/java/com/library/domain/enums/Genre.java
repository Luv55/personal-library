package com.library.domain.enums;

public enum Genre {
    FICTION("Ficción"),
    NON_FICTION("No ficción"),
    MYSTERY("Misterio"),
    ROMANCE("Romance"),
    FANTASY("Fantasía"),
    SCIENCE_FICTION("Ciencia ficción"),
    BIOGRAPHY("Biografía"),
    HISTORY("Historia");

    private final String displayName;

    Genre(String displayName) {
        this.displayName = displayName;
    }

    public String getGenre() {
        return displayName;
    }
}