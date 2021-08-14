package tads.eaj.ufrn.paginadecelulares.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class controllerAdmin {

    @RequestMapping({"/index", "/"})
    public String getPage(){
        return "index";
    }


}
