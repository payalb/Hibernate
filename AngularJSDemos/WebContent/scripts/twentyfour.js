var myModule = angular.module("myModule", ['ngRoute']).config(
		 function($routeProvider) {

			 $routeProvider.caseInsensitiveMatch=true;
			 
			$routeProvider.when('/Home', {
				templateUrl : 'Template1/Home.html',
				controller : 'homeController',
				
			}).when('/info', {
				templateUrl : 'Template1/Info.html',
				controller : 'infoController'
			}).when('/contactUs', {
				templateUrl : 'Template1/ContactUs.html',
				controller : 'contactUsController'
			}).when('/inlineTemplate',{
				template : '<h1>Inline template Example</h1>',
				controller : 'inlineController'
			}).otherwise({
	            redirectTo: '/'
	        })


		} ).controller('homeController', function($scope, $http, $route, $log) {
			$scope.homeMessage="Waiting for response!";
		$http({
			method: 'GET',
			url:'http://www.webservicex.net/CurrencyConvertor.asmx/ConversionRate?FromCurrency=INR&ToCurrency=EUR'
		}).then(function(response){
			$scope.homeMessage= response.data;
			$log.info(response);
		}, function(reason){
			$scope.error= reason.data;
			$log.error(reason);
		});
		$scope.reloadData= function(){
			$route.reload();
		
	}
}).controller('contactUsController', function($scope) {
	$scope.addresses = [ {
		houseNo : '10R',
		street : 'Aggarwal Colony',
		city : 'Meerut',
		pincode : 250002
	}, {
		houseNo : '20S',
		street : 'Marwari Colony',
		city : 'Gujrat',
		pincode : 4757445
	} ]
}).controller('infoController', function($scope) {

}).controller('inlineController', function($scope) {
})