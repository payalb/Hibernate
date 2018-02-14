package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

class SuperBaseController {
    protected String aField="33";

    protected void aMethod() {
    	System.out.println("hello");
    }
}

@Controller
class OuterMyController extends SuperBaseController {

    class Inner {

        public void itsMethod() {
            // java.lang.IllegalAccessError: tried to access method
            aMethod();
        }
        public void getField() {
            // java.lang.IllegalAccessError: tried to access field
            String s = aField;
            System.out.println(s);
        }
    }

    @RequestMapping("/welcome1")
    void doSomething () {
        // Obviously fine.
        aMethod();
        // Fails in the Inner method call.
        new Inner().itsMethod();

        // Obviously fine.
        String s = aField;
        // Fails in the Inner method call.
        new Inner().getField();
    }
}

