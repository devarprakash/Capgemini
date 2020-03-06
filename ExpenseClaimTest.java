/*package com.cg.expensesystem.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.cg.ExpenseManagementSystem.exceptions.ExpenseClaimException;
import com.cg.ExpenseManagementSystem.model.Employee;
import com.cg.ExpenseManagementSystem.model.Expense;
import com.cg.ExpenseManagementSystem.model.ExpenseClaim;
import com.cg.ExpenseManagementSystem.model.Project;
import com.cg.ExpenseManagementSystem.service.ExpenseClaimService;
import com.cg.ExpenseManagementSystem.service.ExpenseClaimServiceImpl;


public class ExpenseClaimTest {

	public ExpenseClaimService claimservice;
	ExpenseClaim claim;
	Employee employee;
	Project project;
	Expense expense;
	

	@Before
	public void init() throws ExpenseClaimException {
		claimservice = new ExpenseClaimServiceImpl();
		expense = new Expense(123,"travelling", "overseas onsite");
		project = new Project(145,"Abcd", "02/10/2012", "02/03/2020");
		employee = new Employee(125,"prakash", "AXPD2465");
		claim = new ExpenseClaim(employee, project, expense,105, 234.00);
		claimservice.addExpenseClaim(claim);

		// mgdl.saveClaim(em.getexpenseCode(), ce);

	}

	@Test
	public void test1() throws ExpenseClaimException {

		assertEquals(claim.getExpenseClaim_Id(),105 );
	}
	
	
	@Test
	public void searchClaimTest() throws ExpenseClaimException {
		assertEquals(claim, claimservice.searchExpenseClaim(claim.getExpenseClaim_Id()));
	}

	@Test
	public void updateClaimTest() throws ExpenseClaimException {
		assertEquals(claim,claimservice.updateExpenseClaim(105,claim));
	}

	@Test
	public void deleteClaimTest()throws ExpenseClaimException {
		assertEquals(true,claimservice.deleteExpenseClaim(claim.getExpenseClaim_Id()));

	}
}
*/