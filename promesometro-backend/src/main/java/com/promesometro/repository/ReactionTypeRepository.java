package com.promesometro.repository;

import com.promesometro.entities.ReactionType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "reactionTypes", path = "reactionTypes")
public interface ReactionTypeRepository extends PagingAndSortingRepository<ReactionType, Long> {
}
