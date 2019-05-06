import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class LerGjon {
	public static void main(String[] args) {
		Gson gson = new Gson();
		
		try {
			BufferedReader arquivoCerveja = new BufferedReader(new FileReader("cerveja.json"));
			
			//Cerveja obj = gson.fromJson(arquivoCerveja, Cerveja.class);
			//System.out.println(obj);
			while (arquivoCerveja.ready()) {
				String arquivoCervejaLer = arquivoCerveja.readLine();
				System.out.println(arquivoCervejaLer);
			}
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}

}
