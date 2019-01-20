var app = angular.module("firstModule", ["ui.router"]).config(
    function($stateProvider,$urlRouterProvider) {
        $urlRouterProvider.otherwise("/welcome");
        $stateProvider.state("welcome",{
            url:"/welcome",
            templateUrl:"html/welcome.html"
        })

});