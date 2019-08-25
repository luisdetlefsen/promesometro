package com.promesometro.repository;

import com.promesometro.entities.Party;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "parties", path="parties")
public interface PartyRepository extends PagingAndSortingRepository<Party, Long> {
}
