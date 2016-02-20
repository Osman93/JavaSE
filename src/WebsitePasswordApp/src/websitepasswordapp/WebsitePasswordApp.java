/*
 * WebsitePasswordApp.java
 */

package websitepasswordapp;

import javax.swing.JOptionPane;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class WebsitePasswordApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        String password="osmn+aşr!";
        String aç="şifre";
        
        
        while(!(aç.equalsIgnoreCase(password))){
        aç=JOptionPane.showInputDialog("Şifre girin");
        if(aç.equalsIgnoreCase(password)){        
        show(new WebsitePasswordView(this));
        }
        else{
        JOptionPane.showMessageDialog(null, "Girdiğiniz şifre yanlış");
         
        }
        }
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of WebsitePasswordApp
     */
    public static WebsitePasswordApp getApplication() {
        return Application.getInstance(WebsitePasswordApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(WebsitePasswordApp.class, args);
    }
}
