package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entities.LegalClient;
import repositories.LegalClientRepository;
@Service
public class LegalClientService {
	
	@Autowired
	LegalClientRepository legalClientRepository;
	
	@Transactional(readOnly = true)
	public Iterable<LegalClient> findAll(){
		return legalClientRepository.findAll();
	}

}
