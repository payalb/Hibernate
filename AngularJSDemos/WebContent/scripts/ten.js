/// <reference path="scripts/angular.min.js"/>

var myApp= angular.module("myModule", []).controller("myController", function($scope){

	$scope.employees= [{name:'Ben',dob:'26/12/1985',gender: 'Male',salary: 35343.45},
	                   {name:'Shweta',dob: new Date("November 24, 1985"),gender: 'Female',salary: 364.34},
	                   {name:'Dev',dob:'06/05/1997',gender: 'Male',salary: 4763.47},
	                   {name:'Dilip',dob:'23/02/1943',gender: 'Male',salary: 74373.45},
	                   {name:'Devpriya',dob:'29/10/1924',gender: 'Female',salary: 4364.33}];
	
	$scope.loadValues= function(){
		
	alert(numberofRows);
	}
	
})