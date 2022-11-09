package com.mycompany.csc325_singleton;

/**
 *
 * @author MoaathAlrajab
 */
public class AppController {

    private static AppController instance;

    private AppController() {
        System.out.println("Instance created");
    } // End AppController.

    public static AppController getInstance() {
        if (instance == null) {

            synchronized (AppController.class) {
                if (instance == null) {
                    instance = new AppController();
                } // End if.
            } // End synchronized.

        } // End if.
        return instance;
    } // End AppController.

} // End AppController.
