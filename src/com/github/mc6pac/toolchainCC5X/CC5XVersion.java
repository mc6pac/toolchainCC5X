/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mc6pac.toolchainCC5X;

import com.microchip.crownking.opt.Version;

public class CC5XVersion extends Version {

    private Integer major = 0;
    private Integer minor = 0;
    private String extension = "";
    
    public CC5XVersion(String s) {
        super();
        String[] tokens = s.split("\\W");
        if (tokens.length == 2)
        {
            try
            {
                major = Integer.parseInt(tokens[0]);
                minor = Integer.parseInt(tokens[1].substring(0, 1));
                extension = tokens[1].substring(1);
            }
            catch(NumberFormatException ex)
            {
                extension = tokens[1];
            }
        }
    }

    @Override
    public int compareTo(Version another) {
        
        CC5XVersion ver = (CC5XVersion)another;
        
        if (this.major < ver.major)
            return -1;
        if (this.major > ver.major)
            return 1;
        if (this.minor < ver.minor)
            return -1;
        if (this.minor > ver.minor)
            return 1;
        return this.extension.compareTo(ver.extension);
    }
}
