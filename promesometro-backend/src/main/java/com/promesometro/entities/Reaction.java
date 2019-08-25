package com.promesometro.entities;

import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(uniqueConstraints={
        @UniqueConstraint(columnNames = {"promise_id", "userEmail"})
})
public class Reaction extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReaction;

    private Date creationDate;

    @ManyToOne
    @RestResource(exported = true)
    @JoinColumn(name = "reaction_type_id")
    private ReactionType reactionType;

    @ManyToOne
    @RestResource
    @JoinColumn(name = "promise_id")
    private Promise promise;

    private String userEmail;

    public long getIdReaction() {
        return idReaction;
    }

    public void setIdReaction(long idReaction) {
        this.idReaction = idReaction;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public ReactionType getReactionType() {
        return reactionType;
    }

    public void setReactionType(ReactionType reactionType) {
        this.reactionType = reactionType;
    }

    public long getId(){
        return idReaction;
    }

    public Promise getPromise() {
        return promise;
    }

    public void setPromise(Promise promise) {
        this.promise = promise;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
