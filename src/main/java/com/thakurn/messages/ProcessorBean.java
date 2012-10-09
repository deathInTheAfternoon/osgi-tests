package com.thakurn.messages;

public class ProcessorBean {
	private IProcessor processor;
	public void setProcessor(IProcessor p){
		this.processor = p;
	}
	public String transformIt(String message){
		return this.processor.process(message);
	}
}