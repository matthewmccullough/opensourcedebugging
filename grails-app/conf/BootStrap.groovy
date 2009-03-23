class BootStrap {

     def init = { servletContext ->
       new Show(city:"Boston", state: "MA", venue: "BigDigDome", minimumCompetitors: 7, eventDate: new Date()).save()
       new Show(city:"Albuquerque", state: "NM", venue: "DustDome", minimumCompetitors: 5, eventDate: new Date()).save()
     }
     def destroy = {
     }
} 