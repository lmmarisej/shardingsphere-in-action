package com.tianyilan.shardingsphere.demo.transaction;

import java.sql.SQLException;

public interface TransactionService {
	
	void processWithXA() throws SQLException ;
	
	void processWithBASE() throws SQLException;

}
