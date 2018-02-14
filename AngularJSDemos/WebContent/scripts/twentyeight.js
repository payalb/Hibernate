///<reference path="angular.min.js"/>
///<reference path="angular-ui-router.min.js"/>

var myapp = angular.module("myModule", [ "ui.router" ]).config(
		function($stateProvider, $urlMatcherFactoryProvider, $urlRouterProvider) {
			
			$urlRouterProvider.otherwise("/home");
			$stateProvider.state("home", {
				url : "/home",
				templateUrl : "Template1/Home.html",
				controller : "homeController"
			}).state("contactUs", {
				url : "/contactUs",
				templateUrl : "Template1/ContactUs.html",
				controller : "contactUsController"
			}).state("employee", {
				url : "/employees/:id",
				templateUrl : "Template1/Employee.html",
				controller : "employeeController",
				controllerAs: "empCtrl"
			})
			$urlMatcherFactoryProvider.caseInsensitive(true);
			
		}).controller("homeController", function($scope, $state) {
	$scope.homeMessage = "hello";
	$scope.reloadData = function() {
		alert("reloaded");
		$state.reload();
	}

}).controller("contactUsController", function($scope) {
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
}).controller("employeeController", function( $stateParams) {
	this.id= $stateParams.id;
	this.emplData=[{name:'Ben', id:1},{name:'Dev', id:2}, {name:'Ashish', id:3},{name:'Anu', id:4},{name:'Divya', id:5}];
});