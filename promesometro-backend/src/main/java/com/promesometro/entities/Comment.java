package com.promesometro.entities;

import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
public class Comment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idComment;

    private String text;

    @ManyToOne
    @RestResource(exported = true)
    private Promise promise;

    private String userEmail;

    private Boolean approved;

    public long getIdComment() {
        return idComment;
    }

    public void setIdComment(long idComment) {
        this.idComment = idComment;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Promise getPromise() {
        return promise;
    }

    public void setPromise(Promise promise) {
        this.promise = promise;
    }

    public long getId() {
        return idComment;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getFormattedDate() {
        Date theDate = this.getCreationDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime ldt = theDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        return ldt.format(formatter);
    }

    public String getMaskedEmail() {
        String email = this.getUserEmail();
        if (email == null || email.isEmpty())
            return "";

        String maskedEmail = "";
        if (email.length() > 6) {
            maskedEmail = email.substring(0, 3) + "****" + email.substring(email.length() - 3);
        } else {
            maskedEmail = email.substring(0, 1) + "****" + email.substring(email.length() - 1);
        }
        return maskedEmail;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }
}
