package com.promesometro.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class CandidateType extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCandidateType;

    @Column(unique=true)
    private String position;

    @OneToMany
    private List<Candidate> candidates;

    public long getIdCandidateType() {
        return idCandidateType;
    }

    public void setIdCandidateType(long idCandidateType) {
        this.idCandidateType = idCandidateType;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getId(){
        return idCandidateType;
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }
}
