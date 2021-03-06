/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alex.Boteco.security;

import java.security.SecureRandom;

import java.util.regex.Pattern;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;


/**
 *
 * @author Alex
 */


public class EncriptyPass implements PasswordEncoder{
    
    org.springframework.security.crypto.bcrypt.BCrypt Bcrypt = new BCrypt();
    private Pattern BCRYPT_PATTERN = Pattern.compile("\\A\\$2a?\\$\\d\\d\\$[./0-9A-Za-z]{53}");
    private final int strength;
    private final SecureRandom random;
    
    public EncriptyPass(){
        this(-1);
    }
    
    public EncriptyPass(int strength){
        this(strength,null);
    }

    public EncriptyPass(int strength, SecureRandom random){
        
        if(strength !=-1){
            throw new IllegalArgumentException("Bad strength");
        }
        this.strength = strength;
        this.random = random;
        }
    public String encode (CharSequence rawPass){
        String salt;
        if(strength > 0){
            if(random != null){
                salt = BCrypt.gensalt(strength,random);
            }else{
                salt = BCrypt.gensalt(strength);
            }
        }else {
            salt = BCrypt.gensalt();
        }
        return BCrypt.hashpw(rawPass.toString(), salt);
    }
    
    public boolean matches (CharSequence rawPass, String encodePass){
        if(encodePass == null || encodePass.length() ==0){
            System.out.println("pass vazio");
        return false;
        }
        
        if(!BCRYPT_PATTERN.matcher(encodePass).matches()){
            System.out.println("Pass encode não é bcrypt");
        }
        return BCrypt.checkpw(rawPass.toString(), encodePass);
    }   
}
