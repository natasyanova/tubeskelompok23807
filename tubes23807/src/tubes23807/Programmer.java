/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes23807;

/**
 *
 * @author USERNAME
 */
public class Programmer extends Orang{
		private String id;
		
		public Programmer (String nama, String id){
			super(nama);
			this.id = id;
		}
			
		public Programmer (String nama){
			super(nama);
		}
		
		public void setId(String id){
			this.id = id;
		}
		
		public String getId(){
			return id;
		}
		
		public void setSelesai(Tugas t){
			if (this.id == t.getPelaksana().id ){
				t.setStatus(1);
			}
			else{
				System.out.println("Anda tidak bisa mengubah status tugas ini.");
			}
		}
	
}
