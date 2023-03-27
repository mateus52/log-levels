public class LogLevels {

    public static String message(String logLine) {
        String[] retornoSplit = null;
       if(logLine.indexOf("[ERROR]") != -1 || logLine.indexOf("[WARNING]") != -1 || logLine.indexOf("[INFO]") != -1){
           retornoSplit = logLine.split(":");
       }   
        return retornoSplit[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] retornoSplit = logLine.split(":");
        return retornoSplit[0].trim().toLowerCase().replace("[", "").replace("]", "");
    }

    public static String reformat(String logLine) {
        String[] retornoSplit = logLine.split(":");
        return retornoSplit[1].trim() + " " + retornoSplit[0].toLowerCase().replace("[", "(").replace("]", ")");
    }
}
