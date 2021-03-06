package com.steamlike.steamlike.business.abstracts;

import com.steamlike.steamlike.business.requests.CreateGamerRequest;
import com.steamlike.steamlike.core.results.Result;

public interface GamerService {
	
	Result add(CreateGamerRequest createGamerRequest);
	Result update();
	Result delete();
	
}
