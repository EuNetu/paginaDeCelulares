package tads.eaj.ufrn.paginadecelulares.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import tads.eaj.ufrn.paginadecelulares.model.Celular;
import tads.eaj.ufrn.paginadecelulares.service.CelularService;

import javax.validation.Valid;
import java.util.List;


@Controller
public class controllerAdmin {

    private CelularService service;

    @Autowired
    public void setService(CelularService service) {
        this.service = service;
    }

    @RequestMapping({"/index", "/"})
    public String getPage(Model model){
        List<Celular> celularList = service.findAll();
        model.addAttribute("celulares", celularList);
        return "index";
    }

    @RequestMapping("/paginaAdmin")
    public String getAdmin(Model model){
        List<Celular> celularList = service.findAll();
        model.addAttribute("celulares", celularList);
        return "paginaAdmin";
    }

    @RequestMapping("/cadastro")
    public String getFormCadastro(Model model){
        Celular celular = new Celular();
        model.addAttribute("celulares", celular);
        return "cadastro";
    }

    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    public String doSalvar(@ModelAttribute @Valid Celular celular, Errors errors){
        if(errors.hasErrors()){
            return "redirect:/cadastro" ;
        }else{
            service.save(celular);
            return "redirect:/";
        }

    }

    @RequestMapping("/deletar/{id}")
    public String doDelete(@PathVariable(name = "id") Long id){
        service.delete(id);
        return "redirect:/";
    }

    @RequestMapping("/editar/{id}")
    public ModelAndView getFormEdicao(@PathVariable(name = "id") Long id){
        ModelAndView modelAndView = new ModelAndView("edicao");
        Celular celular = service.getById(id);
        modelAndView.addObject("celulares", celular);
        return modelAndView;
    }


}
