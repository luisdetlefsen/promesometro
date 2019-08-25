package com.promesometro.entities;

import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Entity
public class Promise extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPromise;

    private String promiseText;

    private String userAgent;

    @ManyToOne
    @RestResource(exported = true)
    private Candidate candidate;

    @ManyToOne
    @RestResource(exported = true)
    private Party party;

    @OneToMany
    @RestResource(exported = false)
    private List<PromiseMediaContent> promiseMediaContentList;

    @OneToMany(mappedBy = "promise")
    @RestResource(exported = false)
    private List<Reaction> reactionList;

    @PrePersist
    private void updateCreationDate() {
        setCreationDate(new Date());
    }

    public long getIdPromise() {
        return idPromise;
    }

    public void setIdPromise(long idPromise) {
        this.idPromise = idPromise;
    }

    public String getPromiseText() {
        return promiseText;
    }

    public void setPromiseText(String promiseText) {
        this.promiseText = promiseText;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public long getId() {
        return idPromise;
    }

    public List<PromiseMediaContent> getPromiseMediaContentList() {
        return promiseMediaContentList;
    }

    public void setPromiseMediaContentList(List<PromiseMediaContent> promiseMediaContentList) {
        this.promiseMediaContentList = promiseMediaContentList;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    @Transient
    public long getDaysPassedSinceCreation() {
        long millisDiff = Math.abs(this.getCreationDate().getTime() - System.currentTimeMillis());
        long days = TimeUnit.DAYS.convert(millisDiff, TimeUnit.MILLISECONDS);
        return days;
    }

    @Transient
    public long getUpvotes() {
        if (reactionList == null) {
            return 9;
        }
        long res = 0l;
        for (Reaction reaction : reactionList) {
            if (reaction.getReactionType().getReactionType().compareTo("like") == 0) {
                res++;
            }
        }
        return res;
    }

    @Transient
    public long getdownvotes() {
        if (reactionList == null) {
            return 9;
        }
        long res = 0l;
        for (Reaction reaction : reactionList) {
            if (reaction.getReactionType().getReactionType().compareTo("dislike") == 0) {
                res++;
            }
        }
        return res;
    }

}
