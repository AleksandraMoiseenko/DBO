package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LEGAL_CLIENT")
public class LegalClient {

	@Id
	@Column(name = "ID")
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "CREDIT")
	private String credit;

	@Column(name = "DEPOSIT")
	private String deposit;

	@Column(name = "DEPOSIT_PRICE")
	private Long depositPrice;

	@Column(name = "INVESTMENT")
	private String investment;

	@Column(name = "FACTORING")
	private String factoring;

	@Column(name = "RKO")
	private String rko;

	@Column(name = "RKO_PRICE")
	private Long rkoPrice;

	@Column(name = "INTERNATIONAL_OP")
	private String internationalOp;

	@Column(name = "INTERNET_BANKING")
	private String internetBanking;

	@Column(name = "DBO_PRICE")
	private Long dboPrice;

	@Column(name = "RISKS")
	private Long risks;

	public String getInvestment() {
		return investment;
	}

	public void setInvestment(String investment) {
		this.investment = investment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public Long getDepositPrice() {
		return depositPrice;
	}

	public void setDepositPrice(Long depositPrice) {
		this.depositPrice = depositPrice;
	}

	public String getFactoring() {
		return factoring;
	}

	public void setFactoring(String factoring) {
		this.factoring = factoring;
	}

	public String getRko() {
		return rko;
	}

	public void setRko(String rko) {
		this.rko = rko;
	}

	public Long getRkoPrice() {
		return rkoPrice;
	}

	public void setRkoPrice(Long rkoPrice) {
		this.rkoPrice = rkoPrice;
	}

	public String getInternationalOp() {
		return internationalOp;
	}

	public void setInternationalOp(String internationalOp) {
		this.internationalOp = internationalOp;
	}

	public String getInternetBanking() {
		return internetBanking;
	}

	public void setInternetBanking(String internetBanking) {
		this.internetBanking = internetBanking;
	}

	public Long getDboPrice() {
		return dboPrice;
	}

	public void setDboPrice(Long dboPrice) {
		this.dboPrice = dboPrice;
	}

	public Long getRisks() {
		return risks;
	}

	public void setRisks(Long risks) {
		this.risks = risks;
	}
	
	public boolean equals(LegalClient lc) {
		if (lc.getFactoring().equalsIgnoreCase(this.getFactoring())
				&& lc.getInvestment().equalsIgnoreCase(this.getInvestment())
				&& lc.getDboPrice() == this.getDboPrice()
				&& lc.getInternationalOp().equalsIgnoreCase(this.getInternationalOp())
				&& lc.getRisks() == this.getRisks() && lc.getRkoPrice() == this.getRkoPrice()) {
			return true;

		} else {
			return false;

		}
	   }

	public LegalClient() {
	}

	public LegalClient(String name,String credit, String deposit, String investment, Long depositPrice, String factoring, String rko,
			Long rkoPrice, String internationalOp, String internetBanking, Long dboPrice, Long risks) {

		this.name = name;
		this.credit = credit;
		this.deposit = deposit;
		this.depositPrice = depositPrice;
		this.investment = investment;
		this.factoring = factoring;
		this.rko = rko;
		this.rkoPrice = rkoPrice;
		this.internationalOp = internationalOp;
		this.internetBanking = internetBanking;
		this.dboPrice = dboPrice;
		this.risks = risks;

	}

	public LegalClient(String credit, String deposit, Long depositPrice, String investment, String factoring, String rko,
			Long rkoPrice, String internationalOp, String internetBanking, Long dboPrice, Long risks) {

		this.credit = credit;
		this.deposit = deposit;
		this.depositPrice = depositPrice;
		this.investment = investment;
		this.factoring = factoring;
		this.rko = rko;
		this.rkoPrice = rkoPrice;
		this.internationalOp = internationalOp;
		this.internetBanking = internetBanking;
		this.dboPrice = dboPrice;
		this.risks = risks;

	}

}
