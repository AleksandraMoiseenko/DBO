package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import entities.PersonalClient;
import repositories.PersonalClientRepository;
@Service
public class PersonalClientService {

	@Autowired
	PersonalClientRepository personalClientRepository;
	
	@Transactional(readOnly = true)
	public Iterable<PersonalClient> findAll(){
		return personalClientRepository.findAll();
	}
}
