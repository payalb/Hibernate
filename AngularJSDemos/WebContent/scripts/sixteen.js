/// <reference path="angular.min.js"/>

var myApp = angular.module("myModule", []).controller(
		"myController",
		function($scope, stringService) {

			$scope.processString = function() {
				$scope.outputText = stringService
						.processString($scope.inputText);
			}
		});