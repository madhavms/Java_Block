package com.inapp.noobchain.learn;
import java.util.Date;
public class Block {
	public String hash;
	public String previousHash;
    private String data;
    private long timeStamp;
    
    public Block(String data,String previousHash) {
    	this.data = data;
    	this.previousHash = previousHash;
    	this.timeStamp = new Date().getTime();
    	this.hash = calculateHash(); //Making sure we do this after we set the other values.
    }
    public String calculateHash() {
    	String calculatedhash = StringUtil.applySha256( 
    			previousHash +
    			Long.toString(timeStamp) +
    			data 
    			);
    	return calculatedhash;
    }
}
