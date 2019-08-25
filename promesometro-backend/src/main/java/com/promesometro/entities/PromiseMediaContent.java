package com.promesometro.entities;

import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

@Entity
public class PromiseMediaContent extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPromiseMediaContent;

    private String contentUrl;

    @ManyToOne
    @RestResource(exported = true)
    private Promise promise;

    public long getIdPromiseMediaContent() {
        return idPromiseMediaContent;
    }

    public void setIdPromiseMediaContent(long idPromiseMediaContent) {
        this.idPromiseMediaContent = idPromiseMediaContent;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public Promise getPromise() {
        return promise;
    }

    public void setPromise(Promise promise) {
        this.promise = promise;
    }
    public long getId(){
        return idPromiseMediaContent;
    }
}
