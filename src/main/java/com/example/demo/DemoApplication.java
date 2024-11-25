package com.example.demo;


import com.example.demo.entity.Client;
import com.example.demo.services.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@SpringBootApplication
/*@RestController*/
public class DemoApplication {
    /*@Autowired
    ServiceClient SCL;
*/
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    /*
    @GetMapping("/clients")
    public List<Client> getList() {
        return SCL.getClientList();
    }
    @GetMapping("/client/{id}")
    public Client getClientById(@PathVariable("id") long id){
        return SCL.findClientById(id);
    }
    @PutMapping("/client/{id}")
    public ResponseEntity<Client>
    updateClient(@PathVariable("id") long id, @RequestBody Client
            clientbody) {
        Client client = SCL.findClientById(id);
        if(client.getName()!=null)
        {
            System.out.println(client);
            client.setName(clientbody.getName());
            client.setAge(clientbody.getAge());
            client.setLocation(clientbody.getLocation());
            return new ResponseEntity<>(client, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }*/

}
