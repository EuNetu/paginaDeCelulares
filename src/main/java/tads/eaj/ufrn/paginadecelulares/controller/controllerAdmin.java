package tads.eaj.ufrn.paginadecelulares.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import tads.eaj.ufrn.paginadecelulares.service.CelularService;


@Controller
public class controllerAdmin {

    CelularService service;

    @Autowired
    public void setService(CelularService service) {
        this.service = service;
    }

    @RequestMapping({"/index", "/"})
    public String getPage(){
        return "index";
    }


}
