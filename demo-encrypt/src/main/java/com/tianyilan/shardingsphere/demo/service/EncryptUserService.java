package com.tianyilan.shardingsphere.demo.service;

import java.sql.SQLException;
import java.util.List;

import com.tianyilan.shardingsphere.demo.entity.EncryptUser;

public interface EncryptUserService {
	
	void processEncryptUsers() throws SQLException;
	
	List<EncryptUser> getEncryptUsers() throws SQLException;

}
