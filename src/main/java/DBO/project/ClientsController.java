package DBO.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import entities.LegalClient;
import entities.PersonalClient;
import services.LegalClientService;
import services.PersonalClientService;

@RestController
@RequestMapping("/clients")
public class ClientsController {

	@Autowired
	private PersonalClientService personalClientService;

	@Autowired
	private LegalClientService legalClientService;

	@CrossOrigin
	@PostMapping("/personal")
	public @ResponseBody String choosePersonalDBO(@RequestBody PersonalClient pc) {
		String bankName = "";
		for (PersonalClient client : personalClientService.findAll()) {
			if (pc.getAccountPrice().equals(client.getAccountPrice()) && pc.getDboPrice().equals(client.getDboPrice())
					&& pc.getDepositPrice().equals(client.getDepositPrice()) && pc.getPercent() == client.getPercent()
					&& pc.getRisks().equals(client.getRisks()) && pc.getRkoPrice().equals(client.getRkoPrice()) ){
				bankName = client.getName();
				break;

			} else {
				bankName = "No DBO systems were found to satisfy all services chosen.";

			}
		}
		return bankName;

	}

	@CrossOrigin
	@PostMapping("/legal")
	public String chooseLegalDBO(@RequestBody LegalClient lc) {
		String bankName = "";
		for (LegalClient client : legalClientService.findAll()) {
			if (lc.getFactoring().equalsIgnoreCase(client.getFactoring())
					&& lc.getInvestment().equalsIgnoreCase(client.getInvestment())
					&& lc.getDboPrice().equals(client.getDboPrice())
					&& lc.getInternationalOp().equalsIgnoreCase(client.getInternationalOp())
					&& lc.getRisks().equals(client.getRisks()) && lc.getRkoPrice().equals(client.getRkoPrice()) && lc.getDepositPrice().equals(client.getDepositPrice())) {//depositPrice
				bankName = client.getName();
				break;
			} else {
				bankName = "No DBO systems were found to satisfy all services chosen.";

			}
		}
		return bankName;

	}
}
