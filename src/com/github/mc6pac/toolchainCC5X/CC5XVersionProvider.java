/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mc6pac.toolchainCC5X;

import com.microchip.mplab.nbide.embedded.api.LanguageToolSupport;
import com.microchip.mplab.nbide.embedded.spi.VersionProvider;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;

public class CC5XVersionProvider implements VersionProvider {

    @Override
    public String getVersion(String directory) {
        if (directory == null || directory.isEmpty())
            return "";
        
        String pathToCompiler = directory + File.separator + "cc5x.exe";

        try
        {
            // Call CC5X.exe with non-existing option "-S" to get an error, including version info.
            // The compiler has no option to output only version info.
            // If called without args, the compiler pauses after each screen full and waits for input to continue.
            Matcher m = LanguageToolSupport.findInOutput(pathToCompiler, new String [] {"-S"}, "CC5X.+(\\d\\.\\d[A-Z]?)", true, true);
            if (m == null) {
                return "";
            }
            return m.group(1);
        }
        catch (IOException ex)
        {
        }

        return "";
    }    
}
