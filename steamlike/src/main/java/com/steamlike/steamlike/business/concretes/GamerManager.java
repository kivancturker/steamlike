package com.steamlike.steamlike.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steamlike.steamlike.business.abstracts.GamerService;
import com.steamlike.steamlike.business.requests.CreateGamerRequest;
import com.steamlike.steamlike.core.mernis.abstracts.PersonCheckService;
import com.steamlike.steamlike.core.results.ErrorResult;
import com.steamlike.steamlike.core.results.Result;
import com.steamlike.steamlike.core.results.SuccessResult;
import com.steamlike.steamlike.dataaccess.GamerDao;
import com.steamlike.steamlike.entity.concretes.Gamer;

@Service
public class GamerManager implements GamerService {

	private GamerDao gamerDao;
	private PersonCheckService checkService;
	
	@Autowired
	public GamerManager(GamerDao gamerDao, PersonCheckService checkService) {
		super();
		this.gamerDao = gamerDao;
		this.checkService = checkService;
	}

	@Override
	public Result add(CreateGamerRequest createGamerRequest) {
		
		Gamer gamer = new Gamer();
		gamer.setEmail(createGamerRequest.getEmail());
		gamer.setPassword(createGamerRequest.getPassword());
		gamer.setFirstName(createGamerRequest.getFirstName());
		gamer.setLastName(createGamerRequest.getLastName());
		gamer.setSsn(createGamerRequest.getSsn());
		
		if (!checkService.isPersonExist(gamer))
		{
			return new ErrorResult("Person Does not exist");
		}

		this.gamerDao.save(gamer);
		
		return new SuccessResult("Gamer Saved");
	}

	@Override
	public Result update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete() {
		// TODO Auto-generated method stub
		return null;
	}

}
