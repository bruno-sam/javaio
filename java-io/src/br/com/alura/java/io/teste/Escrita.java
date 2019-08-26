package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escrita {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("c:\\Temp\\Escrita.txt");
		
		if(!file.exists()){
			  BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\Temp\\escrita.txt",true));
			 System.out.println("Arquivo criado com sucesso");
						
						int i = 0;
						while(i < 20){
							
							  writer.append("Bruno Bianconcini");
							  writer.newLine();
							i++;
						}
			
		    writer.close();
		}else{
			System.out.println("Arquivo ja existe");
		}
		
		
	
		
	
	
		
		
		
	}
}