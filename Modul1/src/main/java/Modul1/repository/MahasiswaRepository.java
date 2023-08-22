/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul1.repository;

import Modul1.entity.Mahasiswa;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ASUS
 */
public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long> {
    List<Mahasiswa> findByNim(String nim);
    List<Mahasiswa> findByNama(String nama);
    List<Mahasiswa> findByNimContainingOrNamaContaining(String nim, String nama);
}
