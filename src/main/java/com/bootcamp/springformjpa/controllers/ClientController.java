package com.bootcamp.springformjpa.controllers;

import com.bootcamp.springformjpa.models.dao.IClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

    @Autowired
    private IClientDAO iClientDAO;

    @GetMapping("/list")
    public String listAll(Model model) {
        model.addAttribute("title", "Client list");
        model.addAttribute("clients", iClientDAO.findAll());
        return "list";
    }
}
