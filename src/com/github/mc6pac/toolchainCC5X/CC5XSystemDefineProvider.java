/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mc6pac.toolchainCC5X;

import com.microchip.mplab.nbide.embedded.makeproject.api.configurations.MakeConfiguration;
import com.microchip.mplab.nbide.embedded.spi.DefineProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ProjectConfiguration;

public class CC5XSystemDefineProvider implements DefineProvider {

    private static final String[] PREDEFINED_MACROS = {
        "__FILE__",
        "__LINE__",
        "__DATE__",
        "__TIME__"
    };
    
    @Override
    public List<String> getDefines(Project project, ProjectConfiguration projectConf, String itemPath) {
        List<String> res = Arrays.asList(PREDEFINED_MACROS);
        res = new ArrayList<>(res);

        MakeConfiguration makeConf = (MakeConfiguration)projectConf;
        
        // These defines can be found by running the compiler in verbose mode.
        res.add("_" + CC5XChipDependentProperties.getProcessorShortNameForCompiler(makeConf));        // _16F690
        res.add("__CoreSet__ " + CC5XChipDependentProperties.getProcessorCoreType(makeConf));         // __CoreSet__ 1200  
        return res;
    }
}
