/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mc6pac.toolchainCC5X;

import com.microchip.mplab.nbide.embedded.makeproject.spi.configurations.UserDefineModifier;

public class CC5XUserDefineModifier extends UserDefineModifier {
    
    public CC5XUserDefineModifier() {
        super(CC5XUserDefineProvider.OPT_ID, CC5XUserDefineProvider.OPT_PROP);
    }
}
