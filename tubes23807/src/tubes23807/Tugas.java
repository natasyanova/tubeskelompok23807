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
public class Tugas{
		private Programmer pelaksana;
		private String namaTugas;
		private int status=0;
		
		public Tugas(Programmer pelaksana, String namaTugas){
			this.pelaksana = pelaksana;
			this.namaTugas = namaTugas;
		}
		
		public Tugas(String namaTugas){
			this.namaTugas = namaTugas;
		}
		
		public void setPelaksana(Programmer p){
			this.pelaksana = p;
		}
		
		public Programmer getPelaksana(){
			return pelaksana;
		}
		
		public String getNamaTugas(){
			return namaTugas;
		}
		
		public void setStatus(int status){
			if (status != 0 && status != 1 ){
				this.status = 0;
			}
			else{
				this.status = status;
			}
		}
		
		public int getStatus(){
			return status;
		}
}
