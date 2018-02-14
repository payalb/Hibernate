var myModule = angular.module("myModule", ['ngRoute']).config(
		 function($routeProvider) {

			$routeProvider.when('/Home', {
				templateUrl : 'Template1/Home.html',
				controller : 'homeController',
				caseInsensitiveMatch: true
			}).when('/info', {
				templateUrl : 'Template1/Info.html',
				controller : 'infoController'
			}).when('/contactUs', {
				templateUrl : 'Template1/ContactUs.html',
				controller : 'contactUsController'
			}). otherwise({
	            redirectTo: '/'
	        })
		} ).controller('homeController', function($scope) {
	$scope.homeMessage = "Home Page"
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

})