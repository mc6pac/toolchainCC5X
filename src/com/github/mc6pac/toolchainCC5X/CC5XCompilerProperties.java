/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mc6pac.toolchainCC5X;

import com.microchip.mplab.nbide.embedded.makeproject.api.configurations.MakeConfiguration;
import com.microchip.mplab.nbide.embedded.makeproject.api.configurations.MakeConfigurationBook;
import java.util.Properties;

public class CC5XCompilerProperties {

    public CC5XCompilerProperties(MakeConfigurationBook projectDescriptor, MakeConfiguration conf, Properties commandLineProperties) {
        commandLineProperties.put("PROCESSOR_NAME", CC5XChipDependentProperties.getProcessorNameForCompiler(conf));
    }
}