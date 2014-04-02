"use strict";

var angularMovieApp = angular.module('angularMovieApp', ['$strap.directives']);

angularMovieApp.config(function($routeProvider) {
    $routeProvider
        .when('/home', {
            templateUrl: 'partials/home.html',
            controller : 'homeController'
        })
        .when('/movies', {
            templateUrl: 'partials/movies.html',
            controller : 'moviesController'
        })
        .when('/movies/edit/:id', {
            templateUrl: 'partials/edit.html',
            controller: 'editMovieController'
        })
        .when('/shapes', {
            templateUrl:'partials/shapes.html',
            controller: 'shapesController'
        })
        .when('/movie/add',{
            templateUrl:'partials/addMovie.html',
            controller:'addMovieController'
        })
        .otherwise({
            redirectTo: '/home'
});
});