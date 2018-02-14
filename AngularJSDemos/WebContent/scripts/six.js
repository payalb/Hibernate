/// <reference path="angular.min.js" />

var myApp = angular.module("myModule", []).controller("myController",
		function($scope) {
			$scope.employees = [ {
				name : 'Shreya',
				age : 32,
				cities : [ 'Pune', 'Gurgaon' ]
			}, {
				name : 'Kapil',
				age : 44,
				cities : [ 'Lucknow', 'Goa' ]
			}, {
				name : 'Tanya',
				age : 24,
				cities : [ 'Canada', 'London' ]
			} ];

		})
		
		