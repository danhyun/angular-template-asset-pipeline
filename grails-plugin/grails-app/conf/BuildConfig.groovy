grails.project.work.dir = 'target'

grails.project.fork = false
grails.project.dependency.resolver = "maven"

grails.project.dependency.resolution = {

    inherits 'global'
    log 'warn'
    legacyResolve false

    repositories {
        grailsCentral()
        grailsPlugins()
        mavenCentral()
	jcenter()
    }

    dependencies {
	compile "com.craigburke.angular:angular-template-asset-pipeline:2.0.6"
    }
    plugins {
        build(":release:3.0.1", ":rest-client-builder:1.0.3",":tomcat:7.0.53") {
            export = false
	}
    }
}
