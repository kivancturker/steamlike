package com.steamlike.steamlike.core.mernis.abstracts;

import com.steamlike.steamlike.entity.concretes.Gamer;

public interface PersonCheckService {

	boolean isPersonExist(Gamer gamer);
}
