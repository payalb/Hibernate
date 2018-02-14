/**
 * 
 */

// / <refernce path= "angular.min.js"/>
var myapp = angular.module("myModule", []).service("myService", function() {

	// var this={}; --implicit .. Call to constructor

	// service returns this object implicitly.

	this.todovar = Math.random();
	this.todoMethodOne = function() {
		
		return this.todovar;
	}
	this.todoMethodTwo = function() {

	}
	// return this; --implicit
})

.factory("myFactory", function() {

	var object = {};

	// factory returns our object, we have to define one. No call to constructor.

	object.todoList = [];
	object.todoMethodOne = function() {
		return " Payal";
	}
	object.todoMethodTwo = function() {

	}
	return object;
}).controller("myController", function($scope,myService, myFactory) {
	//Inject service and factory in controller. So if we want to return anything than object like a function, use factory
	$scope.display= function(){
	$scope.one= myService.todoMethodOne();
	$scope.two= myService.todoMethodOne();
	$scope.three= myFactory.todoMethodOne();
	}
	
})