class CarShow {

  static constraints = {
    minimumCompetitors(min:3)
  }

  String city
  String state
  String venue
  int minimumCompetitors
  
  String toString() {
    return "CARSHOW [City: ${city}, State: ${state}, Venue: ${venue}, minComp: ${minimumCompetitors}]"
  }
}
