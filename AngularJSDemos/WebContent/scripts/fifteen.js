/// <reference path="scripts/angular.min.js"/>

/*var myApp = angular.module("myModule", []).controller("myController",
		function($scope, $http, $log) {
	$http({
		url:'http://www.webservicex.net/CurrencyConvertor.asmx/ConversionRate?FromCurrency=INR&ToCurrency=EUR',
		method: 'GET'
	}).then(function(response){
		$scope.responseText= response.data;
		$log.info("Response received!");
		alert($scope.responseText);
	}, function(errorReason){
		$scope.error= errorReason.data;
		$log.error("Response failed!");
	});
	
	$scope.message="heelo";
});*/
var myModule = angular.module("myModule", []).
controller("myController", function($scope, $http, $log) {
	$http({
		method: 'GET',
		url:'http://www.webservicex.net/CurrencyConvertor.asmx/ConversionRate?FromCurrency=INR&ToCurrency=EUR'
		
			
	}).then(function(response){
		$scope.responseValue= response.data;
		$log.info(response);
		/*logs response object on console*/
	}, function(reason){
		$scope.error= reason.data;
		$log.error(reason);
	});
});