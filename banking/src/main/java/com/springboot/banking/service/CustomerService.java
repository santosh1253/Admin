package com.springboot.banking.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.banking.entity.Customer;
import com.springboot.banking.exception.CustomerNotFoundException;
import com.springboot.banking.exception.MinBalanceException;
import com.springboot.banking.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository crepo;
	public Customer saveCustomer(Customer customer) throws MinBalanceException
	{
		if(customer.getBalance()<1000)
		{
			throw new MinBalanceException();
		}
		return crepo.save(customer);
	}
	public Customer fetchCutomerByAccno(Long accno) throws CustomerNotFoundException
	{
		return crepo.findById(accno).orElseThrow(()->new CustomerNotFoundException(accno));
		
	}
	public Customer updateCustomer(Customer updated) throws CustomerNotFoundException
	{
		Customer c=fetchCutomerByAccno(updated.getAccno());
		c.setAddress(updated.getAddress());
		c.setName(updated.getName());
		c.setDob(updated.getDob());
		c.setIdproof(updated.getIdproof());
		crepo.save(c);
		return c;
	}
	
	public Long deleteCustomer(Long accno) throws CustomerNotFoundException
	{
		Customer c=fetchCutomerByAccno(accno);
		c.setBalance(0);
		crepo.deleteById(accno);
		return accno;
	}
	
	//Service Method for updating password by customer
	public String updatePasswordByAccno(Long accno,String updatedPassword) throws CustomerNotFoundException
	{
		Customer c=fetchCutomerByAccno(accno);
		c.setPassword(updatedPassword);
		return "Customer with "+accno+" password updated successfully";
	}
	
	

}
