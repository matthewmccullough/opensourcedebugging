import java.io.Serializable

class CarShow implements Serializable {

  static constraints = {
    minimumCompetitors(min:3)
  }

  String city
  String state
  String venue
  int minimumCompetitors
}
