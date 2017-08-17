package com.njue.testJFreeChart;
import java.awt.GridLayout;  

import javax.swing.JFrame;  

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("Java数据统计图");  
	    frame.setLayout(new GridLayout(2,2,10,10));  
	    
	 
	   
	    frame.add(new TimeSeriesChart().getChartPanel());    //添加折线图  
	    frame.setBounds(50, 50, 800, 600);  
	    frame.setVisible(true);  
	}

}
