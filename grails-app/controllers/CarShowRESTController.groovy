import grails.converters.XML
import grails.converters.JSON
import javax.swing.text.html.HTML

class CarShowRESTController {
  def scaffold = CarShow

  /**
   * HTTP GET
   * Retrieve one CarShow
   */
  def show = {
    def carShowInstance = CarShow.get( params.id )
    
    if (carShowInstance == null) {
      render "RECORDNOTFOUND"
      return
    }
    
    withFormat {
      html { render "ERROR! The SHOW RETRIEVAL service only supports JSON and XML Accept types"}
      json { render carShowInstance as JSON }
      xml { render carShowInstance as XML}
    }
  }

  /**
   * HTTP PUT
   * Save a new CarShow
   */
  def save = {
      def carShowInstance = new CarShow(params)
      def hasErrors = false
      
      //If errors
      if (carShowInstance.hasErrors() || !carShowInstance.save()) {
          hasErrors = true
      }
      
      println "HasErrors = ${hasErrors}"
      withFormat {
          js {
            if (hasErrors) {
              render carShowInstance.errors as JSON
            }
            else {
              render carShowInstance as JSON 
            }
          }
          xml {
            if (hasErrors) {
              render carShowInstance.errors as XML
            }
            else {
              render carShowInstance as XML
            }
          }
      }
  }

  //POST
  def update = {
      def carShowInstance = CarShow.get( params.id )
      if(carShowInstance) {
          if(params.version) {
              def version = params.version.toLong()
              if(carShowInstance.version > version) {
                  
                  carShowInstance.errors.rejectValue("version", "carShow.optimistic.locking.failure", "Another user has updated this CarShow while you were editing.")
                  //render(view:'edit',model:[carShowInstance:carShowInstance])
                  render carShowInstance.errors as XML
                  return
              }
          }
          carShowInstance.properties = params
          if(!carShowInstance.hasErrors() && carShowInstance.save()) {
              flash.message = "CarShow ${params.id} updated"
              redirect(action:carShow,id:carShowInstance.id)
          }
          else {
              render(view:'edit',model:[carShowInstance:carShowInstance])
          }
      }
      else {
          flash.message = "CarShow not found with id ${params.id}"
          render carShowInstance.errors as XML
      }
  }

  //DELETE
  def delete = {}

  //GET to retrieve list of all objects
  def list = {
    //params.max = Math.min( params.max ? params.max.toInteger() : 10,  100)

    withFormat {
      //html {[ carShowInstanceList: CarShow.list( params ), carShowInstanceTotal: CarShow.count() ]}
      html { render "ERROR! The LIST ALL SHOWS service only supports JSON and XML Accept types"}
      json { render CarShow.list() as JSON }
      xml { render CarShow.list() as XML}
    }
  }
}
