function getPersonal(){
	var xhr = new XMLHttpRequest();
	xhr.open('POST', 'http://localhost:8080/clients/personal', true);
	xhr.setRequestHeader("Content-type", "application/json");

	xhr.onreadystatechange = function() {//Вызывает функцию при смене состояния.
	    if(xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200) {
		   // console.log(xhr.response);
		   var result = xhr.response;
		   document.getElementById('result').innerHTML=result;
	    }
	}
	var personalCredit = document.getElementById("personalCredit");
	var personalDeposit = document.getElementById("personalDeposit");
	var personalDepositPrice = document.getElementById("personalDepositPrice");
	var personalAccount = document.getElementById("personalAccount");
	var personalAccountPrice = document.getElementById("personalAccountPrice");
	var personalRKO = document.getElementById("personalRKO");
	var personalRKOPrice = document.getElementById("personalRKOPrice");
	var personalMoneyTransaction = document.getElementById("personalMoneyTransaction");
	var personalPercent = document.getElementById("personalPercent");
	var personalInternetBanking = document.getElementById("personalInternetBanking");
	var personalMobileBanking = document.getElementById("personalMobileBanking");
	var personalDBOPrice = document.getElementById("personalDBOPrice");
	var personalRisks = document.getElementById("personalRisks");
	//console.log(x);
	xhr.send(JSON.stringify({ "credit": personalCredit.value, "deposit": personalDeposit.value, "depositPrice" : personalDepositPrice.value, "account":personalAccount.value, "accountPrice":personalAccountPrice.value, "rko":personalRKO.value, "rkoPrice":personalRKOPrice.value, "moneyTransaction":personalMoneyTransaction.value, "percent":personalPercent.value, "internetBanking":personalInternetBanking.value, "mobileBanking":personalMobileBanking.value, "dboPrice":personalDBOPrice.value, "risks":personalRisks.value}));
}