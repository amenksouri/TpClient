package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Client;
@Service
public class ServiceClient {
    private static List<Client> list = new ArrayList<Client>();
    static {
        Client c = new Client();
        c.setId(1L);
        c.setName("Client 1");
        c.setAge(28L);
        c.setLocation("Tunisia");
        list.add(c);
        c = new Client();
        c.setId(2L);
        c.setName("Client2");
        c.setAge(30L);
        c.setLocation("Algeria");
        list.add(c);
        c = new Client();
        c.setId(3L);
        c.setName("Client 3");
        c.setAge(31L);
        c.setLocation("Maroc");
        list.add(c);
    }
    public List<Client> getClientList() {
        return list;
    }
    public Client findClientById(long id) {
        Client client = new Client();
        for(Client cl: list)
        {
            if(cl.getId() == id)
            {
                client = cl;
            }
        }
        return client ;
    }

    public void saveClient(Client Cl)
    {
        Client c = new Client();
        c.setId(Long.valueOf(list.size() + 1));
        c.setName(Cl.getName());
        c.setAge(Cl.getAge());
        c.setLocation(Cl.getLocation());
        list.add(c);
    }

    public void updateClient(Client CL)
    {
        for(Client cl: list)
        {
            if(cl.getId() == CL.getId())
            {
                cl.setId(CL.getId());
                cl.setName(CL.getName());
                cl.setAge(CL.getAge());
                cl.setLocation(CL.getLocation());
            }
        }
    }

    public void deleteClientById(long id)
    {
        Client client = new Client();
        for(Client cl: list)
        {
            if(cl.getId() == id)
            {
                client = cl;
            }
        }
        list.remove(client);
    }

}

