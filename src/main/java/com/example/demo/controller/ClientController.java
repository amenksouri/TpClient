package com.example.demo.controller;

import com.example.demo.entity.Client;
import com.example.demo.services.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {
    @Autowired
    ServiceClient SCL;
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("allemplist", SCL.getClientList());
        return "index";
    }

    @GetMapping("/addnew")
    public String addNewClient(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        return "newclient";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Client client) {
        SCL.saveClient(client);
        return "redirect:/";
    }

    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute("employee") Client client) {
        SCL.updateClient(client);
        return "redirect:/";
    }
    @GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") long id,Model model) {
        Client client = SCL.findClientById(id);
        model.addAttribute("client", client);
        return "update";
    }


    @GetMapping("/deleteClient/{id}")
    public String deleteThroughId(@PathVariable(value = "id") long id) {
        SCL.deleteClientById(id);
        return "redirect:/";
    }


}
