import grails.converters.XML
import grails.converters.JSON
import javax.swing.text.html.HTML

class CarShowController {
  def scaffold = true

  //GET
  def carShow = {
    def carShowInstance = CarShow.get( params.id )

    if(!carShowInstance) {
      flash.message = "CarShow not found with id ${params.id}"
      redirect(action:list)
    }

    withFormat {
      html {return [ carShowInstance : carShowInstance ]}
      js { render carShowInstance as JSON }
      xml { render carShowInstance as XML}
    }
  }  
}
