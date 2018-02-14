var myapp= angular.module("myModule",[]).controller("controllerOne", function($scope) {
	$scope.name="Topmost"
}).controller("controllerTwo", function($scope) {
	$scope.name="Between"
}).controller("controllerThree", function($scope) {
	$scope.name="Lowest"
})