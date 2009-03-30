import grails.converters.XML
import grails.converters.JSON
import javax.swing.text.html.HTML

class CarShowRESTController {
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
   * HTTP POST
   * Save a new CarShow
   */
  def save = {
      //println "SAVE PARAMS = " + params
      def carShowInstance = new CarShow(params['carShow'])
      
      def hasErrors = false
      
      //println "NEWCARSHOW obj = " + carShowInstance.properties
      
      //If errors
      if (carShowInstance.hasErrors() || !carShowInstance.save()) {
          hasErrors = true
          //println carShowInstance.errors
      }
      
      //println "HasErrors = ${hasErrors}"
      
      withFormat {
          html { render "ERROR! The SAVE service only supports JSON and XML Accept types"}
          json {
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

  //PUT
  def update = {
      def hasErrors = false
      def carShowInstance = CarShow.get( params.id )
      //println "RAW PARAMS = " + params
      
      if (!carShowInstance) {
        hasErrors = true;
      }
      else {
        carShowInstance.properties = params.carShow
      }
      
      //println "UPDATED CARSHOW = " + carShowInstance.properties
      
      //If errors
      if (carShowInstance.hasErrors() || !carShowInstance.save()) {
          hasErrors = true
      }
      
      withFormat {
        html { render "ERROR! The UPDATE service only supports JSON and XML Accept types"}
        json {
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

  //DELETE
  def delete = {}

  //GET to retrieve list of all objects
  def list = {
    withFormat {
      html { render "ERROR! The LIST ALL SHOWS service only supports JSON and XML Accept types"}
      json { render CarShow.list() as JSON }
      xml { render CarShow.list() as XML}
    }
  }
}
