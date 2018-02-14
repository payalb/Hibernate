var myapp= angular.module("myModule",[]).controller("controllerOne", function() {
	this.name="Topmost"
}).controller("controllerTwo", function() {
	this.name="Between"
}).controller("controllerThree", function() {
	this.name="Lowest"
})