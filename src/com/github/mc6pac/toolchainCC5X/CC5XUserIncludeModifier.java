/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mc6pac.toolchainCC5X;

import com.microchip.mplab.nbide.embedded.makeproject.spi.configurations.UserIncludeModifier;

public class CC5XUserIncludeModifier extends UserIncludeModifier
{
    
    public CC5XUserIncludeModifier() {
        super(CC5XUserIncludeProvider.OPT_ID, CC5XUserIncludeProvider.OPT_PROP);
    }
    
}
