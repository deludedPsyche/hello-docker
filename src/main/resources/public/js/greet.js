angular.module('index', [])
.controller('greet', function($scope, $http) {
    $http.get('http://localhost:8001/hello/'+$scope.guestName)
        .then(function(response) {
            	$scope.greeting = response.data;
        	});
});