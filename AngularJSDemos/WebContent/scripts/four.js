/// <reference path="angular.min.js" />

var myApp= angular.module("myModule", []).controller("myController", function($scope){
	
	$scope.image= {src: 'Jellyfish.jpg', name: 'Jellyfish Image'};
})