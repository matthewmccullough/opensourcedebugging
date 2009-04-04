public class ActionTracker {
  static String LIST = "LIST"
  static String SAVE = "SAVE"
  static String UPDATE = "UPDATE"
  static String DELETE = "DELETE"
  static String SHOW = "SHOW"
  
  static Map actions = new HashMap()
  
  static void track(String action, o) {
    log(action, o)
  }
  
  static void track(String action, List ol) {
    ol.each {
      track(action, it)
    }
  }
  
  static printHistory() {
    println "PRINTING COMPLETE HISTORY ->"
    actions.each {
      println "Car Show had an action: ${it.key} on object ${it.value}"
    }
  }
  
  private static log(String action, o) {
    println "Car Show had an action: ${action} on object ${o}"
    actions.put(new Date(), action + " on " + o);
  }
}