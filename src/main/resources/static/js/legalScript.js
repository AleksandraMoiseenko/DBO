function getLegal(){
	var xhr1 = new XMLHttpRequest();
	xhr1.open('POST', 'http://localhost:8080/clients/legal', true);
	xhr1.setRequestHeader("Content-type", "application/json");

	xhr1.onreadystatechange = function() {//Вызывает функцию при смене состояния.
	    if(xhr1.readyState == XMLHttpRequest.DONE && xhr1.status == 200) {
		   // console.log(xhr.response);
		   var result2 = xhr1.response;
		   document.getElementById('result2').innerHTML=result2;
	    }
	}
	var legalCredit = document.getElementById("legalCredit");
	var legalDeposit = document.getElementById("legalDeposit");
	var legalDepositPrice = document.getElementById("legalDepositPrice");
	var investment = document.getElementById("investment");
	var factoring = document.getElementById("factoring");
	var legalRKO = document.getElementById("legalRKO");
	var legalRKOPrice = document.getElementById("legalRKOPrice");
	var internationalOp = document.getElementById("internationalOp");
	var legalInternetBanking = document.getElementById("legalInternetBanking");
	var legalDBOPrice = document.getElementById("legalDBOPrice");
	var legalRisks = document.getElementById("legalRisks");
	//console.log(x);
    xhr1.send(JSON.stringify({ "credit": legalCredit.value, "deposit": legalDeposit.value, "depositPrice" : legalDepositPrice.value, "investment":investment.value, "factoring":factoring.value, "rko":legalRKO.value, "rkoPrice":legalRKOPrice.value, "internationalOp":internationalOp.value, "internetBanking":legalInternetBanking.value, "dboPrice":legalDBOPrice.value, "risks":legalRisks.value}));
}