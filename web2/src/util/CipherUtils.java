package util;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;

public class CipherUtils {

	public static String encrypt(String key, String plainText){
		try {
			//암호화키 생성
			Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
			//지정된 암호화 방식으로 암복호화를 수행하는 Cipher 객체 생성
			Cipher cipher = Cipher.getInstance("AES");
			//Cipher 객체 초기화
			cipher.init(Cipher.ENCRYPT_MODE, aesKey);
			//암호화 수행
			byte[] encrypted = cipher.doFinal(plainText.getBytes());
			
			return Hex.encodeHexString(encrypted);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public static String decrypt(String key, String cipherText){
		try {
			//복호화키 생성
			Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
			//지정된 암호화 방식으로 암복호화를 수행하는 Cipher 객체 생성
			Cipher cipher = Cipher.getInstance("AES");
			//Cipher 객체 초기화
			cipher.init(Cipher.DECRYPT_MODE, aesKey);
			//복호화 수행
			byte[] decrypted = cipher.doFinal(Hex.decodeHex(cipherText.toCharArray()));
			
			return new String(decrypted);

		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	public static void main(String[] args) {
		String text = "hello, java";
		String cipherText = CipherUtils.encrypt("zxcv1234zxcv1234", text);
		String plainText = CipherUtils.decrypt("zxcv1234zxcv1234", cipherText);
		System.out.println(cipherText);
		System.out.println(plainText);
	}
}
