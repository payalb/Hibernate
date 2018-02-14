/// <reference path="angular.min.js"/>
/// <reference path="angular-route.min.js"/>

var myApp = angular.module("myModule", [ 'ngRoute' ]).config(
		function($routeProvider, $locationProvider) {
			$routeProvider.when('/employee/:id', {
				templateUrl : "Template1/EmpDetails.html",
				controller : "empController"
			})/*.when('/employee', {
				templateUrl : "Template/WebsiteContactUs.html",
				controller : "myController"
			})*/
			$locationProvider.html5Mode(true);
		}).controller("empController", function($scope, $routeParams) {
	$scope.id = $routeParams.id;
	$scope.name = "hey";
})/*.controller("myController", function($scope) {
	
})*/