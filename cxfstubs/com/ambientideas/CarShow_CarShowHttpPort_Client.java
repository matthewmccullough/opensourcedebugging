
package com.ambientideas;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2
 * Sun Mar 29 23:00:51 MDT 2009
 * Generated source version: 2.2
 * 
 */

public final class CarShow_CarShowHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("http://DefaultNamespace", "carShow");

    private CarShow_CarShowHttpPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = CarShow_Service.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CarShow_Service ss = new CarShow_Service(wsdlURL, SERVICE_NAME);
        CarShow port = ss.getCarShowHttpPort();  
        
        {
        System.out.println("Invoking getAllCarShows...");
        com.ambientideas.ArrayOfCarShow _getAllCarShows__return = port.getAllCarShows();
        System.out.println("getAllCarShows.result=" + _getAllCarShows__return);


        }
        {
        System.out.println("Invoking getAllCarShowsAsArray...");
        com.ambientideas.ArrayOfCarShow _getAllCarShowsAsArray__return = port.getAllCarShowsAsArray();
        System.out.println("getAllCarShowsAsArray.result=" + _getAllCarShowsAsArray__return);


        }
        {
        System.out.println("Invoking getCarShow...");
        int _getCarShow_in0 = 0;
        com.ambientideas.CarShow_Type _getCarShow__return = port.getCarShow(1);
        System.out.println("getCarShow.result=" + _getCarShow__return);


        }
        {
        System.out.println("Invoking isValidCarShow...");
        int _isValidCarShow_in0 = 0;
        boolean _isValidCarShow__return = port.isValidCarShow(1);
        System.out.println("isValidCarShow.result=" + _isValidCarShow__return);


        }

        System.exit(0);
    }

}
