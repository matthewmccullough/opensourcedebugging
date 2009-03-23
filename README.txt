#Script for creating the app.

grails create-app JackedUpApp

grails create-controller show

grails create-domain-class show

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

################################################
#Custom URL mapping
################################################
#http://www.grails.org/URL+mapping
#Add resource mapping

"/rest/show/$id?"(resource:"show")

###############################################
### Add controller closures
###############################################
#We have to fake out the scaffolding for the HTML
#http://fisheye.codehaus.org/browse/~raw,r=8877/grails/trunk/grails/src/grails/templates/scaffolding/list.gsp
#http://www.grails.org/Scaffolding
#
#Content Type detection/negotiation
#http://grails.org/doc/1.1.x/guide/6.%20The%20Web%20Layer.html#6.8%20Content%20Negotiation
#
#Automatic parsing with content negotiation
#http://blog.devnull.org/2008/08/30/dude-whered-my-inputstream-go/
#It will auto-convert XML POST data to an XmlSlurper GPathResult

CODE HERE

###############################################
### Unfuddle, as an example of APIs for REST
###############################################
#http://unfuddle.com/docs/api/projects
#/api/v1/projects[GET, POST]
#/api/v1/projects/{id}[GET, PUT, DELETE]
#/api/v1/projects/by_short_name/{short_name}[GET]

curl -i -u username:password -X GET \
  -H 'Accept: application/xml' \
  http://mysubdomain.unfuddle.com/api/v1/projects.xml

###############################################
### Grails Web Services, including SOAP
###############################################
#http://grails.org/doc/1.1.x/guide/13.%20Web%20Services.html
#
#static mappings = {
#   "/product/$id?"(resource:"product")
#}
#What this does is map the URI /product onto a ProductController. Each HTTP method such as GET, PUT, POST and DELETE map to unique actions within the controller as outlined by the table below:
#
#Method	Action
#GET	show
#PUT	update
#POST	save
#DELETE	delete
#
#You can alter how HTTP methods by using the capability of URL Mappings to map to HTTP methods:
#
#"/product/$id"(controller:"product"){
#    action = [GET:"show", PUT:"update", DELETE:"delete", POST:"save"]
#}
#However, unlike the resource argument used previously, in this case Grails will not provide automatic XML or JSON marshaling for you unless you specify the parseRequest argument in the URL mapping:
#
#"/product/$id"(controller:"product", parseRequest:true){
#    action = [GET:"show", PUT:"update", DELETE:"delete", POST:"save"]
#}
#

############################################
### URL to test the service
############################################
http://localhost:8080/JackedUpApp2/show/list
