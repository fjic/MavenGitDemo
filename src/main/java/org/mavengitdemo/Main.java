package org.mavengitdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private final Logger log = LoggerFactory.getLogger(Main.class);
    
    public Main() {
        log.debug("En constructor...");
    }
    
    public void run() {
        log.debug("En run...");
        
        log.info("Aplicacion ejecutada...!");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main().run();
    }
}
