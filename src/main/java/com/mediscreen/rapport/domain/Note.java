package com.mediscreen.rapport.domain;

import java.io.Serializable;

/**
 * Class materializing a note.
 */
public class Note implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private long patientId;
    private String patientLastName;
    private String patientFirstName;
    private String noteText;

    public Note() {
    }

    public Note(String patientLastName, String patientFirstName, String noteText) {
        this.patientLastName = patientLastName;
        this.patientFirstName = patientFirstName;
        this.noteText = noteText;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }
}
