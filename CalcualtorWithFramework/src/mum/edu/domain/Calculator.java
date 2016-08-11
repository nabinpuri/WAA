package mum.edu.domain;

import java.io.Serializable;

public class Calculator implements Serializable{
	private static final long serialVersionUID = 748392348L;
	Integer inputadd1;
	Integer inputadd2;
	Integer mul1;
	Integer mul2;
	Integer resultadd;
	Integer resultMul;
	public Integer getInputadd1() {
		return inputadd1;
	}
	public void setInputadd1(Integer inputadd1) {
		this.inputadd1 = inputadd1;
	}
	public Integer getInputadd2() {
		return inputadd2;
	}
	public void setInputadd2(Integer inputadd2) {
		this.inputadd2 = inputadd2;
	}
	public Integer getMul1() {
		return mul1;
	}
	public void setMul1(Integer mul1) {
		this.mul1 = mul1;
	}
	public Integer getMul2() {
		return mul2;
	}
	public void setMul2(Integer mul2) {
		this.mul2 = mul2;
	}
	public Integer getResultadd() {
		return resultadd;
	}
	public void setResultadd(Integer resultadd) {
		this.resultadd = resultadd;
	}
	public Integer getResultMul() {
		return resultMul;
	}
	public void setResultMul(Integer resultMul) {
		this.resultMul = resultMul;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
