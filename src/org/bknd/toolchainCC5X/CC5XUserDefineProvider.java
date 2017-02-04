/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bknd.toolchainCC5X;

import com.microchip.mplab.nbide.embedded.makeproject.spi.configurations.UserDefineProvider;

/**
 *
 * @author Patrick
 */
public class CC5XUserDefineProvider extends UserDefineProvider {
    
    public static final String OPT_ID = "CC5X";
    public static final String OPT_PROP = "user-defines";    

    public CC5XUserDefineProvider() {
        super(OPT_ID, OPT_PROP);
    }
    
}
