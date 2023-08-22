package Modul1.mapper;

import Modul1.dto.MahasiswaDTO;
import Modul1.entity.Mahasiswa;

/**
 * @author nanoy
 * utility class berisi method static untuk 
 * mapping Entity ke Dto dan sebaliknya untuk Student. 
 */
public class MahasiswaMapper {    
    // map Student entity to Student Dto
    public static MahasiswaDTO mapToMahasiswaDTO (Mahasiswa mahasiswa) {
        // Membuat dto dengan builder pattern (inject dari lombok)
        MahasiswaDTO mahasiswaDto = MahasiswaDTO.builder()
                .id(mahasiswa.getId())
                .nama(mahasiswa.getNama())
                .nim(mahasiswa.getNim())
                .jurusan(mahasiswa.getJurusan())
                .tanggalLahir(mahasiswa.getTanggalLahir())
                .build();        
        return mahasiswaDto;
    }    
    // map Student Dto ke Student Entity
    public static Mahasiswa mapToMahasiswa (MahasiswaDTO mahasiswaDto) {
        Mahasiswa mahasiswa = Mahasiswa.builder()
                .id(mahasiswaDto.getId())
                .nama(mahasiswaDto.getNama())
                .nim(mahasiswaDto.getNim())
                .jurusan(mahasiswaDto.getJurusan())
                .tanggalLahir(mahasiswaDto.getTanggalLahir())
                .build();              
        return mahasiswa;
    }
}
