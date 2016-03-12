/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes23807;

import java.util.Date;

/**
 *
 * @author USERNAME
 */
public class ManajerProyek {
    private Proyek[] proyek = new Proyek[2];
    private int jumlahProyek;
    private int maksimalProyek = 2;
    
    public void createProyek(int maksimalProgrammer, int maksimalTugas, Date deadline){
        if(jumlahProyek == maksimalProyek){
            System.out.println("Jumlah Proyek Sudah Maksimal Yaitu Dua");
        } else{
            proyek[jumlahProyek++] = new Proyek(maksimalProgrammer, maksimalTugas, deadline);
        }
    }
    public Proyek getProyek(int index){
        if(index <= 1 && index >= 0){
            return proyek[index];
        }
        return null;
    }
    public void removeProyek(int index){
       if(index <= 1 && index >= 0){
            proyek[index] = null;
            jumlahProyek--;
       } else System.out.println("tidak terjadi apa-apa");
    }
    public void addProgrammerTo(Programmer p, int index){
       Proyek proyekDipilih = getProyek(index);
       if(proyekDipilih != null){
           proyekDipilih.addProgrammer(p);
       } else{
           System.out.println("tidak terjadi apa-apa");
       }
    }
    public void removeProgrammerFrom(Programmer p, int index){
       Proyek proyekDipilih = getProyek(index);
       if(proyekDipilih != null){
           proyekDipilih.removeProgrammer(p);
       }
    }
    public void addTugasTo(String namaTugas, int indexProyek){
        Proyek proyekDipilih = getProyek(indexProyek);
        if(proyekDipilih != null){
           proyekDipilih.createTugas(namaTugas);
        }
    }
    public void addProgrammerToTugasAtProyek(Programmer p, int indexTugas, int indexProyek){
        Proyek proyekDipilih = getProyek(indexProyek);
        if(proyekDipilih != null){
           Tugas tugasDipilih = proyekDipilih.getTugas(indexTugas);
           tugasDipilih.setPelaksana(p);
        }
    }
}