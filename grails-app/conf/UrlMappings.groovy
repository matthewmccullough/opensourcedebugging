class UrlMappings {
    static mappings = {
        "/rest/show/$id?"(resource:"show")
        "/rest/show"(controller:"show"){
            action = [GET:"list"]
        }

        "/$controller/$action?/$id?"{
            constraints {
                // apply constraints here
            }
        }
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
