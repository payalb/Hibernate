/// <reference path="angular.min.js" />

var myApp= angular.module("myModule",[]);

var myController= function ($scope){
	$scope.message= "Hello World!";
	$scope.printMessage= function(){
		return "hello";
	}
}

myApp.controller("myController", myController);