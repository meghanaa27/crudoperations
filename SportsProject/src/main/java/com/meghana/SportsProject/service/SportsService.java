package com.meghana.SportsProject.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meghana.SportsProject.model.*;
import com.meghana.SportsProject.repository.*;
@Service
public class SportsService {
	@Autowired
	SportsRepository repo;
	public SportsModel saveinfo(SportsModel productentities)
	{
		return repo.save(productentities);
	}
	public List<SportsModel> showinfo()
	{
		return repo.findAll();
	}
	public Optional<SportsModel> sow(int id)
	{
		return repo.findById(id);
	}
	public String changeinfoid(int id,SportsModel productrepository)
	{
		repo.saveAndFlush(productrepository);
		if(repo.existsById(id))
		{
			return "Changes are updated";
		}
		else
		{
			return " Please, Enter the valid Id";
		}
	}
	public void deleteid(int id)
	{
		repo.deleteById(id);
	}
}
