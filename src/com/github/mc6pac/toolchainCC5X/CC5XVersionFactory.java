/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mc6pac.toolchainCC5X;

import com.microchip.crownking.opt.Version;

public class CC5XVersionFactory implements Version.Factory {

    @Override
    public Version create(String string) {
        return new CC5XVersion(string);
    }
}
