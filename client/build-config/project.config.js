'use strict';

module.exports = {


    build: {
        output: {
              dir: 'build/fabs'
            },
        server: {
            proxies: [
                {
                    context: '/service',
                    host: 'localhost',
                    port: 8080,
                    https: false,
                    changeOrigin: true
                }
            ]
        },
        sass: {
            enabled: false
        },
        less: {
            enabled: true
        },
        blessed: {
            enabled: false
        },
        jshint: {
            runInDev: true,
            runInDist: true
        },
        bower: {
            runInDev: false,
            runInDist: false
        },
        spec: {
            runInDev: false,
            runInDist: true,
            browsers: ["PhantomJS"]
        },
        e2e: {
            runInDev: false,
            runInDist: false,
            browsers: ["PhantomJS"]
        },
        ngAnnotate: {
            enabled: true
        }
    },

    app: {
        /**
         * Specifies which files to include to the prepared / compiled application.
         */
        files: {
            root: 'src/main/webapp'
        }
    },

    vendor: {
        base: 'node_modules',
        files: {
            js: [
                'angular/angular.js',
                'angular-animate/angular-animate.js',
                'angular-growl-notifications/dist/angular-growl-notifications.js',
                'angular-translate/dist/angular-translate.js',
                'angular-translate/dist/angular-translate-loader-static-files/angular-translate-loader-static-files.js',
                'angular-ui-router/release/angular-ui-router.js',
                'lodash/dist/lodash.compat.js'
            ],
            js_mock: [
                // required to run spec tests
                'angular-mocks/angular-mocks.js'
            ],
            js_spec: [],
            js_e2e: [],
            css: [
                'animate.css/animate.css',
                'bootstrap/dist/css/bootstrap.css'
            ],
            assets: [
                'font-awesome/fonts/*.*'
            ]
        }
    }

};
