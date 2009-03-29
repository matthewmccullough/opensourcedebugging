import grails.converters.XML
import grails.converters.JSON
import javax.swing.text.html.HTML

class CarShowRESTController {
  def scaffold = CarShow

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
  
  def create = {
      def carShowInstance = new CarShow()
      carShowInstance.properties = params
      return ['carShowInstance':carShowInstance]
  }

  //PUT
  def save = {
      def carShowInstance = new CarShow(params)
      def hasErrors = false
      
      //If errors
      if (carShowInstance.hasErrors() || !carShowInstance.save()) {
          hasErrors = true
      }
      
      println "HasErrors = ${hasErrors}"
      withFormat {
          html {
              if (hasErrors)
                render(view:'create',model:[carShowInstance:carShowInstance])
              else {
                flash.message = "CarShow ${carShowInstance.id} created"
                redirect(action:carShow,id:carShowInstance.id)
              }
          }
          js { render carShowInstance as JSON }
          xml { render carShowInstance as XML}
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
                  render(view:'edit',model:[carShowInstance:carShowInstance])
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
          redirect(action:edit,id:params.id)
      }
  }

  //DELETE
  //def delete = {}

  def list = {
    params.max = Math.min( params.max ? params.max.toInteger() : 10,  100)

    withFormat {
      html {[ carShowInstanceList: CarShow.list( params ), carShowInstanceTotal: CarShow.count() ]}
      js { render CarShow.list() as JSON }
      xml { render CarShow.list() as XML}
    }
  }
}
