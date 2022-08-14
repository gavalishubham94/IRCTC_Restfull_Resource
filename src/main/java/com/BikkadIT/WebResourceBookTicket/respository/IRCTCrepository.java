package com.BikkadIT.WebResourceBookTicket.respository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.WebResourceBookTicket.model.Passanger;

@Repository
public interface IRCTCrepository extends JpaRepository<Passanger, Integer>{

}
