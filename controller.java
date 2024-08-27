package com.coffee.barista;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/barista")
public class controller {
    
    @Autowired
    Repository repo;

    @PostMapping("/savedata")
    public String postMethodName(@RequestBody coffeeModel c) {
        repo.save(c);
        return "Inserted Success";
    }
    @GetMapping("/getdata")         //database to frontend values print in list 
	List<coffeeModel> getdata(){
		return repo.findAll();
	}
}
