package com.promesometro.DTO;


public class CandidateDTO {

    private long idCandidate;

    private String description;

    private String candidateName;

    private String imgUrl;
    private long idParty;

    private String party;

    private long idCandidateType;

    private String position;

    public CandidateDTO(long idCandidate, String description, String candidateName, String imgUrl, long idParty, String party, long idCandidateType, String position) {
        this.idCandidate = idCandidate;
        this.description = description;
        this.candidateName = candidateName;
        this.imgUrl = imgUrl;
        this.idParty = idParty;
        this.party = party;
        this.idCandidateType = idCandidateType;
        this.position = position;
    }

    public long getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(long idCandidate) {
        this.idCandidate = idCandidate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public long getIdParty() {
        return idParty;
    }

    public void setIdParty(long idParty) {
        this.idParty = idParty;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

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
}
