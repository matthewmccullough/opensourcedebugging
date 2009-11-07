curl --header "Content-type: application/soap+xml" -i http://localhost:8080/JackedUpApp2/services/carShow --data '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:def="http://DefaultNamespace">
   <soapenv:Header/>
   <soapenv:Body>
      <def:getAllCarShows/>
   </soapenv:Body>
</soapenv:Envelope>'