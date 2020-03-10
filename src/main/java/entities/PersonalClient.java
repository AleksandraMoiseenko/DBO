package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONAL_CLIENT")
public class PersonalClient {
	
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
	
	@Column(name = "ACCOUNT")
	private String account;
	
	@Column(name = "ACCOUNT_PRICE")
	private Long accountPrice;
	
	@Column(name = "RKO")
	private String rko;
	
	@Column(name = "RKO_PRICE")
	private Long rkoPrice;
	
	@Column(name = "MONEY_TRANSACTION")
	private String moneyTransaction;
	
	@Column(name = "PERCENT")
	private float percent;
	
	@Column(name = "INTERNET_BANKING")
	private String internetBanking;
	
	@Column(name = "MOBILE_BANKING")
	private String mobileBanking;
	
	@Column(name = "DBO_PRICE")
	private Long dboPrice;
	
	@Column(name = "RISKS")
	private Long risks;

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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Long getAccountPrice() {
		return accountPrice;
	}

	public void setAccountPrice(Long accountPrice) {
		this.accountPrice = accountPrice;
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

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	public String getInternetBanking() {
		return internetBanking;
	}

	public void setInternetBanking(String internetBanking) {
		this.internetBanking = internetBanking;
	}

	public String getMobileBanking() {
		return mobileBanking;
	}

	public void setMobileBanking(String mobileBanking) {
		this.mobileBanking = mobileBanking;
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
	
	public PersonalClient() {}
	
	public PersonalClient(String name, String credit, String deposit, Long depositPrice, String account, Long accountPrice, String rko,
			Long rkoPrice, String moneyTransaction, float percent, String internetBanking, String mobileBanking, Long dboPrice, Long risks) {
		
		this.name = name;
		this.credit = credit;
		this.deposit = deposit;
		this.depositPrice = depositPrice;
		this.account = account;
		this.accountPrice = accountPrice;
		this.rko = rko;
		this.rkoPrice = rkoPrice;
		this.moneyTransaction = moneyTransaction;
		this.percent=percent;
		this.internetBanking = internetBanking;
		this.mobileBanking=mobileBanking;
		this.dboPrice = dboPrice;
		this.risks = risks;

	}
	
	public PersonalClient(String credit, String deposit, Long depositPrice, String account, Long accountPrice, String rko,
			Long rkoPrice, String moneyTransaction, float percent, String internetBanking, String mobileBanking, Long dboPrice, Long risks) {
		
		this.credit = credit;
		this.deposit = deposit;
		this.depositPrice = depositPrice;
		this.account = account;
		this.accountPrice = accountPrice;
		this.rko = rko;
		this.rkoPrice = rkoPrice;
		this.moneyTransaction = moneyTransaction;
		this.percent=percent;
		this.internetBanking = internetBanking;
		this.mobileBanking=mobileBanking;
		this.dboPrice = dboPrice;
		this.risks = risks;

	}
}
