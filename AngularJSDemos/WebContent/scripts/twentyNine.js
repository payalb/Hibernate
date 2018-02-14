var myModule = angular.module("myModule", ['ngRoute']).config(
		 function($routeProvider) {

			$routeProvider.when('/home', {
				templateUrl : 'Templates/Home.html',
				controller : 'homeController'
			}).when('/info', {
				templateUrl : 'Templates/Info.html',
				controller : 'infoController'
			}).when('/contactUs', {
				templateUrl : 'Templates/ContactUs.html',
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