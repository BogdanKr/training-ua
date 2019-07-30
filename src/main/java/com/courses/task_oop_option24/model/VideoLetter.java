package com.courses.task_oop_option24.model;

import java.time.LocalDate;

public class VideoLetter extends Letter {
    String fileName;
    int duration;

    public VideoLetter(String title, String sender, String recipient, LocalDate sendDate, Category category, String fileName, int duration) {
        super(title, sender, recipient, sendDate, category);
        this.fileName = fileName;
        this.duration = duration;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
