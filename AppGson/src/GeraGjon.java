import java.io.FileWriter;

import com.google.gson.Gson;

public class GeraGjon {
	 public static void main(String[] args) {
		
		 Cerveja skol = new Cerveja();
		 
		 skol.setMalte("Puro Malte e xarope");
		 skol.setMarca("Skol");
		 skol.setNome("Skol Ice Blue");
		 skol.setAno(2013);
		 
		 Gson g = new Gson();
		 String json = g.toJson(skol);
		 
		 System.out.println(json);
		 try {
		 FileWriter fw = new FileWriter("cerveja3.json");
		 
		 fw.write(json);
		 fw.close();
		 
		 }catch (Exception e) {
			 
		 }
	}

}
