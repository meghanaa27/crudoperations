package com.meghana.SportsProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meghana.SportsProject.model.*;
import com.meghana.SportsProject.service.*;

@RestController

public class SportsController {
	@Autowired
	SportsService sportsproservice;
	@PostMapping("save")
	public SportsModel add(@RequestBody SportsModel productentities)
	{
		return sportsproservice.saveinfo(productentities);
	}
	@GetMapping("show")
	public List<SportsModel>show()
	{
		return sportsproservice.showinfo();
	}
	@GetMapping("get/{id}")
    public Optional<SportsModel>getinfo(@PathVariable int id)
    {
 	   return sportsproservice.sow(id);
    }
    @PutMapping("update/{id}")
    public String modifybyid(@PathVariable int id,@RequestBody SportsModel productentities)
	{
		return sportsproservice.changeinfoid(id,productentities);
	}
    @DeleteMapping("delete/{id}")
    public  void deletemyid(@PathVariable int id)
    {
   	  sportsproservice.deleteid(id);
    }
}
