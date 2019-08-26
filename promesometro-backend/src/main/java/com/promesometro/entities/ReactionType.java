package com.promesometro.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="reactionType")
public class ReactionType extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReactionType;

    @Column(unique=true)
    private String reactionType;

    @OneToMany
    private List<Reaction> reactionList;

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

    public List<Reaction> getReactionList() {
        return reactionList;
    }

    public void setReactionList(List<Reaction> reactionList) {
        this.reactionList = reactionList;
    }
}
