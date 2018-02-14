var myapp = angular.module("myModule", [ "ui.router" ]).config(
		function($stateProvider) {
			$stateProvider.state("home", {
				url : "/home",
				templateUrl : "Template1/Home.html",
				controller : "homeController"
			}).state("contactUs", {
				url : "/contactUs",
				templateUrl : "Template1/ContactUs.html",
				controller : "contactUsController"
			})
		}).controller("homeController", function($scope, $state) {
	$scope.homeMessage = "hello";
	$scope.reloadData = function() {
		alert("reloaded");
		$state.reload();
	}

}).controller("contactUsController",function($scope) {
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
})