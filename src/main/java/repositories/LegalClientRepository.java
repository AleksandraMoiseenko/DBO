package repositories;

import org.springframework.data.repository.CrudRepository;

import entities.LegalClient;

public interface LegalClientRepository extends CrudRepository<LegalClient,Long> {

}
