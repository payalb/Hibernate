/// <reference path="angular.min.js"/>
/// <reference path="angular-route.min.js"/>

var myApp = angular.module("myModule", [ 'ngRoute' ]).config(
		function($routeProvider, $locationProvider) {
			$routeProvider.when('/employee/:id', {
				templateUrl : "Template1/EmpDetails1.html",
				controller : "empController  as empctrl"
			})
			$locationProvider.html5Mode(true);
		}).controller("empController", function( $routeParams) {
	this.id = $routeParams.id;
	this.name = "hey";
})