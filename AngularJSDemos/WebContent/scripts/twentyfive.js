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
	
		/*$http({
			url:'http://www.webservicex.net/CurrencyConvertor.asmx/ConversionRate?FromCurrency=INR&ToCurrency=EUR',
			method: 'GET',
			headers: 'Access-Control-Allow-Origin=*'
		}).then(function(response){
			$scope.homeMessage= response.data;
			$log.info(response);
		}, function(reason){
			$scope.homeMessage= reason.data;
			$log.error(reason);
		});*/
			
			var url="http://public-api.wordpress.com/rest/v1/sites/wtmpeachtest.wordpress.com/posts?callback=JSON_CALLBACK";
			var responsePromise = $http.jsonp( url).success(function(json) {
				alert(json.found);
				$scope.homeMessage= json.found;
			});
					/*
		             {  params : {
		            	 FromCurrency : "INR"
		                  ,ToCurrency : "EUR"
		                }
		              }*/
		            
		

		$scope.reloadData= function(){
			alert($scope.homeMessage);
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
}).controller('infoController', function($scope, $route) {
/*$locationChangeStart*/
	/*$scope.$on("$routeChangeStart", function(event, next, current) {
		if(!confirm("Are you sure you want to navigate to "+ next.$$route.originalPath)){
			event.preventDefault();
		}
		
	}*/
	
	$scope.$on("$locationChangeStart", function(event, next, current) {
		if(!confirm("Are you sure you want to navigate to "+ next)){
			event.preventDefault();
		}
		
	})

}).controller('inlineController', function($scope) {
})