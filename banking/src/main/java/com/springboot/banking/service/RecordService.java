package com.springboot.banking.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.banking.entity.Customer;
import com.springboot.banking.entity.Records;
import com.springboot.banking.exception.CustomerNotFoundException;
import com.springboot.banking.exception.MinBalanceException;
import com.springboot.banking.exception.RecordNotFoundException;
import com.springboot.banking.repository.CustomerRepository;
import com.springboot.banking.repository.RecordRepo;

@Service
public class RecordService {
	@Autowired
	private RecordRepo rr;
	
	@Autowired
	private CustomerService cs;
	
	@Autowired
	private CustomerRepository cr;
	
	public Records saveRecordByAccno(Records r,Long accno) throws CustomerNotFoundException, MinBalanceException
	{
		Customer c=cs.fetchCutomerByAccno(accno);
		// 1 is withdrawl
		if(r.getRecordType()==1)
		{
			c.setBalance(c.getBalance()-r.getAmount());
		}
		else if(r.getRecordType()==2)
		{
			c.setBalance(c.getBalance()+r.getAmount());
		}
		r.setCustomer(c);// setting a customer for a transaction
		cs.saveCustomer(c); // statement for updating customer balnc
		r.setTime(LocalDateTime.now());
		return rr.save(r);// saving the transaction persistantly
		
	}
	
	public Records getRecordByTid(Long tid) throws RecordNotFoundException
	{
		return rr.findById(tid).orElseThrow(()->new RecordNotFoundException(tid));
	}
	
	
	
	
	

}
