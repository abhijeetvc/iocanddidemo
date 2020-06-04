package com.springiocanddi.iocanddidemo.impl;

import com.springiocanddi.iocanddidemo.interfaces.DemoInterface;
import org.springframework.stereotype.Component;

@Component
public class DemoImpl implements DemoInterface {

    @Override
    public String checkIocAndDi() {
           return "Hello Di and IoC-----";
    }
}
