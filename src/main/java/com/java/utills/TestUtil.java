package com.java.utills;

import org.jasypt.encryption.StringEncryptor;

import com.java.config.CustomJasyptEncryptorConfig;

public class TestUtil {

	public static void main(String[] args) {

		CustomJasyptEncryptorConfig obj = new CustomJasyptEncryptorConfig();
		StringEncryptor stringEncryptor = obj.stringEncryptor();
		String userName = "root";
		String password = "Alex1419$$";
		String encryptedUserName = stringEncryptor.encrypt(userName);
		String encryptedPassword = stringEncryptor.encrypt(password);
		System.out.println("encryptedUserName : " + encryptedUserName);
		System.out.println("encryptedPassword : " + encryptedPassword);

	}
}
