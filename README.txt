#Script for creating the app.

grails create-app
jackedupapp

grails create-controller
Show

grails create-domain-class
Show

#Add four fields
String city
String state
String venue
int minimumCompetitors
#and a constraint
minimumCompetitors(min:3)

#Edit the ShowController, commenting out the index and adding the scaffolding
//def index = { }
def scaffold = Show

#Add bootstrap data
#Edit the BootStrap.groovy file and in the init add:
//Test data
new Show(city:"Boston", state: "MA", venue: "BigDigDome", minimumCompetitors: 7).save()
new Show(city:"Albuquerque", state: "NM", venue: "DustDome", minimumCompetitors: 5).save()

#Add the grails-ui JavaScript libraries
#http://www.grails.org/plugin/grails-ui
grails install-plugin yui
grails install-plugin bubbling
grails install-plugin grails-ui

#Add resource mapping
"/rest/show/$id?"(resource:"show")