"use strict";

angularMovieApp.factory("Movie", function ($http) {
    var API_URI = '/server/api';

    return {

        fetch : function() {
            return $http.get(API_URI+'/movies.json');
        },

        create : function(movie) {
            return  $http.post(API_URI+"/movies", movie);
        },

        remove  : function(id) {
            return $http.delete(API_URI +'/movies/' + id);
        },

        fetchOne : function(id) {
            return $http.get(API_URI + '/movies/' + id);
        },

        update : function(movie) {
            return $http.put(API_URI+'/movies', movie);
        }

    };

});
