package com.promesometro.promesometro;

public class PromiseSimilarDTO {

    private Long idCandidate;
    private String promiseText;
    private Double similarity;
    private Long idPromise;


    public Long getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(Long idCandidate) {
        this.idCandidate = idCandidate;
    }

    public String getPromiseText() {
        return promiseText;
    }

    public void setPromiseText(String promiseText) {
        this.promiseText = promiseText;
    }

    public Double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(Double similarity) {
        this.similarity = similarity;
    }

    public Long getIdPromise() {
        return idPromise;
    }

    public void setIdPromise(Long idPromise) {
        this.idPromise = idPromise;
    }
}
