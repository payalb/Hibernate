/// <reference path="angular.min.js" />

var myApp= angular.module("myModule", []).controller("myController", function($scope){
	$scope.message= "Hello World!!";
	$scope.employees= [{name: 'Ravi', age: 22}, {name: 'Sugandha', age:32}];
})