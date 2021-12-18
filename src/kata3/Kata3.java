package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        
        histogram.increment("hotmail.com");
                
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        
        histogram.increment("outlook.es");
        histogram.increment("outlook.es");
        histogram.increment("outlook.es");
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        
        
        new HistogramDisplay(histogram).execute();
    }
    
}
