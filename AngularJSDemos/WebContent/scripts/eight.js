/// <reference path="scripts/angular.min.js" />

var myapp = angular.module("myModule", []).controller("myController",
		function($scope) {
			$scope.people = [ {
				name : "Ram",
				likes : 0,
				dislikes : 0
			}, {
				name : "Ravi",
				likes : 0,
				dislikes : 0
			} ];
			$scope.incrementLikes = function(person) {
				person.likes = ++person.likes;
			}
			$scope.incrementDisLikes = function(person) {
				person.dislikes = ++person.dislikes;
			}
		})