curl -i http://localhost:8088/mockcarShowHttpBinding --data '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:def="http://DefaultNamespace">
   <soapenv:Header/>
   <soapenv:Body>
      <def:getAllCarShows/>
   </soapenv:Body>
</soapenv:Envelope>'