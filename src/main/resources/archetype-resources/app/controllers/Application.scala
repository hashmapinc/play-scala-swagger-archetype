package controllers

import play.api.mvc.{Action, Controller}

class Application extends Controller{

	def redirectDocs = Action {
		Redirect(url = "/webjars/swagger-ui/3.0.19/index.html", queryString = Map("url" -> Seq("/swagger.json")))
	}

}
