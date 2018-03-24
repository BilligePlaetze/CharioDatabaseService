package de.opencodes.chario.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "love", path = "love")
public interface LoveRepository extends CrudRepository<Love, String> {

    Love findLoveByName(@Param("name") String name);

}
