package com.promesometro.repository;


import com.promesometro.DTO.CandidateDTO;
import com.promesometro.entities.Candidate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "candidates", path="candidates")
public interface CandidateRepository extends PagingAndSortingRepository<Candidate,Long> {


    @RestResource(path = "candidateInfo", rel = "candidateInfo")
    @Query("select new com.promesometro.DTO.CandidateDTO(c.idCandidate,c.description,c.candidateName,c.imgUrl,p.idParty,p.party,ct.idCandidateType,ct.position) from Candidate c ,CandidateType ct, Party p")
    List<CandidateDTO> fetchCandidateInfo(@Param("idCandidate") Long idCandidate);

}
