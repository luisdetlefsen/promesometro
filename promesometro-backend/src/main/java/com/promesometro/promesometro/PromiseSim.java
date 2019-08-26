package com.promesometro.promesometro;

public class PromiseSim{
    private Long idCandidate;
    private String promiseText;

    public PromiseSim(){};

    public PromiseSim(Long idCandidate, String promiseText) {
        this.idCandidate = idCandidate;
        this.promiseText = promiseText;
    }

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
}
