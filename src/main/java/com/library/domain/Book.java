package com.library.domain;

import com.library.domain.enums.Genre;
import com.library.domain.enums.ReadingStatus;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Book {
    private final String id;
    private final String title;
    private final String author;
    private final String isbn;
    private ReadingStatus readingStatus;
    private LocalDate addedDate;
    private int personalRating;
    private Genre genre;
    private int pages;
    private String publisher;
    private int publicationYear;
    private Set<String> tags;
    private LocalDate startReadingDate;
    private LocalDate finishReadingDate;

    public Book(String title, String author, String isbn) {

        if (title == null || title.trim().isEmpty()){
            throw new IllegalArgumentException("Title cannot be null or empty");
        }

        if (author == null || author.trim().isEmpty()){
            throw new IllegalArgumentException("Author cannot be null or empty");
        }

        if (!isValidISBN(isbn)){
            throw new IllegalArgumentException("Invalid ISBN");
        }

        this.id = UUID.randomUUID().toString();
        this.title = title.trim();
        this.author = author.trim();
        this.isbn = isbn;
        this.readingStatus = ReadingStatus.NOT_STARTED;
        this.addedDate = LocalDate.now();
        this.tags = new HashSet<>();
    }

    private boolean isValidISBN(String isbn) {
        if (isbn == null) return false;
        String cleanIsbn = isbn.replaceAll("[^0-9X]", "");
        return cleanIsbn.length() == 10 || cleanIsbn.length() == 13;
    }

    private void startReading(){
        this.readingStatus = ReadingStatus.READING;
        this.startReadingDate = LocalDate.now();
    }

    private void maskAsFinished(){
        this.readingStatus = ReadingStatus.FINISHED;
        this.startReadingDate = LocalDate.now();
    }

    private void setPersonalRating(Integer rating){
        if (rating != null && (rating > 0 && rating < 6)){
            this.personalRating = rating;
        } else {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public ReadingStatus getReadingStatus() {
        return readingStatus;
    }

    public void setReadingStatus(ReadingStatus readingStatus) {
        this.readingStatus = readingStatus;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }

    public int getPersonalRating() {
        return personalRating;
    }

    public void setPersonalRating(int personalRating) {
        this.personalRating = personalRating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public LocalDate getStartReadingDate() {
        return startReadingDate;
    }

    public void setStartReadingDate(LocalDate startReadingDate) {
        this.startReadingDate = startReadingDate;
    }

    public LocalDate getFinishReadingDate() {
        return finishReadingDate;
    }

    public void setFinishReadingDate(LocalDate finishReadingDate) {
        this.finishReadingDate = finishReadingDate;
    }
}