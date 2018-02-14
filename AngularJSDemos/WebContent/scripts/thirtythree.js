///<reference path="angular.min.js"/>
///<reference path="angular-ui-router.min.js"/>

var myapp = angular.module("myModule", [ "ui.router" ]).config(
		function($stateProvider, $urlMatcherFactoryProvider, $urlRouterProvider, $locationProvider) {
			
			$urlRouterProvider.otherwise("/home");
			$stateProvider.state("home", {
				url : "/home",
				templateUrl : "Template1/Home.html",
				controller : "homeController",
				data:
					{
					homeMessage: "hello"
					}
			}).state("contactUs", {
				url : "/contactUs",
				templateUrl : "Template1/ContactUs.html",
				controller : "contactUsController"
			}).state("employee", {
				url : "/employees/:id",
				templateUrl : "Template1/Employee.html",
				controller : "employeeController as empCtrl"
			})
			$urlMatcherFactoryProvider.caseInsensitive(true);
			$locationProvider.html5Mode(true);
		}).controller("homeController", function($scope, $state) {
	$scope.homeMessage = $state.current.data.homeMessage;
	$scope.reloadData = function() {
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
}).controller("employeeController", function( $stateParams, $state) {
	this.id= $stateParams.id;
	this.emplData=	[{name:'Ben', id:1},{name:'Dev', id:2}, {name:'Ashish', id:3},{name:'Anu', id:4},{name:'Divya', id:5}];

});