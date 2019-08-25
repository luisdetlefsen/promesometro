package com.promesometro.repository;

import com.promesometro.entities.CandidateType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "candidateTypes", path="candidateTypes")
public interface CandidateTypeRepository extends PagingAndSortingRepository<CandidateType,Long> {
}
