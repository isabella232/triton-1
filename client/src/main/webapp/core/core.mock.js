'use strict';

angular.module('fabs.boilerplate.core').constant('w11kMockData', {
  'mock': 'data',
  'not' : 'real Data'
});

angular.module('fabs.boilerplate.core').run(function ($httpBackend, w11kMockData) {
  $httpBackend.when('GET', /\/service\/product\/list/).respond(w11kMockData);
});
