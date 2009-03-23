import grails.converters.XML
import grails.converters.JSON
import javax.swing.text.html.HTML

class ShowController {
  def scaffold = true

  //GET
  def show = {}

  //PUT
  def save = {}

  //POST
  def update = {}

  //DELETE
  def delete = {}

  def list = {
    params.max = Math.min( params.max ? params.max.toInteger() : 10,  100)

    withFormat {
      html {[ showInstanceList: Show.list( params ), showInstanceTotal: Show.count() ]}
      js { render Show.list() as JSON }
      xml { render Show.list() as XML}
    }
  }
}
