package com.promesometro.entities;

import javax.persistence.*;

@Entity
@Table(name="reactionType")
public class ReactionType extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReactionType;

    @Column(unique=true)
    private String reactionType;

    public long getIdReactionType() {
        return idReactionType;
    }

    public void setIdReactionType(long idReactionType) {
        this.idReactionType = idReactionType;
    }

    public String getReactionType() {
        return reactionType;
    }

    public void setReactionType(String reactionType) {
        this.reactionType = reactionType;
    }

    public long getId(){
        return idReactionType;
    }
}
