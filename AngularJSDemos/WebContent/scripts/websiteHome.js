/// <reference path="angular.min.js"/>
/// <reference path="angular-ui-router.min.js"/>

var myModule = angular.module("myModule", [ 'ui.router' ]).config(
		function($stateProvider, $locationProvider, $urlRouterProvider,$urlMatcherFactoryProvider) {
			
			$urlRouterProvider.otherwise("/Home");
			$urlMatcherFactoryProvider.caseInsensitive(true);
			$stateProvider.state('OnlineTrainingForm', {
				url: '/OnlineTrainingForm',
				templateUrl : 'Template/WebsiteEnrollment1.html',
				controller : 'enrollmentController'
			}).state('ClassroomTrainingForm', {
				url: '/ClassroomTrainingForm',
				templateUrl : 'Template/WebsiteEnrollment.html',
				controller : 'enrollmentController'
			}).state('Projects', {
				url: '/Projects',
				templateUrl : 'Template/WebsiteProjects.html',
				controller : 'projectController'
			}).state('ContactUs', {
				url: '/ContactUs',
				templateUrl : 'Template/WebsiteContactUs.html',
				controller : 'contactUsController'
			}).state('Syllabus', {
				url: '/Syllabus',
				templateUrl : 'Template/WebsiteSyllabus.html',
				controller : 'syllabusController'
			}).state('StudyMaterial', {
				url: '/StudyMaterial',
				templateUrl : 'Template/SM/Index.html',
				controller : 'smController'
			}).state('PractiseQuestions', {
				url: '/PractiseQuestions',
				templateUrl : 'Template/PQ/Index.html',
				controller : 'pqController'
			}).state('Home',{
				url: '/Home',
				templateUrl : 'Template/WebsiteHome.html',
				controller : 'homeController'
			})

			$locationProvider.html5Mode(true);
		}).controller('enrollmentController', function($scope) {

	$scope.courses = [ {
		name : "Core Java",
		fees : 7000
	}, {
		name : "Java 7 Advanced Features",
		fees : 7000
	}, {
		name : "Java 8 Advanced Features",
		fees : 7000
	}, {
		name : "Java Design Patterns",
		fees : 17000
	}, {
		name : "Web Development:Jsp, Servlets",
		fees : 7000
	}, {
		name : "EJB",
		fees : 7000
	}, {
		name : "JMS",
		fees : 7000
	}, {
		name : "ActiveMQ",
		fees : 7000
	}, {
		name : "Apache Camel",
		fees : 9000
	}, {
		name : "SQL",
		fees : 8000
	}, {
		name : "PL/SQL",
		fees : 8000
	}, {
		name : "AngularJS",
		fees : 10000
	}, {
		name : "JPA/ Hibernate",
		fees : 7000
	}, {
		name : "Spring",
		fees : 7000
	}, {
		name : "WebServices",
		fees : 8000
	} ];

	$scope.calculateFees = function() {
		var fee = 0;
		for (var i = 0; i < $scope.user.courses.length; i++) {
			fee = fee + $scope.user.courses[i].fees;
		}
		;
		$scope.user.fees = fee + " Rs.";
	}

	$scope.submitForm = function(valid) {
		alert("We will contact you soon!");
	}

}).controller('homeController', function($scope) {

}).controller('contactUsController',
		function($scope, $location, $anchorScroll) {
			$scope.scrollTo = function(scrollLocation) {
				$location.hash(scrollLocation);
				$anchorScroll();
			}
		}).controller('projectController', function($scope) {

}).controller('syllabusController', function($scope) {
	$scope.courses = [ {
		name : "Core Java",
		template : "Template/Syllabus/CoreJava.html"
	}, {
		name : "Java 7 Advanced Features",
		template : "Template/Syllabus/Java7.html"
	}, {
		name : "Java 8 Advanced Features",
		template : "Template/Syllabus/Java8.html"
	}, {
		name : "Java Design Patterns",
		template : "Template/Syllabus/DesignPattern.html"
	}, {
		name : "Web Development:Jsp, Servlets",
		template : "Template/Syllabus/WebDev.html"
	}, {
		name : "EJB",
		template : "Template/Syllabus/EJB.html"
	}, {
		name : "JMS",
		template : "Template/Syllabus/JMS.html"
	}, {
		name : "ActiveMQ",
		template : "Template/Syllabus/ActiveMQ.html"
	}, {
		name : "Apache Camel",
		template : "Template/Syllabus/Camel.html"
	}, {
		name : "SQL",
		template : "Template/Syllabus/SQL.html"
	}, {
		name : "PL/SQL",
		template : "Template/Syllabus/PLSQL.html"
	}, {
		name : "AngularJS",
		template : "Template/Syllabus/AngularJS.html"
	}, {
		name : "JPA/ Hibernate",
		template : "Template/Syllabus/JPA.html"
	}, {
		name : "Spring",
		template : "Template/Syllabus/Spring.html"
	}, {
		name : "WebServices",
		template : "Template/Syllabus/Webservices.html"
	}, {
		name : "Enterprise Architect",
		template : "Template/Syllabus/EA.html"
	}, {
		name : "Javascript/HTML5",
		template : "Template/Syllabus/JS.html"
	}, {
		name : "SQL Tuning",
		template : "Template/Syllabus/SQLTuning.html"
	} ];

}).controller('pqController', function($scope) {
	
	$scope.courses = [ {
		name : "Core Java",
		url : "Template/PQ/CoreJava.html"
	}, {
		name : "Java 7 Advanced Features",
		url : "Template/PQ/Java7.html"
	}, {
		name : "Java 8 Advanced Features",
		url : "Template/PQ/Java8.html"
	}, {
		name : "Java Design Patterns",
		url : "Template/PQ/DesignPattern.html"
	}, {
		name : "Web Development:Jsp, Servlets",
		url : "Template/PQ/WebDev.html"
	}, {
		name : "EJB",
		url : "Template/PQ/EJB.html"
	}, {
		name : "JMS",
		url : "Template/PQ/JMS.html"
	}, {
		name : "ActiveMQ",
		url : "Template/PQ/ActiveMQ.html"
	}, {
		name : "Apache Camel",
		url : "Template/PQ/Camel.html"
	}, {
		name : "SQL",
		url : "Template/PQ/SQL.html"
	}, {
		name : "PL/SQL",
		url : "Template/PQ/PLSQL.html"
	}, {
		name : "AngularJS",
		url : "Template/PQ/AngularJS.html"
	}, {
		name : "JPA/ Hibernate",
		url : "Template/PQ/JPA.html"
	}, {
		name : "Spring",
		url : "Template/PQ/Spring.html"
	}, {
		name : "WebServices",
		url : "Template/PQ/Webservices.html"
	} ];

	$scope.showCourse = function(){
		alert("am in");
		alert($scope.course.name);
		/*if($scope.course.name){
			isShowCourse = true;
		}else{
			isShowCourse = false;
		}*/
	}
}).controller('smController', function($scope) {
	
	$scope.message="hello";
	$scope.courses = [ {
		name : "Core Java",
		template : "Template/SM/CoreJava.html"
	}, {
		name : "Java 7 Advanced Features",
		template : "Template/SM/Java7.html"
	}, {
		name : "Java 8 Advanced Features",
		template : "Template/SM/Java8.html"
	}, {
		name : "Java Design Patterns",
		template : "Template/SM/DesignPattern.html"
	}, {
		name : "Web Development:Jsp, Servlets",
		template : "Template/SM/WebDev.html"
	}, {
		name : "EJB",
		template : "Template/SM/EJB.html"
	}, {
		name : "JMS",
		template : "Template/SM/JMS.html"
	}, {
		name : "ActiveMQ",
		template : "Template/SM/ActiveMQ.html"
	}, {
		name : "Apache Camel",
		template : "Template/SM/Camel.html"
	}, {
		name : "SQL",
		template : "Template/SM/SQL.html"
	}, {
		name : "PL/SQL",
		template : "Template/SM/PLSQL.html"
	}, {
		name : "AngularJS",
		template : "Template/SM/AngularJS.html"
	}, {
		name : "JPA/ Hibernate",
		template : "Template/SM/JPA.html"
	}, {
		name : "Spring",
		template : "Template/SM/Spring.html"
	}, {
		name : "WebServices",
		template : "Template/SM/Webservices.html"
	} ];

});
